package image;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class WaterMark4 {
	public static void main(String[] args) throws IOException {
// 원본 이미지 및 워터마크로 사용할 로고 이미지 가져오기
		BufferedImage sourceImage = ImageIO.read(new File("image/wm4.jpg"));
		BufferedImage watermarkImage = ImageIO.read(new File("image/logo.jpg"));
// 워터마크를 추가하기 위해 원본 이미지의 graphics 객체 가져오기

//		Graphics g = sourceImage.getGraphics();
		
		Graphics2D g = (Graphics2D) sourceImage.getGraphics();
		// 투명도 50% (0.0 ~ 1.0)
		AlphaComposite alphaChannel =
		AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
		g.setComposite(alphaChannel);
		
		int x = sourceImage.getWidth() - watermarkImage.getWidth();
		int y = sourceImage.getHeight() - watermarkImage.getHeight();
//원본 이미지에 워터마크 이미지 그리기
		g.drawImage(watermarkImage, x, y, null);
//새로운 파일로 저장
		ImageIO.write(sourceImage, "jpg", new File("image/wm4c.jpg"));
	}
}