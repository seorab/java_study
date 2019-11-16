package swing;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test02 {
	static double width;
	
	public static void main(String[] args) {
		JFrame j = new JFrame(); 
		
		/* Êç?Úñ ?ø· Ì³Öï */
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		width = screenSize.getWidth();
		width /= 2; // Êç?Úñ ?øË ?ø· / 2
		double height = screenSize.getHeight();
		height /= 2; // Êç?Úñ ÐüøË ?ø· / 2
//		System.out.printf("%f %f", width, height);

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X Ò½Ý¯? ?øËøÉÛé ??

		/* ?Í³×»ÜË ??×ùø· ÍÝÊµ Panel Ðã? */
		JPanel panel = new JPanel();

		j.setSize((int)width, (int)height);
		j.add(panel); // FrameñÕ Panel Øù?
		j.setVisible(true);

		// JFrame -> JPanel -> JLabel -> ImageIcon
		new Thread( new Runnable() {
			@Override
			public void run() {
				ImageIcon icon = new ImageIcon("image/balloon.png");
				JLabel img = new JLabel(icon); // ?Í³×»ÜË Øó??ø· ÍÝòÚ? JLabel ?? 
				img.setSize(icon.getIconWidth(), icon.getIconWidth()); // JLabel ?ø· ×»?
				img.setLocation(0, 50);
				panel.add(img);
				
				for(int i = 0; i < width - img.getWidth(); i+=50) {
					img.setLocation(i, 50);
					panel.repaint();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		} ).start();
		
		new Thread( new Runnable() {
			@Override
			public void run() {
				ImageIcon icon2 = new ImageIcon("image/bird.png");
				JLabel img2 = new JLabel(icon2); // ?Í³×»ÜË Øó??ø· ÍÝòÚ? JLabel ?? 
				img2.setSize(icon2.getIconWidth(), icon2.getIconWidth()); // JLabel ?ø· ×»?
				img2.setLocation(0, 200);
				panel.add(img2);

				for(int i = 0; i < width - img2.getWidth(); i+=50) {
					img2.setLocation(i, 200);
					panel.repaint();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				ImageIcon icon3 = new ImageIcon("image/chrome.png");
				JLabel img3 = new JLabel(icon3); // ?Í³×»ÜË Øó??ø· ÍÝòÚ? JLabel ?? 
				img3.setSize(icon3.getIconWidth(), icon3.getIconWidth()); // JLabel ?ø· ×»?
				img3.setLocation(0, 350);
				panel.add(img3);
				
				for(int i = 0; i < width - img3.getWidth(); i+=50) {
					img3.setLocation(i, 350);
					panel.repaint();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
	}
}