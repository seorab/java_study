package swing;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Bingo {
	final int SIZE = 5;
	JButton[][] btns = null;
	String[][] words = { { "����", "�η��", "Ȳ��", "��ѱ�", "�����" }, { "����", "Ÿ��", "�ξ���", "�û���", "���" },
			{ "��", "��", "������", "�ײ�", "��" }, { "����", "������", "�ܵ�", "��Ȳ", "����" }, { "��ġ", "���", "�޹���", "�Ҳ���", "���" } };

	public void display() {
		JFrame frm = new JFrame("����");
		frm.setLayout(new GridLayout(SIZE, SIZE));
		frm.setBounds(100, 100, 500, 500);
		BtnHandler handler = new BtnHandler();
		btns = new JButton[SIZE][SIZE];
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length; j++) {
				btns[i][j] = new JButton(words[i][j]);
				btns[i][j].addActionListener(handler); // �̺�Ʈ ���
				btns[i][j].setName(i + "" + j); // ��ư�� ��ǥ ����
				frm.add(btns[i][j]);
			}
		}
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}