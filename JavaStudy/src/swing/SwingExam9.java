package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SwingExam9 {
	static JTextArea textArea;
	public static void main(String[] args) {
		JFrame frm = new JFrame("JTextArea");
		frm.setBounds(120, 120, 250, 270);
		frm.setLayout(new FlowLayout());

		textArea = new JTextArea(10, 20);
		textArea.append("원하는 내용을 입력하세요.\n");
		textArea.setCaretPosition(textArea.getText().length());

		JButton btn = new JButton("Clear");
		btn.addActionListener(new ButtonTextHandler());
		frm.add(textArea);
		frm.add(btn);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}