package ch05;

import java.io.IOException;
import java.util.Calendar;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
	public static void main(String[] args) throws IOException {
		Math.random();
		Calendar c = Calendar.getInstance();
		c.get(Calendar.YEAR);
		
		//웹에서 내용을 가져온다.

		Document doc = 
				Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=626907&weekday=wed").get();

		//내용 중에서 원하는 부분을 가져온다.

		Elements contents = doc.select("td.title a");
		
		//                 길이 size / length
		for(int i = 0; i < contents.size(); i++) {
			Element e = contents.get(i);
			String text = e.text();
			//                       시작위치, 끝위치
			//                         01234
			//                         269화 인생
			String no = text.substring(0, 4);
			String title = text.substring(5);
			System.out.println( no );
			System.out.println( title );
		}
	}
}





