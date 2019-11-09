package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ImageDownload1 {
	public static void main(String[] args) throws IOException {
		Connection con = 
			Jsoup.connect("http://ggoreb.com/http/html1.jsp");
		Document doc = con.get();
		Elements eles = doc.getElementsByTag("img");
		for(int i = 0; i < eles.size(); i++) {
			String file = eles.get(i).attr("src");
			// lastIndexOf, substring
			//        @
			// /images/luffy.jpg
			int 위치 = file.lastIndexOf("/");
			file = file.substring(위치+1);
			
			System.out.println(file);
			String imgUrl = 
				"http://ggoreb.com" + eles.get(i).attr("src");
			URL url = new URL(imgUrl);
			BufferedImage img = ImageIO.read(url);
			ImageIO.write(img, "jpg", new File(file));
		}
	}
}



