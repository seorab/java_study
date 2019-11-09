package image;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageCrop2 {
	public static void main(String[] args) throws IOException {
		BufferedImage img = ImageIO.read(new File("image/crop1.jpg"));
		int width = img.getWidth() / 2;
		int height = img.getHeight() / 2;
// 이미지 크기와 이미지 스케일의 알고리즘 지정
		Image resizeImg = img.getScaledInstance(width, height, Image.SCALE_DEFAULT);
//새로운 이미지를 저장할 객체 생성
//ImageIO의 write 메소드는 Image 형태의 객체를 직접 사용할 수 없고
//RenderedImage를 처리하므로 자식 클래스인 BufferedImage를 생성하고
//Image의 데이터를 복사한 후 사용
		BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = newImage.getGraphics();
		g.drawImage(resizeImg, 0, 0, null);
		ImageIO.write(newImage, "jpg", new File("image/crop1c.jpg"));
	}
}