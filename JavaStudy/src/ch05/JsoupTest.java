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
		
		//������ ������ �����´�.

		Document doc = 
				Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=626907&weekday=wed").get();

		//���� �߿��� ���ϴ� �κ��� �����´�.

		Elements contents = doc.select("td.title a");
		
		//                 ���� size / length
		for(int i = 0; i < contents.size(); i++) {
			Element e = contents.get(i);
			String text = e.text();
			//                       ������ġ, ����ġ
			//                         01234
			//                         269ȭ �λ�
			String no = text.substring(0, 4);
			String title = text.substring(5);
			System.out.println( no );
			System.out.println( title );
		}
	}
}





