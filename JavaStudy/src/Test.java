import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test { // ���� : Ctrl + F11
	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		
		JButton btn = new JButton("��ư");
//		btn.setBackground(Color.RED);
		j.add(btn);

		JButton btn2 = new JButton("��ư");
//		btn.setBackground(Color.RED);
		j.add(btn2);
		
		JButton btn3 = new JButton("��ư");
//		btn.setBackground(Color.RED);
		j.add(btn3);
		
		j.setSize(300, 200);
		j.setVisible(true);
	}
}
















