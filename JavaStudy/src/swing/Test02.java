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
		
		/* ��?�� ?�� ̳�� */
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		width = screenSize.getWidth();
		width /= 2; // ��?�� ?�� ?�� / 2
		double height = screenSize.getHeight();
		height /= 2; // ��?�� ���� ?�� / 2
//		System.out.printf("%f %f", width, height);

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X ҽݯ? ?������ ??

		/* ?ͳ׻�� ??���� ��ʵ Panel ��? */
		JPanel panel = new JPanel();

		j.setSize((int)width, (int)height);
		j.add(panel); // Frame�� Panel ��?
		j.setVisible(true);

		// JFrame -> JPanel -> JLabel -> ImageIcon
		new Thread( new Runnable() {
			@Override
			public void run() {
				ImageIcon icon = new ImageIcon("image/balloon.png");
				JLabel img = new JLabel(icon); // ?ͳ׻�� ��??�� ����? JLabel ?? 
				img.setSize(icon.getIconWidth(), icon.getIconWidth()); // JLabel ?�� ׻?
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
				JLabel img2 = new JLabel(icon2); // ?ͳ׻�� ��??�� ����? JLabel ?? 
				img2.setSize(icon2.getIconWidth(), icon2.getIconWidth()); // JLabel ?�� ׻?
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
				JLabel img3 = new JLabel(icon3); // ?ͳ׻�� ��??�� ����? JLabel ?? 
				img3.setSize(icon3.getIconWidth(), icon3.getIconWidth()); // JLabel ?�� ׻?
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