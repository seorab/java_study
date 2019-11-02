package http;

import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Http3 { // parsing
	public static void main(String[] args) throws IOException {
		Connection con = Jsoup.connect("https://www.foodsafetykorea.go.kr/portal/healthyfoodlife/foodnutrient/simpleSearch.do?menu_grp=MENU_NEW03&menu_no=2805");
		Document doc = con.get();
		Elements imgs = doc.getElementsByTag("a");
		for (int i = 0; i < imgs.size(); i++) {
			Element img = imgs.get(i);
			String num = img.text();
			System.out.printf("%s\n", num);
		}
	}
	
}