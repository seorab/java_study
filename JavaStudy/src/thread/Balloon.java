package thread;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Balloon {
	public static void makeBalloon(JPanel panel, int x, int y) {
		/* Thread 사용 */
		new Thread(new Runnable() {
			@Override
			public void run() {
				/* 내부 클래스에서 지역변수 사용 */
				int y2 = y;
				ImageIcon icon = new ImageIcon("image/balloon.png");
				JLabel label = new JLabel(icon);
				label.setSize(icon.getIconWidth(), icon.getIconHeight());
				panel.add(label);
				for (int i = 0; i < 10; i++) {
					label.setLocation(x, y2);
					try {
						panel.repaint();
						Thread.sleep(200);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					y2 -= 25;
				}
			}
		}).start();
	}

	public static void main(String[] args) {
		JFrame j = new JFrame();
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				makeBalloon(panel, e.getX(), e.getY());
			}
		});
		j.add(panel);
		j.setSize(700, 500);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
}