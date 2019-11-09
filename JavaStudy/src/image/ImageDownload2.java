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

public class ImageDownload2 {
	public static void main(String[] args) throws IOException {
		for(int i = 1; i <= 24; i++) {
			String imgUrl = 
				"http://ci.encar.com/carpicture/carpicture09/pic2559/" +
			    "25598196_0" + ( i < 10 ? "0" + i : i ) + ".jpg";
			URL url = new URL(imgUrl);
			BufferedImage img = ImageIO.read(url);
			ImageIO.write(img, "jpg", new File("25598196_0" + ( i < 10 ? "0" + i : i ) + ".jpg"));
		}
	}
}



