import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * This class contains methods used for tokenization step.
 * 
 * @author tuanphong94
 * @link https://github.com/phongnt570/UETsegmenter/blob/master/src/vn/edu/vnu/uet/nlp/tokenizer/Tokenizer.java
 *
 */
public class Tokenizer {
	/**
	 * @param s
	 * @return List of tokens from s
	 */
	public static List<String> tokenize(String s) {
		if (s == null) {
			return Collections.emptyList();
		}

		s = s.trim();
		if (s.isEmpty()) {
			return Collections.emptyList();
		}

                // after building an ArrayDeque like this, the first token returned by pop() is the first piece of the split
                // we use this as a stack to avoid recursion, which can overwhelm the call stack on long tokens.
                // the plan is that instead of recursing on the beginning of a token, the middle of a token,
                // and the end of a token when there is a split in the middle, we put all three on the stack
                // and keep popping from the stack until processing is finished
		ArrayDeque<String> tempTokens = new ArrayDeque<String>(Arrays.asList(s.split("\\s+")));
                // keep track of any tokens on the stack which are already processed
                // will save some time to reprocess them (may need to test that assumption)
		ArrayDeque<Integer> processedTokens = new ArrayDeque<Integer>();

		ArrayList<String> tokens = new ArrayList<String>(tempTokens.size());

		while (tempTokens.size() > 0) {
			String token = tempTokens.pop();
			if (processedTokens.size() > 0 && tempTokens.size() == processedTokens.peek()) {
				tokens.add(token);
				processedTokens.pop();
				continue;
			}

                        if (token.length() == 0) {
				continue;
                        }
			if (token.length() == 1 || !StringUtils.hasPunctuation(token)) {
				tokens.add(token);
				continue;
			}

			// will remove the "," from the end of the token and "recurse"
			if (token.endsWith(",")) {
				processedTokens.push(tempTokens.size());
				tempTokens.push(",");

                                // the calls to trim() are because splitting on \\s doesn't
                                // take into account all of the characters removed by trim()
                                // one place this is noticeable is in the Oscar Common Crawl
                                // dataset, where some backspace characters show up
                                // and would be tokenized differently without the trim()
				tempTokens.push(token.substring(0, token.length() - 1).trim());
				continue;
			}

			if (StringUtils.VN_abbreviation.contains(token)) {
				tokens.add(token);
				continue;
			}

			if (token.endsWith(".") && Character.isAlphabetic(token.charAt(token.length() - 2))) {
				if ((token.length() == 2 && Character.isUpperCase(token.charAt(token.length() - 2))) || (Regex.SHORT_NAME_PATTERN.matcher(token).find())) {
					tokens.add(token);
					continue;
				}
				processedTokens.push(tempTokens.size());
				tempTokens.push(".");

				tempTokens.push(token.substring(0, token.length() - 1).trim());
				continue;
			}

			if (StringUtils.VN_exception.contains(token)) {
				tokens.add(token);
				continue;
			}

			boolean tokenContainsAbb = false;
			for (String e : StringUtils.VN_abbreviation) {
				int i = token.indexOf(e);
				if (i < 0)
					continue;

				tokenContainsAbb = true;
				recursive(tempTokens, processedTokens, token, i, i + e.length());
				break;
			}
			if (tokenContainsAbb)
				continue;

			boolean tokenContainsExp = false;
			for (String e : StringUtils.VN_exception) {
				int i = token.indexOf(e);
				if (i < 0)
					continue;

				tokenContainsExp = true;
				recursive(tempTokens, processedTokens, token, i, i + e.length());
				break;
			}
			if (tokenContainsExp)
				continue;

			List<Pattern> regexes = Regex.getRegexList();

			boolean matching = false;
			for (Pattern regex : regexes) {
				if (regex.matcher(token).matches()) {
					tokens.add(token);
					matching = true;
					break;
				}
			}
			if (matching) {
				continue;
			}

			for (Pattern pattern : regexes) {
				Matcher matcher = pattern.matcher(token);

				if (matcher.find()) {
					if (pattern == Regex.URL_PATTERN) {
						String[] elements = token.split(Pattern.quote("."));
						boolean hasURL = true;
						for (String ele : elements) {
							if (ele.length() == 1 && Character.isUpperCase(ele.charAt(0))) {
								hasURL = false;
								break;
							}
							for (int j = 0; j < ele.length(); j++) {
								if (ele.charAt(j) >= 128) {
									hasURL = false;
									break;
								}
							}
						}
						if (hasURL) {
							recursive(tempTokens, processedTokens, token, matcher.start(), matcher.end());
						} else {
							continue;
						}
					}

					else if (pattern == Regex.MONTH_PATTERN) {
						int start = matcher.start();

						boolean hasLetter = false;

						for (int j = 0; j < start; j++) {
							if (Character.isLetter(token.charAt(j))) {
								recursive(tempTokens, processedTokens, token, matcher.start(), matcher.end());
								hasLetter = true;
								break;
							}
						}

						if (!hasLetter) {
							tokens.add(token);
						}
					}

					else {
						recursive(tempTokens, processedTokens, token, matcher.start(), matcher.end());
					}

					matching = true;
					break;
				}
			}

			if (!matching) {
				tokens.add(token);
			}
		}

		return tokens;
	}

	private static void recursive(Deque<String> tempTokens, Deque<Integer> processedTokens, String token, int beginMatch, int endMatch) {
		if (endMatch < token.length()) {
			tempTokens.push(token.substring(endMatch).trim());
		}

		processedTokens.push(tempTokens.size());
		tempTokens.push(token.substring(beginMatch, endMatch));

		if (beginMatch > 0) {
			tempTokens.push(token.substring(0, beginMatch).trim());
		}
	}

	public static List<String> joinSentences(List<String> tokens) {
		List<String> sentences = new ArrayList<>();

		List<String> sentence = new ArrayList<>();
		for (int i = 0; i < tokens.size(); i++) {
			String token = tokens.get(i);
			String nextToken = null;
			if (i != tokens.size() - 1) {
				nextToken = tokens.get(i + 1);
			}
			String beforeToken = null;
			if (i > 0) {
				beforeToken = tokens.get(i - 1);
			}

			sentence.add(token);

			if (i == tokens.size() - 1) {
				sentences.add(joinSentence(sentence));
				return sentences;
			}

			if (i < tokens.size() - 2 && token.equals(StringConst.COLON)) {
				if (Character.isDigit(nextToken.charAt(0)) && tokens.get(i + 2).equals(StringConst.STOP)
						|| tokens.get(i + 2).equals(StringConst.COMMA)) {
					sentences.add(joinSentence(sentence));
					sentence.clear();
					continue;
				}
			}

			if (token.matches(Regex.EOS_PUNCTUATION)) {

                // Added by Dat Quoc Nguyen
                if (nextToken.equals("\"") || nextToken.equals("''")) {
                    int count = 0;
                    for (String senToken : sentence) {
                        if (senToken.equals("\"") || senToken.equals("''"))
                            count += 1;
                    }
                    if (count % 2 == 1)
                        continue;
                }

				// If the current sentence is in the quote or in the brace
				if (StringUtils.isBrace(nextToken) || nextToken.isEmpty() || Character.isLowerCase(nextToken.charAt(0))
						|| nextToken.equals(StringConst.COMMA) || Character.isDigit(nextToken.charAt(0))) {
					continue;
				}

				// Sentence starts with its order number
				if (sentence.size() == 2 && token.equals(StringConst.STOP)) {
					if (Character.isDigit(beforeToken.charAt(0))) {
						continue;
					}
					if (Character.isLowerCase(beforeToken.charAt(0))) {
						continue;
					}
					if (Character.isUpperCase(beforeToken.charAt(0))) {
						if (beforeToken.length() == 1) {
							continue;
						}
					}
				}

				sentences.add(joinSentence(sentence));
				sentence.clear();
			}
		}

		return sentences;
	}

	public static String joinSentence(List<String> tokens) {
		StringBuffer sent = new StringBuffer();
		int length = tokens.size();
		String token;
		for (int i = 0; i < length; i++) {
			token = tokens.get(i);
			if (token.isEmpty() || token == null || token.equals(StringConst.SPACE)) {
				continue;
			}
			sent.append(token);
			if (i < length - 1)
				sent.append(StringConst.SPACE);
		}
		return sent.toString().trim();
	}
}

interface StringConst
{
    public static final String BOS = "<s>";
    public static final String EOS = "</s>";

    public static final String SPACE = " ";
    public static final String COMMA = ",";
    public static final String STOP = ".";
    public static final String COLON = ":";
    public static final String UNDERSCORE = "_";
}

class StringUtils
{

    public static void testFoundByRegex(String s, String regex)
    {
        System.out.println("Test string: " + s);

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            System.out.println(s.substring(0, matcher.start()));
            System.out.println(s.substring(matcher.start(), matcher.end()));
            System.out.println(s.substring(matcher.end()));
        }
    }

    public static String char2Hex(Character c)
    {
        return String.format("\\u%04x", (int) c);
    }

    public static Character hex2Char(String hex)
    {
        int hexToInt = Integer.parseInt(hex.substring(2), 16);
        return (char) hexToInt;
    }

    public static boolean hasPunctuation(String s)
    {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i)))
                return true;
        }

        return false;
    }

    // Modified by Dat Quoc Nguyen
    public static boolean isBrace(String string)
    {
        if (string.equals("”") || string.equals("�") || string.equals("'") || string.equals(")")
                || string.equals("}") || string.equals("]")) {
            return true;
        }
        return false;
    }

    public static HashSet<String> VN_abbreviation;
    public static HashSet<String> VN_exception;
    static {
        VN_abbreviation = new HashSet<String>();
        VN_exception = new HashSet<String>();

        VN_abbreviation.add("M.City");
        VN_abbreviation.add("V.I.P");
        VN_abbreviation.add("PGS.Ts");
        VN_abbreviation.add("MRS.");
        VN_abbreviation.add("Mrs.");
        VN_abbreviation.add("Man.United");
        VN_abbreviation.add("Mr.");
        VN_abbreviation.add("SHB.ĐN");
        VN_abbreviation.add("Gs.Bs");
        VN_abbreviation.add("U.S.A");
        VN_abbreviation.add("TMN.CSG");
        VN_abbreviation.add("Kts.Ts");
        VN_abbreviation.add("R.Madrid");
        VN_abbreviation.add("Tp.");
        VN_abbreviation.add("T.Ư");
        VN_abbreviation.add("D.C");
        VN_abbreviation.add("Gs.Tskh");
        VN_abbreviation.add("PGS.KTS");
        VN_abbreviation.add("GS.BS");
        VN_abbreviation.add("KTS.TS");
        VN_abbreviation.add("PGS-TS");
        VN_abbreviation.add("Co.");
        VN_abbreviation.add("S.H.E");
        VN_abbreviation.add("Ths.Bs");
        VN_abbreviation.add("T&T.HN");
        VN_abbreviation.add("MR.");
        VN_abbreviation.add("Ms.");
        VN_abbreviation.add("T.T.P");
        VN_abbreviation.add("TT.");
        VN_abbreviation.add("TP.");
        VN_abbreviation.add("ĐH.QGHN");
        VN_abbreviation.add("Gs.Kts");
        VN_abbreviation.add("Man.Utd");
        VN_abbreviation.add("GD-ĐT");
        VN_abbreviation.add("T.W");
        VN_abbreviation.add("Corp.");
        VN_abbreviation.add("ĐT.LA");
        VN_abbreviation.add("Dr.");
        VN_abbreviation.add("T&T");
        VN_abbreviation.add("HN.ACB");
        VN_abbreviation.add("GS.KTS");
        VN_abbreviation.add("MS.");
        VN_abbreviation.add("Prof.");
        VN_abbreviation.add("GS.TS");
        VN_abbreviation.add("PGs.Ts");
        VN_abbreviation.add("PGS.BS");
        VN_abbreviation.add("﻿BT.");
        VN_abbreviation.add("Ltd.");
        VN_abbreviation.add("ThS.BS");
        VN_abbreviation.add("Gs.Ts");
        VN_abbreviation.add("SL.NA");
        //VN_abbreviation.add("P.");
        VN_abbreviation.add("Th.S");
        VN_abbreviation.add("Gs.Vs");
        VN_abbreviation.add("PGs.Bs");
        VN_abbreviation.add("T.O.P");
        VN_abbreviation.add("PGS.TS");
        VN_abbreviation.add("HN.T&T");
        VN_abbreviation.add("SG.XT");
        VN_abbreviation.add("O.T.C");
        VN_abbreviation.add("TS.BS");
        VN_abbreviation.add("Yahoo!");
        VN_abbreviation.add("Man.City");
        VN_abbreviation.add("MISS.");
        VN_abbreviation.add("HA.GL");
        VN_abbreviation.add("GS.Ts");
        VN_abbreviation.add("TBT.");
        VN_abbreviation.add("GS.VS");
        VN_abbreviation.add("GS.TSKH");
        VN_abbreviation.add("Ts.Bs");
        VN_abbreviation.add("M.U");
        VN_abbreviation.add("Gs.TSKH");
        VN_abbreviation.add("U.S");
        VN_abbreviation.add("Miss.");
        VN_abbreviation.add("GD.ĐT");
        VN_abbreviation.add("PGs.Kts");
        //VN_abbreviation.add("Q.");
        VN_abbreviation.add("St.");
        VN_abbreviation.add("Ng.");
        VN_abbreviation.add("Inc.");
        VN_abbreviation.add("Th.");
        VN_abbreviation.add("N.O.V.A");

        VN_exception.add("Wi-fi");
        VN_exception.add("17+");
        VN_exception.add("km/h");
        VN_exception.add("M7");
        VN_exception.add("M8");
        VN_exception.add("21+");
        VN_exception.add("G3");
        VN_exception.add("M9");
        VN_exception.add("G4");
        VN_exception.add("km3");
        VN_exception.add("m/s");
        VN_exception.add("km2");
        VN_exception.add("5g");
        VN_exception.add("4G");
        VN_exception.add("8K");
        VN_exception.add("3g");
        VN_exception.add("E9");
        VN_exception.add("U21");
        VN_exception.add("4K");
        VN_exception.add("U23");
        VN_exception.add("Z1");
        VN_exception.add("Z2");
        VN_exception.add("Z3");
        VN_exception.add("Z4");
        VN_exception.add("Z5");
        VN_exception.add("Jong-un");
        VN_exception.add("u19");
        VN_exception.add("5s");
        VN_exception.add("wi-fi");
        VN_exception.add("18+");
        VN_exception.add("Wi-Fi");
        VN_exception.add("m2");
        VN_exception.add("16+");
        VN_exception.add("m3");
        VN_exception.add("V-League");
        VN_exception.add("Geun-hye");
        VN_exception.add("5G");
        VN_exception.add("4g");
        VN_exception.add("Z3+");
        VN_exception.add("3G");
        VN_exception.add("km/s");
        VN_exception.add("6+");
        VN_exception.add("u21");
        VN_exception.add("WI-FI");
        VN_exception.add("u23");
        VN_exception.add("U19");
        VN_exception.add("6s");
        VN_exception.add("4s");
    }

}

class Regex
{

    public static final String ELLIPSIS = "\\.{2,}";

    public static final String EMAIL = "([\\w\\d_\\.-]+)@(([\\d\\w-]+)\\.)*([\\d\\w-]+)";

    public static final String FULL_DATE = "(0?[1-9]|[12][0-9]|3[01])(\\/|-|\\.)(1[0-2]|(0?[1-9]))((\\/|-|\\.)\\d{4})";

    public static final String MONTH = "(1[0-2]|(0?[1-9]))(\\/)\\d{4}";
    public static final Pattern MONTH_PATTERN = Pattern.compile(MONTH);

    public static final String DATE = "(0?[1-9]|[12][0-9]|3[01])(\\/)(1[0-2]|(0?[1-9]))";

    public static final String TIME = "(\\d\\d:\\d\\d:\\d\\d)|((0?\\d|1\\d|2[0-3])(:|h)(0?\\d|[1-5]\\d)(’|'|p|ph)?)";

    public static final String MONEY = "\\p{Sc}\\d+([\\.,]\\d+)*|\\d+([\\.,]\\d+)*\\p{Sc}";

    public static final String PHONE_NUMBER = "(\\(?\\+\\d{1,2}\\)?[\\s\\.-]?)?\\d{2,}[\\s\\.-]?\\d{3,}[\\s\\.-]?\\d{3,}";

    public static final String URL = "(((https?|ftp):\\/\\/|www\\.)[^\\s/$.?#].[^\\s]*)|(https?:\\/\\/)?(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&//=]*)";
    public static final Pattern URL_PATTERN = Pattern.compile(URL);

    public static final String NUMBER = "[-+]?\\d+([\\.,]\\d+)*%?\\p{Sc}?";

    public static final String PUNCTUATION = ",|\\.|:|\\?|!|;|-|_|\"|'|“|”|\\||\\(|\\)|\\[|\\]|\\{|\\}|âŸ¨|âŸ©|Â«|Â»|\\\\|\\/|\\â€˜|\\â€™|\\â€œ|\\â€�|â€¦|…|‘|’|·";

    public static final String SPECIAL_CHAR = "\\~|\\@|\\#|\\^|\\&|\\*|\\+|\\-|\\â€“|<|>|\\|";

    public static final String EOS_PUNCTUATION = "(\\.+|\\?|!|…)";

    public static final String NUMBERS_EXPRESSION = NUMBER + "([\\+\\-\\*\\/]" + NUMBER + ")*";

    //public static final String SHORT_NAME = "[\\p{Upper}]\\.([\\p{L}\\p{Upper}])*";
    public static final String SHORT_NAME = "([\\p{L}]+([\\.\\-][\\p{L}]+)+)|([\\p{L}]+-\\d+)";
    public static final Pattern SHORT_NAME_PATTERN = Pattern.compile(SHORT_NAME);

    public static final String ALLCAP = "[A-Z]+\\.[A-Z]+";

    private static List<Pattern> regexes = Arrays.asList(
        Pattern.compile(ELLIPSIS),
        Pattern.compile(EMAIL),
        URL_PATTERN,
        Pattern.compile(FULL_DATE),
        MONTH_PATTERN,
        Pattern.compile(DATE),
        Pattern.compile(TIME),
        Pattern.compile(MONEY),
        Pattern.compile(PHONE_NUMBER),
        SHORT_NAME_PATTERN,
        Pattern.compile(NUMBERS_EXPRESSION),
        Pattern.compile(NUMBER),
        Pattern.compile(PUNCTUATION),
        Pattern.compile(SPECIAL_CHAR),
        Pattern.compile(ALLCAP));

    public static List<Pattern> getRegexList()
    {
        return regexes;
    }
}
