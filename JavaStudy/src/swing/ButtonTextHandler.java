package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class ButtonTextHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		SwingExam9.textArea.setText("모두 지웠습니다.\n");
		SwingExam9.textArea.append("원하는 내용을 입력하세요.\n");
	}
}



