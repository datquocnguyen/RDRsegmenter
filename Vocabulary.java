import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unchecked")
public class Vocabulary
{
    public static Set<String> VN_DICT;
    static {
        VN_DICT = new HashSet<String>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("VnVocab"));
            VN_DICT = (Set<String>) ois.readObject();
            ois.close();
        }
        catch (IOException | ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        // BufferedReader buffer;
        // try {
        // buffer = new BufferedReader(new InputStreamReader(
        // new FileInputStream(new File("VnVocab.txt")), "UTF-8"));
        // for (String line; (line = buffer.readLine()) != null;) {
        // line = line.trim();
        // if (line.contains(" "))
        // VN_DICT.add(line);
        // }
        // buffer.close();
        // }
        // catch (FileNotFoundException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
    }

    public static Set<String> VN_LOCATIONS;
    static {
        VN_LOCATIONS = new HashSet<String>();
        VN_LOCATIONS.add("mỹ tho");
        VN_LOCATIONS.add("nam đông");
        VN_LOCATIONS.add("kiên lương");
        VN_LOCATIONS.add("lương sơn");
        VN_LOCATIONS.add("gò vấp");
        VN_LOCATIONS.add("quang bình");
        VN_LOCATIONS.add("ia pa");
        VN_LOCATIONS.add("lạc sơn");
        VN_LOCATIONS.add("chí linh");
        VN_LOCATIONS.add("ninh hải");
        VN_LOCATIONS.add("sơn dương");
        VN_LOCATIONS.add("quan sơn");
        VN_LOCATIONS.add("ứng hoà");
        VN_LOCATIONS.add("krông pắk");
        VN_LOCATIONS.add("tân hưng");
        VN_LOCATIONS.add("nghệ an");
        VN_LOCATIONS.add("tân thạnh");
        VN_LOCATIONS.add("yên định");
        VN_LOCATIONS.add("mường nhé");
        VN_LOCATIONS.add("ngô quyền");
        VN_LOCATIONS.add("hàm thuận bắc");
        VN_LOCATIONS.add("phú tân");
        VN_LOCATIONS.add("tân hồng");
        VN_LOCATIONS.add("trà ôn");
        VN_LOCATIONS.add("từ liêm");
        VN_LOCATIONS.add("bình thuận");
        VN_LOCATIONS.add("an phú");
        VN_LOCATIONS.add("duy xuyên");
        VN_LOCATIONS.add("nam trực");
        VN_LOCATIONS.add("phù cừ");
        VN_LOCATIONS.add("mai sơn");
        VN_LOCATIONS.add("thạnh phú");
        VN_LOCATIONS.add("lộc bình");
        VN_LOCATIONS.add("kim thành");
        VN_LOCATIONS.add("cái bè");
        VN_LOCATIONS.add("hà quảng");
        VN_LOCATIONS.add("long thành");
        VN_LOCATIONS.add("đồng phù");
        VN_LOCATIONS.add("bảo yên");
        VN_LOCATIONS.add("chiêm hoá");
        VN_LOCATIONS.add("gia nghĩa");
        VN_LOCATIONS.add("an dương");
        VN_LOCATIONS.add("phú quý");
        VN_LOCATIONS.add("quảng trạch");
        VN_LOCATIONS.add("trường sa");
        VN_LOCATIONS.add("hoàn kiếm");
        VN_LOCATIONS.add("thủ thừa");
        VN_LOCATIONS.add("hải lăng");
        VN_LOCATIONS.add("pleiku");
        VN_LOCATIONS.add("thanh hoá");
        VN_LOCATIONS.add("bạch thông");
        VN_LOCATIONS.add("vĩnh phúc");
        VN_LOCATIONS.add("vãn lãng");
        VN_LOCATIONS.add("bình gia");
        VN_LOCATIONS.add("sa thầy");
        VN_LOCATIONS.add("triệu sơn");
        VN_LOCATIONS.add("yên thuỷ");
        VN_LOCATIONS.add("văn giang");
        VN_LOCATIONS.add("hồ chí minh");
        VN_LOCATIONS.add("nga sơn");
        VN_LOCATIONS.add("gia lâm");
        VN_LOCATIONS.add("vị thanh");
        VN_LOCATIONS.add("cái răng");
        VN_LOCATIONS.add("cao bằng");
        VN_LOCATIONS.add("hoài ân");
        VN_LOCATIONS.add("vĩnh long");
        VN_LOCATIONS.add("kim động");
        VN_LOCATIONS.add("ngân sơn");
        VN_LOCATIONS.add("lấp vò");
        VN_LOCATIONS.add("sông công");
        VN_LOCATIONS.add("hoài nhơn");
        VN_LOCATIONS.add("kim bôi");
        VN_LOCATIONS.add("bắc ninh");
        VN_LOCATIONS.add("thái nguyên");
        VN_LOCATIONS.add("đơn dương");
        VN_LOCATIONS.add("định quán");
        VN_LOCATIONS.add("gò công");
        VN_LOCATIONS.add("hà giang");
        VN_LOCATIONS.add("hoà bình");
        VN_LOCATIONS.add("mèo vạc");
        VN_LOCATIONS.add("mộc châu");
        VN_LOCATIONS.add("quảng ngãi");
        VN_LOCATIONS.add("cẩm giàng");
        VN_LOCATIONS.add("sông hinh");
        VN_LOCATIONS.add("thới bình");
        VN_LOCATIONS.add("phụng hiệp");
        VN_LOCATIONS.add("ninh hoà");
        VN_LOCATIONS.add("hậu giang");
        VN_LOCATIONS.add("cái nước");
        VN_LOCATIONS.add("ô môn");
        VN_LOCATIONS.add("gia lai");
        VN_LOCATIONS.add("phổ yên");
        VN_LOCATIONS.add("quế sơn");
        VN_LOCATIONS.add("yên thành");
        VN_LOCATIONS.add("tiên du");
        VN_LOCATIONS.add("an minh");
        VN_LOCATIONS.add("chợ lách");
        VN_LOCATIONS.add("phú ninh");
        VN_LOCATIONS.add("tủa chùa");
        VN_LOCATIONS.add("hương trà");
        VN_LOCATIONS.add("thăng bình");
        VN_LOCATIONS.add("vĩnh thuận");
        VN_LOCATIONS.add("hà tĩnh");
        VN_LOCATIONS.add("lâm đồng");
        VN_LOCATIONS.add("phú quốc");
        VN_LOCATIONS.add("long mỹ");
        VN_LOCATIONS.add("long an");
        VN_LOCATIONS.add("bình lục");
        VN_LOCATIONS.add("vĩnh thạnh");
        VN_LOCATIONS.add("đống đa");
        VN_LOCATIONS.add("hạ long");
        VN_LOCATIONS.add("kỳ sơn");
        VN_LOCATIONS.add("đăk song");
        VN_LOCATIONS.add("lai vung");
        VN_LOCATIONS.add("ý yên");
        VN_LOCATIONS.add("xuyên mộc");
        VN_LOCATIONS.add("vị xuyên");
        VN_LOCATIONS.add("duy tiên");
        VN_LOCATIONS.add("khánh sơn");
        VN_LOCATIONS.add("bỉm sơn");
        VN_LOCATIONS.add("hiệp đức");
        VN_LOCATIONS.add("kim sơn");
        VN_LOCATIONS.add("xín mần");
        VN_LOCATIONS.add("hương thuỷ");
        VN_LOCATIONS.add("tuy hoà");
        VN_LOCATIONS.add("u minh");
        VN_LOCATIONS.add("thiệu hoá");
        VN_LOCATIONS.add("bù đốp");
        VN_LOCATIONS.add("yên sơn");
        VN_LOCATIONS.add("quảng xương");
        VN_LOCATIONS.add("cần đước");
        VN_LOCATIONS.add("thuỷ nguyên");
        VN_LOCATIONS.add("yên dũng");
        VN_LOCATIONS.add("yên hưng");
        VN_LOCATIONS.add("bắc mê");
        VN_LOCATIONS.add("thọ xuân");
        VN_LOCATIONS.add("móng cái");
        VN_LOCATIONS.add("lạc dương");
        VN_LOCATIONS.add("cẩm xuyên");
        VN_LOCATIONS.add("lâm thao");
        VN_LOCATIONS.add("bình tân");
        VN_LOCATIONS.add("phúc yên");
        VN_LOCATIONS.add("sơn tây");
        VN_LOCATIONS.add("vĩnh châu");
        VN_LOCATIONS.add("na hang");
        VN_LOCATIONS.add("chương mỹ");
        VN_LOCATIONS.add("bảo lộc");
        VN_LOCATIONS.add("nghi xuân");
        VN_LOCATIONS.add("lương tài");
        VN_LOCATIONS.add("thoại sơn");
        VN_LOCATIONS.add("cửa lò");
        VN_LOCATIONS.add("đông hưng");
        VN_LOCATIONS.add("lập thạch");
        VN_LOCATIONS.add("nam định");
        VN_LOCATIONS.add("quảng nam");
        VN_LOCATIONS.add("kiên hải");
        VN_LOCATIONS.add("đồng xuân");
        VN_LOCATIONS.add("phú xuyên");
        VN_LOCATIONS.add("tiểu cần");
        VN_LOCATIONS.add("phúc thọ");
        VN_LOCATIONS.add("đông giang");
        VN_LOCATIONS.add("gò dầu");
        VN_LOCATIONS.add("giá rai");
        VN_LOCATIONS.add("tây sơn");
        VN_LOCATIONS.add("phú hoà");
        VN_LOCATIONS.add("việt yên");
        VN_LOCATIONS.add("đak đoa");
        VN_LOCATIONS.add("mường la");
        VN_LOCATIONS.add("hồng ngự");
        VN_LOCATIONS.add("bắc bình");
        VN_LOCATIONS.add("phủ lý");
        VN_LOCATIONS.add("gio linh");
        VN_LOCATIONS.add("cồn cỏ");
        VN_LOCATIONS.add("đức linh");
        VN_LOCATIONS.add("củ chi");
        VN_LOCATIONS.add("hương sơn");
        VN_LOCATIONS.add("tịnh biên");
        VN_LOCATIONS.add("bình thuỷ");
        VN_LOCATIONS.add("nhà bè");
        VN_LOCATIONS.add("yên thế");
        VN_LOCATIONS.add("vĩnh tường");
        VN_LOCATIONS.add("kế sách");
        VN_LOCATIONS.add("sóc sơn");
        VN_LOCATIONS.add("chợ đồn");
        VN_LOCATIONS.add("châu phú");
        VN_LOCATIONS.add("kiến an");
        VN_LOCATIONS.add("sốp cộp");
        VN_LOCATIONS.add("lệ thuỷ");
        VN_LOCATIONS.add("sơn tịnh");
        VN_LOCATIONS.add("càng long");
        VN_LOCATIONS.add("vị thuỷ");
        VN_LOCATIONS.add("ea súp");
        VN_LOCATIONS.add("quảng điền");
        VN_LOCATIONS.add("nghĩa lộ");
        VN_LOCATIONS.add("đồ sơn");
        VN_LOCATIONS.add("krông pa");
        VN_LOCATIONS.add("việt trì");
        VN_LOCATIONS.add("tân thành");
        VN_LOCATIONS.add("nghĩa hưng");
        VN_LOCATIONS.add("bạc liêu");
        VN_LOCATIONS.add("hưng yên");
        VN_LOCATIONS.add("hoàng mai");
        VN_LOCATIONS.add("diên khánh");
        VN_LOCATIONS.add("lăk");
        VN_LOCATIONS.add("bắc trà my");
        VN_LOCATIONS.add("tân châu");
        VN_LOCATIONS.add("tân phú");
        VN_LOCATIONS.add("bình long");
        VN_LOCATIONS.add("đông hà");
        VN_LOCATIONS.add("kon plông");
        VN_LOCATIONS.add("sa đéc");
        VN_LOCATIONS.add("an lão");
        VN_LOCATIONS.add("như xuân");
        VN_LOCATIONS.add("bến lức");
        VN_LOCATIONS.add("thanh khê");
        VN_LOCATIONS.add("long xuyên");
        VN_LOCATIONS.add("chợ gạo");
        VN_LOCATIONS.add("lục nam");
        VN_LOCATIONS.add("hoà thành");
        VN_LOCATIONS.add("vũng liêm");
        VN_LOCATIONS.add("bình định");
        VN_LOCATIONS.add("cẩm mỹ");
        VN_LOCATIONS.add("mộc hoá");
        VN_LOCATIONS.add("tánh linh");
        VN_LOCATIONS.add("đất đỏ");
        VN_LOCATIONS.add("quế võ");
        VN_LOCATIONS.add("trấn yên");
        VN_LOCATIONS.add("cầu ngang");
        VN_LOCATIONS.add("lai châu");
        VN_LOCATIONS.add("gò công tây");
        VN_LOCATIONS.add("lý nhân");
        VN_LOCATIONS.add("bà rịa-vũng tàu");
        VN_LOCATIONS.add("bình giang");
        VN_LOCATIONS.add("mường khương");
        VN_LOCATIONS.add("gò quao");
        VN_LOCATIONS.add("bình đại");
        VN_LOCATIONS.add("điện bàn");
        VN_LOCATIONS.add("hải châu");
        VN_LOCATIONS.add("bắc giang");
        VN_LOCATIONS.add("văn lâm");
        VN_LOCATIONS.add("ninh thuận");
        VN_LOCATIONS.add("cô tô");
        VN_LOCATIONS.add("quảng uyên");
        VN_LOCATIONS.add("đông hải");
        VN_LOCATIONS.add("phan thiết");
        VN_LOCATIONS.add("tĩnh gia");
        VN_LOCATIONS.add("bạch long vĩ");
        VN_LOCATIONS.add("hoài đức");
        VN_LOCATIONS.add("la gi");
        VN_LOCATIONS.add("ngọc hồi");
        VN_LOCATIONS.add("bình sơn");
        VN_LOCATIONS.add("dương minh châu");
        VN_LOCATIONS.add("can lộc");
        VN_LOCATIONS.add("hồng bàng");
        VN_LOCATIONS.add("thanh miện");
        VN_LOCATIONS.add("trảng bàng");
        VN_LOCATIONS.add("thái bình");
        VN_LOCATIONS.add("hải dương");
        VN_LOCATIONS.add("hà tây");
        VN_LOCATIONS.add("krông nô");
        VN_LOCATIONS.add("tam đường");
        VN_LOCATIONS.add("nguyên bình");
        VN_LOCATIONS.add("thủ dầu một");
        VN_LOCATIONS.add("vĩnh lộc");
        VN_LOCATIONS.add("đăk r'lấp");
        VN_LOCATIONS.add("hai bà trưng");
        VN_LOCATIONS.add("long khánh");
        VN_LOCATIONS.add("bình liêu");
        VN_LOCATIONS.add("đồng hỷ");
        VN_LOCATIONS.add("võ nhai");
        VN_LOCATIONS.add("lạc thuỷ");
        VN_LOCATIONS.add("quỳnh phụ");
        VN_LOCATIONS.add("diễn châu");
        VN_LOCATIONS.add("cầu giấy");
        VN_LOCATIONS.add("sơn la");
        VN_LOCATIONS.add("sông mã");
        VN_LOCATIONS.add("kinh môn");
        VN_LOCATIONS.add("thạch thành");
        VN_LOCATIONS.add("ea kar");
        VN_LOCATIONS.add("krông búk");
        VN_LOCATIONS.add("gò công đông");
        VN_LOCATIONS.add("phù ninh");
        VN_LOCATIONS.add("sơn hà");
        VN_LOCATIONS.add("đạ tẻh");
        VN_LOCATIONS.add("mộ đức");
        VN_LOCATIONS.add("cờ đỏ");
        VN_LOCATIONS.add("hương khê");
        VN_LOCATIONS.add("phú lương");
        VN_LOCATIONS.add("di linh");
        VN_LOCATIONS.add("phú vang");
        VN_LOCATIONS.add("lạng giang");
        VN_LOCATIONS.add("yên mô");
        VN_LOCATIONS.add("giao thuỷ");
        VN_LOCATIONS.add("quốc oai");
        VN_LOCATIONS.add("tuyên quang");
        VN_LOCATIONS.add("bát xát");
        VN_LOCATIONS.add("bắc hà");
        VN_LOCATIONS.add("đắk lắk");
        VN_LOCATIONS.add("tiên phước");
        VN_LOCATIONS.add("lê chân");
        VN_LOCATIONS.add("tiên yên");
        VN_LOCATIONS.add("bến cát");
        VN_LOCATIONS.add("tây giang");
        VN_LOCATIONS.add("đà nẵng");
        VN_LOCATIONS.add("ia grai");
        VN_LOCATIONS.add("tam bình");
        VN_LOCATIONS.add("thường tín");
        VN_LOCATIONS.add("vĩnh bảo");
        VN_LOCATIONS.add("hướng hoá");
        VN_LOCATIONS.add("sơn trà");
        VN_LOCATIONS.add("tân uyên");
        VN_LOCATIONS.add("m'đrăk");
        VN_LOCATIONS.add("quản bạ");
        VN_LOCATIONS.add("liên chiểu");
        VN_LOCATIONS.add("tri tôn");
        VN_LOCATIONS.add("tiên lãng");
        VN_LOCATIONS.add("biên hoà");
        VN_LOCATIONS.add("hải hậu");
        VN_LOCATIONS.add("tây ninh");
        VN_LOCATIONS.add("quỳnh nhai");
        VN_LOCATIONS.add("thạch hà");
        VN_LOCATIONS.add("đồng nai");
        VN_LOCATIONS.add("tuyên hoá");
        VN_LOCATIONS.add("mai châu");
        VN_LOCATIONS.add("yên bái");
        VN_LOCATIONS.add("duyên hải");
        VN_LOCATIONS.add("tháp mười");
        VN_LOCATIONS.add("phú nhuận");
        VN_LOCATIONS.add("ân thi");
        VN_LOCATIONS.add("khoái châu");
        VN_LOCATIONS.add("hòn đất");
        VN_LOCATIONS.add("thống nhất");
        VN_LOCATIONS.add("nghĩa đàn");
        VN_LOCATIONS.add("quế phong");
        VN_LOCATIONS.add("thủ đức");
        VN_LOCATIONS.add("hạ lang");
        VN_LOCATIONS.add("vĩnh linh");
        VN_LOCATIONS.add("yên lạc");
        VN_LOCATIONS.add("triệu phong");
        VN_LOCATIONS.add("lâm hà");
        VN_LOCATIONS.add("bảo lâm");
        VN_LOCATIONS.add("hải phòng");
        VN_LOCATIONS.add("vũ quang");
        VN_LOCATIONS.add("cao lộc");
        VN_LOCATIONS.add("nhơn trạch");
        VN_LOCATIONS.add("quảng trị");
        VN_LOCATIONS.add("thạch thất");
        VN_LOCATIONS.add("chơn thành");
        VN_LOCATIONS.add("tân yên");
        VN_LOCATIONS.add("thanh hà");
        VN_LOCATIONS.add("thạnh hoá");
        VN_LOCATIONS.add("si ma cai");
        VN_LOCATIONS.add("bác ái");
        VN_LOCATIONS.add("đăk hà");
        VN_LOCATIONS.add("yên minh");
        VN_LOCATIONS.add("tân bình");
        VN_LOCATIONS.add("đại từ");
        VN_LOCATIONS.add("phục hoà");
        VN_LOCATIONS.add("ninh sơn");
        VN_LOCATIONS.add("long phú");
        VN_LOCATIONS.add("hà tiên");
        VN_LOCATIONS.add("thanh bình");
        VN_LOCATIONS.add("mỏ cày");
        VN_LOCATIONS.add("thạnh trị");
        VN_LOCATIONS.add("trà vinh");
        VN_LOCATIONS.add("dầu tiếng");
        VN_LOCATIONS.add("bắc kạn");
        VN_LOCATIONS.add("chư sê");
        VN_LOCATIONS.add("thanh trì");
        VN_LOCATIONS.add("ngọc lạc");
        VN_LOCATIONS.add("từ sơn");
        VN_LOCATIONS.add("gia bình");
        VN_LOCATIONS.add("pác nặm");
        VN_LOCATIONS.add("thốt nốt");
        VN_LOCATIONS.add("trà bồng");
        VN_LOCATIONS.add("thừa thiên-huế");
        VN_LOCATIONS.add("phước long");
        VN_LOCATIONS.add("cẩm phả");
        VN_LOCATIONS.add("kon rẫy");
        VN_LOCATIONS.add("long biên");
        VN_LOCATIONS.add("cư m'gar");
        VN_LOCATIONS.add("cao lãnh");
        VN_LOCATIONS.add("buôn đôn");
        VN_LOCATIONS.add("đắk nông");
        VN_LOCATIONS.add("lý sơn");
        VN_LOCATIONS.add("sóc trăng");
        VN_LOCATIONS.add("hoằng hoá");
        VN_LOCATIONS.add("quận 10");
        VN_LOCATIONS.add("krông ana");
        VN_LOCATIONS.add("quận 11");
        VN_LOCATIONS.add("quận 12");
        VN_LOCATIONS.add("phan rang-tháp chàm");
        VN_LOCATIONS.add("tân kỳ");
        VN_LOCATIONS.add("tương dương");
        VN_LOCATIONS.add("đan phượng");
        VN_LOCATIONS.add("anh sơn");
        VN_LOCATIONS.add("quận 2");
        VN_LOCATIONS.add("quận 1");
        VN_LOCATIONS.add("qui nhơn");
        VN_LOCATIONS.add("tư nghĩa");
        VN_LOCATIONS.add("bố trạch");
        VN_LOCATIONS.add("quận 9");
        VN_LOCATIONS.add("thạch an");
        VN_LOCATIONS.add("bảo thắng");
        VN_LOCATIONS.add("quận 8");
        VN_LOCATIONS.add("quận 7");
        VN_LOCATIONS.add("nghĩa hành");
        VN_LOCATIONS.add("quận 6");
        VN_LOCATIONS.add("quận 5");
        VN_LOCATIONS.add("hội an");
        VN_LOCATIONS.add("quận 4");
        VN_LOCATIONS.add("quận 3");
        VN_LOCATIONS.add("phong điền");
        VN_LOCATIONS.add("xuân lộc");
        VN_LOCATIONS.add("côn đảo");
        VN_LOCATIONS.add("nha trang");
        VN_LOCATIONS.add("tân lạc");
        VN_LOCATIONS.add("hạ hoà");
        VN_LOCATIONS.add("gia viễn");
        VN_LOCATIONS.add("đồng tháp");
        VN_LOCATIONS.add("hoành bồ");
        VN_LOCATIONS.add("bắc quang");
        VN_LOCATIONS.add("na rì");
        VN_LOCATIONS.add("sông cầu");
        VN_LOCATIONS.add("mường tè");
        VN_LOCATIONS.add("yên phong");
        VN_LOCATIONS.add("tứ kỳ");
        VN_LOCATIONS.add("vũ thư");
        VN_LOCATIONS.add("mỹ hào");
        VN_LOCATIONS.add("chư prông");
        VN_LOCATIONS.add("hóc môn");
        VN_LOCATIONS.add("châu đốc");
        VN_LOCATIONS.add("đô lương");
        VN_LOCATIONS.add("mang thít");
        VN_LOCATIONS.add("tràng định");
        VN_LOCATIONS.add("cam ranh");
        VN_LOCATIONS.add("mang yang");
        VN_LOCATIONS.add("hàm thuận nam");
        VN_LOCATIONS.add("hưng nguyên");
        VN_LOCATIONS.add("kiến xương");
        VN_LOCATIONS.add("ninh phước");
        VN_LOCATIONS.add("phong thổ");
        VN_LOCATIONS.add("đức thọ");
        VN_LOCATIONS.add("hồng lĩnh");
        VN_LOCATIONS.add("khánh vĩnh");
        VN_LOCATIONS.add("mỹ lộc");
        VN_LOCATIONS.add("ngọc hiển");
        VN_LOCATIONS.add("phước sơn");
        VN_LOCATIONS.add("hà đông");
        VN_LOCATIONS.add("lào cai");
        VN_LOCATIONS.add("vĩnh yên");
        VN_LOCATIONS.add("quỳ châu");
        VN_LOCATIONS.add("sơn động");
        VN_LOCATIONS.add("bến cầu");
        VN_LOCATIONS.add("đông anh");
        VN_LOCATIONS.add("kông chro");
        VN_LOCATIONS.add("trảng bom");
        VN_LOCATIONS.add("đông triều");
        VN_LOCATIONS.add("ba tơ");
        VN_LOCATIONS.add("cù lao dung");
        VN_LOCATIONS.add("mỹ xuyên");
        VN_LOCATIONS.add("quảng hà");
        VN_LOCATIONS.add("tân biên");
        VN_LOCATIONS.add("bá thước");
        VN_LOCATIONS.add("cà mau");
        VN_LOCATIONS.add("chi lăng");
        VN_LOCATIONS.add("yên bình");
        VN_LOCATIONS.add("bình minh");
        VN_LOCATIONS.add("bình dương");
        VN_LOCATIONS.add("an nhơn");
        VN_LOCATIONS.add("chư păh");
        VN_LOCATIONS.add("việt nam");
        VN_LOCATIONS.add("giồng riềng");
        VN_LOCATIONS.add("cát tiên");
        VN_LOCATIONS.add("thuận an");
        VN_LOCATIONS.add("ngã năm");
        VN_LOCATIONS.add("cẩm thuỷ");
        VN_LOCATIONS.add("minh long");
        VN_LOCATIONS.add("nam đàn");
        VN_LOCATIONS.add("tân hiệp");
        VN_LOCATIONS.add("thanh sơn");
        VN_LOCATIONS.add("dĩ an");
        VN_LOCATIONS.add("thuận thành");
        VN_LOCATIONS.add("điện biên phủ");
        VN_LOCATIONS.add("vạn ninh");
        VN_LOCATIONS.add("hưng yê");
        VN_LOCATIONS.add("thái thuỵ");
        VN_LOCATIONS.add("thanh xuân");
        VN_LOCATIONS.add("cần giờ");
        VN_LOCATIONS.add("ngũ hành sơn");
        VN_LOCATIONS.add("ba tri");
        VN_LOCATIONS.add("hồng dân");
        VN_LOCATIONS.add("ninh giang");
        VN_LOCATIONS.add("phan rang tháp chàm");
        VN_LOCATIONS.add("than uyên");
        VN_LOCATIONS.add("phú lộc");
        VN_LOCATIONS.add("thanh chương");
        VN_LOCATIONS.add("lục ngạn");
        VN_LOCATIONS.add("năm căn");
        VN_LOCATIONS.add("điện biên đông");
        VN_LOCATIONS.add("hữu lũng");
        VN_LOCATIONS.add("hoàng su phì");
        VN_LOCATIONS.add("tây hồ");
        VN_LOCATIONS.add("bắc yên");
        VN_LOCATIONS.add("sài gòn");
        VN_LOCATIONS.add("vĩnh cửu");
        VN_LOCATIONS.add("bình phước");
        VN_LOCATIONS.add("nam sách");
        VN_LOCATIONS.add("hưng hà");
        VN_LOCATIONS.add("bình chánh");
        VN_LOCATIONS.add("uông bí");
        VN_LOCATIONS.add("ea h'leo");
        VN_LOCATIONS.add("tam điệp");
        VN_LOCATIONS.add("nam giang");
        VN_LOCATIONS.add("trùng khánh");
        VN_LOCATIONS.add("gia lộc");
        VN_LOCATIONS.add("tam dương");
        VN_LOCATIONS.add("hoà an");
        VN_LOCATIONS.add("thừa thiên huế");
        VN_LOCATIONS.add("nông cống");
        VN_LOCATIONS.add("tam kỳ");
        VN_LOCATIONS.add("đak pơ");
        VN_LOCATIONS.add("bình thạnh");
        VN_LOCATIONS.add("hà nội");
        VN_LOCATIONS.add("châu thành");
        VN_LOCATIONS.add("tiên lữ");
        VN_LOCATIONS.add("cầu kè");
        VN_LOCATIONS.add("ninh kiều");
        VN_LOCATIONS.add("buôn ma thuột");
        VN_LOCATIONS.add("an khê");
        VN_LOCATIONS.add("đức huệ");
        VN_LOCATIONS.add("tiền hải");
        VN_LOCATIONS.add("tuy phước");
        VN_LOCATIONS.add("bà rịa");
        VN_LOCATIONS.add("đa krông");
        VN_LOCATIONS.add("đồng xoài");
        VN_LOCATIONS.add("ba vì");
        VN_LOCATIONS.add("quảng ninh");
        VN_LOCATIONS.add("điện biên");
        VN_LOCATIONS.add("hà trung");
        VN_LOCATIONS.add("thanh oai");
        VN_LOCATIONS.add("trà cú");
        VN_LOCATIONS.add("văn yên");
        VN_LOCATIONS.add("bình xuyên");
        VN_LOCATIONS.add("hoà vang");
        VN_LOCATIONS.add("trà lĩnh");
        VN_LOCATIONS.add("yên khánh");
        VN_LOCATIONS.add("kbang");
        VN_LOCATIONS.add("hoàng sa");
        VN_LOCATIONS.add("văn quan");
        VN_LOCATIONS.add("ba chẽ");
        VN_LOCATIONS.add("nho quan");
        VN_LOCATIONS.add("khánh hoà");
        VN_LOCATIONS.add("đăk mil");
        VN_LOCATIONS.add("kiến thuỵ");
        VN_LOCATIONS.add("đầm hà");
        VN_LOCATIONS.add("hàm tân");
        VN_LOCATIONS.add("phù cát");
        VN_LOCATIONS.add("kim bảng");
        VN_LOCATIONS.add("vũng tầu");
        VN_LOCATIONS.add("kiên giang");
        VN_LOCATIONS.add("long hồ");
        VN_LOCATIONS.add("mường chà");
        VN_LOCATIONS.add("thanh ba");
        VN_LOCATIONS.add("đại lộc");
        VN_LOCATIONS.add("mê linh");
        VN_LOCATIONS.add("mường lát");
        VN_LOCATIONS.add("đạ huoai");
        VN_LOCATIONS.add("huế");
        VN_LOCATIONS.add("cần thơ");
        VN_LOCATIONS.add("vụ bản");
        VN_LOCATIONS.add("thanh liêm");
        VN_LOCATIONS.add("đoan hùng");
        VN_LOCATIONS.add("hiệp hoà");
        VN_LOCATIONS.add("bắc sơn");
        VN_LOCATIONS.add("tân trụ");
        VN_LOCATIONS.add("cần giuộc");
        VN_LOCATIONS.add("đăk glong");
        VN_LOCATIONS.add("hậu lộc");
        VN_LOCATIONS.add("kỳ anh");
        VN_LOCATIONS.add("cai lậy");
        VN_LOCATIONS.add("krông bông");
        VN_LOCATIONS.add("yên lập");
        VN_LOCATIONS.add("mù căng chải");
        VN_LOCATIONS.add("mỹ tú");
        VN_LOCATIONS.add("trạm tấu");
        VN_LOCATIONS.add("cư jút");
        VN_LOCATIONS.add("quỳ hợp");
        VN_LOCATIONS.add("tân phước");
        VN_LOCATIONS.add("vĩnh lợi");
        VN_LOCATIONS.add("đồng văn");
        VN_LOCATIONS.add("đông sơn");
        VN_LOCATIONS.add("tây trà");
        VN_LOCATIONS.add("lộc ninh");
        VN_LOCATIONS.add("sầm sơn");
        VN_LOCATIONS.add("lạng sơn");
        VN_LOCATIONS.add("sa pa");
        VN_LOCATIONS.add("hàm yên");
        VN_LOCATIONS.add("vân đồn");
        VN_LOCATIONS.add("đà bắc");
        VN_LOCATIONS.add("vân canh");
        VN_LOCATIONS.add("sơn hoà");
        VN_LOCATIONS.add("thuận bắc");
        VN_LOCATIONS.add("châu đức");
        VN_LOCATIONS.add("thường xuân");
        VN_LOCATIONS.add("định hoá");
        VN_LOCATIONS.add("giồng trôm");
        VN_LOCATIONS.add("núi thành");
        VN_LOCATIONS.add("rạch giá");
        VN_LOCATIONS.add("con cuông");
        VN_LOCATIONS.add("ninh bình");
        VN_LOCATIONS.add("đồng hới");
        VN_LOCATIONS.add("tân an");
        VN_LOCATIONS.add("trực ninh");
        VN_LOCATIONS.add("thuận châu");
        VN_LOCATIONS.add("vinh");
        VN_LOCATIONS.add("trần văn thời");
        VN_LOCATIONS.add("minh hoá");
        VN_LOCATIONS.add("yên mỹ");
        VN_LOCATIONS.add("quan hoá");
        VN_LOCATIONS.add("văn bàn");
        VN_LOCATIONS.add("cam lộ");
        VN_LOCATIONS.add("lang chánh");
        VN_LOCATIONS.add("phù yên");
        VN_LOCATIONS.add("đăk tô");
        VN_LOCATIONS.add("hoa lư");
        VN_LOCATIONS.add("lục yên");
        VN_LOCATIONS.add("đức phổ");
        VN_LOCATIONS.add("hà nam");
        VN_LOCATIONS.add("tuy an");
        VN_LOCATIONS.add("an giang");
        VN_LOCATIONS.add("ba bể");
        VN_LOCATIONS.add("xuân trường");
        VN_LOCATIONS.add("cát hải");
        VN_LOCATIONS.add("kon tum");
        VN_LOCATIONS.add("bù đăng");
        VN_LOCATIONS.add("krông năng");
        VN_LOCATIONS.add("an biên");
        VN_LOCATIONS.add("yên châu");
        VN_LOCATIONS.add("phú thọ");
        VN_LOCATIONS.add("tam nông");
        VN_LOCATIONS.add("quỳnh lưu");
        VN_LOCATIONS.add("đình lập");
        VN_LOCATIONS.add("nghi lộc");
        VN_LOCATIONS.add("chợ mới");
        VN_LOCATIONS.add("đức trọng");
        VN_LOCATIONS.add("đầm dơi");
        VN_LOCATIONS.add("long đất");
        VN_LOCATIONS.add("mường lay");
        VN_LOCATIONS.add("tiền giang");
        VN_LOCATIONS.add("thông nông");
        VN_LOCATIONS.add("phú yên");
        VN_LOCATIONS.add("quảng bình");
        VN_LOCATIONS.add("sìn hồ");
        VN_LOCATIONS.add("tuy phong");
        VN_LOCATIONS.add("ba đình");
        VN_LOCATIONS.add("phù mỹ");
        VN_LOCATIONS.add("đức hoà");
        VN_LOCATIONS.add("bảo lạc");
        VN_LOCATIONS.add("đăk glei");
        VN_LOCATIONS.add("bến tre");
        VN_LOCATIONS.add("như thanh");
        VN_LOCATIONS.add("thanh thuỷ");
        VN_LOCATIONS.add("đà lạt");
        VN_LOCATIONS.add("đức cơ");
        VN_LOCATIONS.add("văn chấn");
        VN_LOCATIONS.add("bà rịa vũng tàu");
        VN_LOCATIONS.add("vĩnh hưng");
        VN_LOCATIONS.add("cao phong");
        VN_LOCATIONS.add("nam trà my");
        VN_LOCATIONS.add("phú giáo");
        VN_LOCATIONS.add("phú bình");
        VN_LOCATIONS.add("ayun pa");
        VN_LOCATIONS.add("mỹ đức");
        VN_LOCATIONS.add("tuần giáo");
    }

    public static Set<String> VN_FIRST_SENT_WORDS;
    static {
        VN_FIRST_SENT_WORDS = new HashSet<String>();
        VN_FIRST_SENT_WORDS.add("được");
        VN_FIRST_SENT_WORDS.add("cty");
        VN_FIRST_SENT_WORDS.add("mẹ");
        VN_FIRST_SENT_WORDS.add("trừ");
        VN_FIRST_SENT_WORDS.add("lên");
        VN_FIRST_SENT_WORDS.add("trưởng");
        VN_FIRST_SENT_WORDS.add("là");
        VN_FIRST_SENT_WORDS.add("chàng");
        VN_FIRST_SENT_WORDS.add("theo");
        VN_FIRST_SENT_WORDS.add("tên");
        VN_FIRST_SENT_WORDS.add("giờ");
        VN_FIRST_SENT_WORDS.add("biết");
        VN_FIRST_SENT_WORDS.add("già");
        VN_FIRST_SENT_WORDS.add("những");
        VN_FIRST_SENT_WORDS.add("thấy");
        VN_FIRST_SENT_WORDS.add("thương");
        VN_FIRST_SENT_WORDS.add("lang");
        VN_FIRST_SENT_WORDS.add("gái");
        VN_FIRST_SENT_WORDS.add("mà");
        VN_FIRST_SENT_WORDS.add("xóm");
        VN_FIRST_SENT_WORDS.add("má");
        VN_FIRST_SENT_WORDS.add("cầu");
        VN_FIRST_SENT_WORDS.add("khách");
        VN_FIRST_SENT_WORDS.add("nhánh");
        VN_FIRST_SENT_WORDS.add("hôm");
        VN_FIRST_SENT_WORDS.add("nhớ");
        VN_FIRST_SENT_WORDS.add("hạng");
        VN_FIRST_SENT_WORDS.add("huyện");
        VN_FIRST_SENT_WORDS.add("vậy");
        VN_FIRST_SENT_WORDS.add("nhà");
        VN_FIRST_SENT_WORDS.add("ấp");
        VN_FIRST_SENT_WORDS.add("sông");
        VN_FIRST_SENT_WORDS.add("thằng");
        VN_FIRST_SENT_WORDS.add("nài");
        VN_FIRST_SENT_WORDS.add("ngành");
        VN_FIRST_SENT_WORDS.add("nếu");
        VN_FIRST_SENT_WORDS.add("trời");
        VN_FIRST_SENT_WORDS.add("đảng");
        VN_FIRST_SENT_WORDS.add("vào");
        VN_FIRST_SENT_WORDS.add("thầy");
        VN_FIRST_SENT_WORDS.add("hai");
        VN_FIRST_SENT_WORDS.add("vùng");
        VN_FIRST_SENT_WORDS.add("chuyện");
        VN_FIRST_SENT_WORDS.add("nhìn");
        VN_FIRST_SENT_WORDS.add("tim");
        VN_FIRST_SENT_WORDS.add("cha");
        VN_FIRST_SENT_WORDS.add("sang");
        VN_FIRST_SENT_WORDS.add("bên");
        VN_FIRST_SENT_WORDS.add("đường");
        VN_FIRST_SENT_WORDS.add("cho");
        VN_FIRST_SENT_WORDS.add("bảng");
        VN_FIRST_SENT_WORDS.add("khi");
        VN_FIRST_SENT_WORDS.add("quận");
        VN_FIRST_SENT_WORDS.add("biển");
        VN_FIRST_SENT_WORDS.add("cu");
        VN_FIRST_SENT_WORDS.add("metro");
        VN_FIRST_SENT_WORDS.add("vốn");
        VN_FIRST_SENT_WORDS.add("đến");
        VN_FIRST_SENT_WORDS.add("năm");
        VN_FIRST_SENT_WORDS.add("khu");
        VN_FIRST_SENT_WORDS.add("đài");
        VN_FIRST_SENT_WORDS.add("miền");
        VN_FIRST_SENT_WORDS.add("việc");
        VN_FIRST_SENT_WORDS.add("do");
        VN_FIRST_SENT_WORDS.add("lập");
        VN_FIRST_SENT_WORDS.add("nghe");
        VN_FIRST_SENT_WORDS.add("mắt");
        VN_FIRST_SENT_WORDS.add("viện");
        VN_FIRST_SENT_WORDS.add("cả");
        VN_FIRST_SENT_WORDS.add("em");
        VN_FIRST_SENT_WORDS.add("rừng");
        VN_FIRST_SENT_WORDS.add("liệu");
        VN_FIRST_SENT_WORDS.add("bố");
        VN_FIRST_SENT_WORDS.add("bộ");
        VN_FIRST_SENT_WORDS.add("cháu");
        VN_FIRST_SENT_WORDS.add("riêng");
        VN_FIRST_SENT_WORDS.add("bà");
        VN_FIRST_SENT_WORDS.add("số");
        VN_FIRST_SENT_WORDS.add("chị");
        VN_FIRST_SENT_WORDS.add("người");
        VN_FIRST_SENT_WORDS.add("bé");
        VN_FIRST_SENT_WORDS.add("tàu");
        VN_FIRST_SENT_WORDS.add("làng");
        VN_FIRST_SENT_WORDS.add("cảng");
        VN_FIRST_SENT_WORDS.add("sở");
        VN_FIRST_SENT_WORDS.add("chiếc");
        VN_FIRST_SENT_WORDS.add("tết");
        VN_FIRST_SENT_WORDS.add("cậu");
        VN_FIRST_SENT_WORDS.add("luật");
        VN_FIRST_SENT_WORDS.add("chờ");
        VN_FIRST_SENT_WORDS.add("rời");
        VN_FIRST_SENT_WORDS.add("chắc");
        VN_FIRST_SENT_WORDS.add("hội");
        VN_FIRST_SENT_WORDS.add("chợ");
        VN_FIRST_SENT_WORDS.add("viên");
        VN_FIRST_SENT_WORDS.add("cụ");
        VN_FIRST_SENT_WORDS.add("nay");
        VN_FIRST_SENT_WORDS.add("thuốc");
        VN_FIRST_SENT_WORDS.add("bọn");
        VN_FIRST_SENT_WORDS.add("tờ");
        VN_FIRST_SENT_WORDS.add("phía");
        VN_FIRST_SENT_WORDS.add("chữ");
        VN_FIRST_SENT_WORDS.add("xe");
        VN_FIRST_SENT_WORDS.add("cò");
        VN_FIRST_SENT_WORDS.add("có");
        VN_FIRST_SENT_WORDS.add("cô");
        VN_FIRST_SENT_WORDS.add("dân");
        VN_FIRST_SENT_WORDS.add("nhóm");
        VN_FIRST_SENT_WORDS.add("song");
        VN_FIRST_SENT_WORDS.add("chú");
        VN_FIRST_SENT_WORDS.add("từ");
        VN_FIRST_SENT_WORDS.add("như");
        VN_FIRST_SENT_WORDS.add("ngày");
        VN_FIRST_SENT_WORDS.add("phim");
        VN_FIRST_SENT_WORDS.add("chính");
        VN_FIRST_SENT_WORDS.add("tân");
        VN_FIRST_SENT_WORDS.add("gặp");
        VN_FIRST_SENT_WORDS.add("các");
        VN_FIRST_SENT_WORDS.add("quê");
        VN_FIRST_SENT_WORDS.add("dì");
        VN_FIRST_SENT_WORDS.add("bởi");
        VN_FIRST_SENT_WORDS.add("quí");
        VN_FIRST_SENT_WORDS.add("về");
        VN_FIRST_SENT_WORDS.add("trại");
        VN_FIRST_SENT_WORDS.add("tại");
        VN_FIRST_SENT_WORDS.add("lão");
        VN_FIRST_SENT_WORDS.add("đảo");
        VN_FIRST_SENT_WORDS.add("nguyên");
        VN_FIRST_SENT_WORDS.add("còn");
        VN_FIRST_SENT_WORDS.add("tiếng");
        VN_FIRST_SENT_WORDS.add("dòng");
        VN_FIRST_SENT_WORDS.add("và");
        VN_FIRST_SENT_WORDS.add("hiện");
        VN_FIRST_SENT_WORDS.add("vợ");
        VN_FIRST_SENT_WORDS.add("thuyền");
        VN_FIRST_SENT_WORDS.add("vụ");
        VN_FIRST_SENT_WORDS.add("đoàn");
        VN_FIRST_SENT_WORDS.add("thành");
        VN_FIRST_SENT_WORDS.add("giới");
        VN_FIRST_SENT_WORDS.add("bến");
        VN_FIRST_SENT_WORDS.add("vì");
        VN_FIRST_SENT_WORDS.add("đi");
        VN_FIRST_SENT_WORDS.add("sân");
        VN_FIRST_SENT_WORDS.add("sâm");
        VN_FIRST_SENT_WORDS.add("con");
        VN_FIRST_SENT_WORDS.add("bác");
        VN_FIRST_SENT_WORDS.add("cùng");
        VN_FIRST_SENT_WORDS.add("báo");
        VN_FIRST_SENT_WORDS.add("chồng");
        VN_FIRST_SENT_WORDS.add("hàng");
        VN_FIRST_SENT_WORDS.add("đất");
        VN_FIRST_SENT_WORDS.add("mỗi");
        VN_FIRST_SENT_WORDS.add("núi");
        VN_FIRST_SENT_WORDS.add("phòng");
        VN_FIRST_SENT_WORDS.add("xã");
        VN_FIRST_SENT_WORDS.add("hồ");
        VN_FIRST_SENT_WORDS.add("ông");
        VN_FIRST_SENT_WORDS.add("giọng");
        VN_FIRST_SENT_WORDS.add("trường");
        VN_FIRST_SENT_WORDS.add("đèo");
        VN_FIRST_SENT_WORDS.add("trùm");
        VN_FIRST_SENT_WORDS.add("nhiều");
        VN_FIRST_SENT_WORDS.add("thư");
        VN_FIRST_SENT_WORDS.add("cục");
        VN_FIRST_SENT_WORDS.add("nước");
        VN_FIRST_SENT_WORDS.add("thôn");
        VN_FIRST_SENT_WORDS.add("bạn");
        VN_FIRST_SENT_WORDS.add("nàng");
        VN_FIRST_SENT_WORDS.add("bệnh");
        VN_FIRST_SENT_WORDS.add("cụm");
        VN_FIRST_SENT_WORDS.add("tướng");
        VN_FIRST_SENT_WORDS.add("buôn");
        VN_FIRST_SENT_WORDS.add("để");
        VN_FIRST_SENT_WORDS.add("anh");
        VN_FIRST_SENT_WORDS.add("lính");
        VN_FIRST_SENT_WORDS.add("với");
        VN_FIRST_SENT_WORDS.add("ngoài");
        VN_FIRST_SENT_WORDS.add("trên");
        VN_FIRST_SENT_WORDS.add("hỏi");
        VN_FIRST_SENT_WORDS.add("sau");
        VN_FIRST_SENT_WORDS.add("đội");
        VN_FIRST_SENT_WORDS.add("gọi");
        VN_FIRST_SENT_WORDS.add("rồi");
        VN_FIRST_SENT_WORDS.add("một");
        VN_FIRST_SENT_WORDS.add("chúc");
        VN_FIRST_SENT_WORDS.add("nhưng");
        VN_FIRST_SENT_WORDS.add("đêm");
        VN_FIRST_SENT_WORDS.add("phó");
        VN_FIRST_SENT_WORDS.add("bỗng");
        VN_FIRST_SENT_WORDS.add("trong");
        VN_FIRST_SENT_WORDS.add("trước");
        VN_FIRST_SENT_WORDS.add("bản");
        VN_FIRST_SENT_WORDS.add("cuốn");
        VN_FIRST_SENT_WORDS.add("chùa");
        VN_FIRST_SENT_WORDS.add("ban");
        VN_FIRST_SENT_WORDS.add("giữa");
        VN_FIRST_SENT_WORDS.add("ngay");
        VN_FIRST_SENT_WORDS.add("lúc");
        VN_FIRST_SENT_WORDS.add("tỉnh");
        VN_FIRST_SENT_WORDS.add("tuy");
        VN_FIRST_SENT_WORDS.add("vẫn");

        VN_FIRST_SENT_WORDS.add("trà");
        VN_FIRST_SENT_WORDS.add("ôi");
        VN_FIRST_SENT_WORDS.add("cặp");
        VN_FIRST_SENT_WORDS.add("taxi");
        VN_FIRST_SENT_WORDS.add("nhiễm");
        VN_FIRST_SENT_WORDS.add("virus");
        VN_FIRST_SENT_WORDS.add("hồi");
        VN_FIRST_SENT_WORDS.add("nghĩa");
        VN_FIRST_SENT_WORDS.add("đọc");
        VN_FIRST_SENT_WORDS.add("nhờ");
        VN_FIRST_SENT_WORDS.add("tới");
        VN_FIRST_SENT_WORDS.add("ong");
        VN_FIRST_SENT_WORDS.add("website");
        VN_FIRST_SENT_WORDS.add("bóng");
        VN_FIRST_SENT_WORDS.add("quít");
        VN_FIRST_SENT_WORDS.add("kungfu");
        VN_FIRST_SENT_WORDS.add("ra");
        VN_FIRST_SENT_WORDS.add("đồng");
        VN_FIRST_SENT_WORDS.add("băng");
        VN_FIRST_SENT_WORDS.add("ba");
        VN_FIRST_SENT_WORDS.add("bầu");
        VN_FIRST_SENT_WORDS.add("hay");
        VN_FIRST_SENT_WORDS.add("giải");
        VN_FIRST_SENT_WORDS.add("giao");
        VN_FIRST_SENT_WORDS.add("cửa");
        VN_FIRST_SENT_WORDS.add("phần");
        VN_FIRST_SENT_WORDS.add("sinh");
        VN_FIRST_SENT_WORDS.add("vietcombank");
        VN_FIRST_SENT_WORDS.add("vàng");
        VN_FIRST_SENT_WORDS.add("fred");
        VN_FIRST_SENT_WORDS.add("tập");
        VN_FIRST_SENT_WORDS.add("toyota");
        VN_FIRST_SENT_WORDS.add("bế");
        VN_FIRST_SENT_WORDS.add("tuồng");
        VN_FIRST_SENT_WORDS.add("nguồn");
        VN_FIRST_SENT_WORDS.add("phường");
        VN_FIRST_SENT_WORDS.add("làm");
        VN_FIRST_SENT_WORDS.add("tuyển");
        VN_FIRST_SENT_WORDS.add("đền");
        VN_FIRST_SENT_WORDS.add("mong");
        VN_FIRST_SENT_WORDS.add("nghỉ");
        VN_FIRST_SENT_WORDS.add("hầm");
        VN_FIRST_SENT_WORDS.add("trán");
        VN_FIRST_SENT_WORDS.add("dắt");
        VN_FIRST_SENT_WORDS.add("sợ");
        VN_FIRST_SENT_WORDS.add("chỗ");
        VN_FIRST_SENT_WORDS.add("lái");
        VN_FIRST_SENT_WORDS.add("xem");
        VN_FIRST_SENT_WORDS.add("chủ");
        VN_FIRST_SENT_WORDS.add("chứ");
        VN_FIRST_SENT_WORDS.add("đợt");
        VN_FIRST_SENT_WORDS.add("đoạn");
        VN_FIRST_SENT_WORDS.add("đồn");
        VN_FIRST_SENT_WORDS.add("trục");
        VN_FIRST_SENT_WORDS.add("tự");
        VN_FIRST_SENT_WORDS.add("neil");
        VN_FIRST_SENT_WORDS.add("điện");
        VN_FIRST_SENT_WORDS.add("trạm");
        VN_FIRST_SENT_WORDS.add("gần");
        VN_FIRST_SENT_WORDS.add("giặc");
        VN_FIRST_SENT_WORDS.add("cúng");
        VN_FIRST_SENT_WORDS.add("dù");
        VN_FIRST_SENT_WORDS.add("vịnh");
        VN_FIRST_SENT_WORDS.add("quân");
        VN_FIRST_SENT_WORDS.add("dãy");
        VN_FIRST_SENT_WORDS.add("diamicron");
        VN_FIRST_SENT_WORDS.add("pha");
        VN_FIRST_SENT_WORDS.add("toàn");
        VN_FIRST_SENT_WORDS.add("tháp");
        VN_FIRST_SENT_WORDS.add("quĩ");
        VN_FIRST_SENT_WORDS.add("đĩa");
        VN_FIRST_SENT_WORDS.add("gà");
        VN_FIRST_SENT_WORDS.add("lao");
        VN_FIRST_SENT_WORDS.add("bốn");
        VN_FIRST_SENT_WORDS.add("họ");
        VN_FIRST_SENT_WORDS.add("họp");
        VN_FIRST_SENT_WORDS.add("đèn");
        VN_FIRST_SENT_WORDS.add("cũng");
        VN_FIRST_SENT_WORDS.add("động");
        VN_FIRST_SENT_WORDS.add("mặt");
        VN_FIRST_SENT_WORDS.add("đầm");
        VN_FIRST_SENT_WORDS.add("cống");
        VN_FIRST_SENT_WORDS.add("nơi");
        VN_FIRST_SENT_WORDS.add("tùng");
        VN_FIRST_SENT_WORDS.add("phố");
        VN_FIRST_SENT_WORDS.add("đầu");
        VN_FIRST_SENT_WORDS.add("vượt");
        VN_FIRST_SENT_WORDS.add("sao");
        VN_FIRST_SENT_WORDS.add("cách");
        VN_FIRST_SENT_WORDS.add("interserco");
        VN_FIRST_SENT_WORDS.add("hoặc");
        VN_FIRST_SENT_WORDS.add("của");
        VN_FIRST_SENT_WORDS.add("hết");
        VN_FIRST_SENT_WORDS.add("đỉnh");
        VN_FIRST_SENT_WORDS.add("kênh");
        VN_FIRST_SENT_WORDS.add("quyền");
        VN_FIRST_SENT_WORDS.add("bar");
        VN_FIRST_SENT_WORDS.add("chống");
        VN_FIRST_SENT_WORDS.add("khắp");
        VN_FIRST_SENT_WORDS.add("sách");
    }
}