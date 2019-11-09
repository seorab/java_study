package image;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class WaterMark4 {
	public static void main(String[] args) throws IOException {
// ���� �̹��� �� ���͸�ũ�� ����� �ΰ� �̹��� ��������
		BufferedImage sourceImage = ImageIO.read(new File("image/wm4.jpg"));
		BufferedImage watermarkImage = ImageIO.read(new File("image/logo.jpg"));
// ���͸�ũ�� �߰��ϱ� ���� ���� �̹����� graphics ��ü ��������

//		Graphics g = sourceImage.getGraphics();
		
		Graphics2D g = (Graphics2D) sourceImage.getGraphics();
		// ���� 50% (0.0 ~ 1.0)
		AlphaComposite alphaChannel =
		AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
		g.setComposite(alphaChannel);
		
		int x = sourceImage.getWidth() - watermarkImage.getWidth();
		int y = sourceImage.getHeight() - watermarkImage.getHeight();
//���� �̹����� ���͸�ũ �̹��� �׸���
		g.drawImage(watermarkImage, x, y, null);
//���ο� ���Ϸ� ����
		ImageIO.write(sourceImage, "jpg", new File("image/wm4c.jpg"));
	}
}