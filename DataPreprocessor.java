import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;

/**
 * @author DatQuocNguyen
 * 
 */
public class DataPreprocessor {
	private RDRsegmenter initialSegmenter;

	public DataPreprocessor() throws IOException {
		initialSegmenter = new RDRsegmenter();
	}

	public String getStringInitialSegmentation(String str) throws IOException {
		StringBuilder sb = new StringBuilder();
		String line = str.trim();
		if (line.length() == 0) {
			return "\n";
		}

		List<WordTag> wordtags = initialSegmenter.getInitialSegmentation(line);

		int size = wordtags.size();
		for (int i = 0; i < size; i++) {
			if (wordtags.get(i).tag.equals("B"))
				sb.append(wordtags.get(i).form + "/B ");
			else
				sb.append(wordtags.get(i).form + "/I ");
		}
		return sb.toString().trim();
	}

	public void getCorpusInitialSegmentation(String inFilePath) throws IOException {
		BufferedReader buffer = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File(inFilePath)), "UTF-8"));

		BufferedWriter bwInit = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(inFilePath + ".RAW.Init"), "UTF-8"));
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(inFilePath + ".BI"), "UTF-8"));

		for (String line; (line = buffer.readLine()) != null;) {

			String lineStr = line;
			for (String regex : Utils.NORMALIZER_KEYS)
				if (lineStr.contains(regex))
					lineStr = lineStr.replaceAll(regex, Utils.NORMALIZER.get(regex));

			StringBuilder sb = new StringBuilder();

			String[] words = lineStr.split("\\s+");
			for (String word : words) {
				String[] syllabels = word.split("_");
				bw.write(syllabels[0] + "/B ");
				sb.append(syllabels[0] + " ");
				for (int i = 1; i < syllabels.length; i++) {
					bw.write(syllabels[i] + "/I ");
					sb.append(syllabels[i] + " ");
				}
			}
			bw.write("\n");

			bwInit.write(getStringInitialSegmentation(sb.toString()) + "\n");
		}

		buffer.close();
		bwInit.close();
		bw.close();

	}

	public static void main(String[] args) throws IOException {
		DataPreprocessor segmenter = new DataPreprocessor();
		segmenter.getCorpusInitialSegmentation(args[0]);
	}

}
