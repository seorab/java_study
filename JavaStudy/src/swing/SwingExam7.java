package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingExam7 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("GridLayout Test");
		frm.setBounds(120, 120, 300, 200);
		frm.setLayout(new BorderLayout());
		
		JPanel panelWest = new JPanel();
		panelWest.setLayout(new FlowLayout());
		panelWest.add(new JButton("메뉴1"));
		panelWest.add(new JButton("메뉴2"));
		panelWest.add(new JButton("메뉴3"));
		
		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(new GridLayout(3, 3));
		for(int i = 1; i <= 9; i++) {
			panelCenter.add(new JButton(i + ""));
		}
		
		frm.add(panelWest, BorderLayout.WEST);
		frm.add(panelCenter, BorderLayout.CENTER);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}






