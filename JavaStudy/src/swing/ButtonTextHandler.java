package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class ButtonTextHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		SwingExam9.textArea.setText("��� �������ϴ�.\n");
		SwingExam9.textArea.append("���ϴ� ������ �Է��ϼ���.\n");
	}
}



