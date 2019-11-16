package swing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

class T1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class Paint1 extends JFrame {
	@Override
	public void paint(Graphics g) {
		g.drawLine(50, 50, 250, 250);
		g.drawRect(200, 200, 100, 100);
	}
}

public class Test1 {
	public static void main(String[] args) {
		new Thread().start();
		
		new Runnable() {
			@Override
			public void run() {
			}
		};
		
		
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		double w = dim.getWidth();
		double h = dim.getHeight();
		
		Paint1 p = new Paint1();
		int x = (int)w / 2 - 200;
		int y = (int)h / 2 - 150;
		
		p.setBounds(x, y, 400, 300);
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setVisible(true);
	}
}







