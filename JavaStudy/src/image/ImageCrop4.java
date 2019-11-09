package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageCrop4 {
	public static void main(String[] args) throws IOException {
		BufferedImage img = 
			ImageIO.read(new File("image/crop3.jpg"));
		int width = img.getWidth();
		int height = img.getHeight();
		BufferedImage newImage = 
			img.getSubimage(
				0, height / 2 - width / 2, 
				width, width);
		ImageIO.write(newImage, "jpg", new File("image/crop3c.jpg"));
	}
}




