package swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// Shift + Ctrl + F : 소스코드 정렬
// menu - Source - Format
//Shift + Ctrl + O : 전체 import


public class SwingExam5 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("BorderLayout Test");
		frm.setBounds(120, 120, 300, 200);
		frm.setLayout(new BorderLayout());

		frm.add(new JButton("EAST"), BorderLayout.EAST);
		frm.add(new JButton("WEST"), BorderLayout.WEST);
		frm.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		frm.add(new JButton("NORTH"), BorderLayout.NORTH);
		frm.add(new JButton("CENTER"), BorderLayout.CENTER);

		frm.setVisible(true);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}