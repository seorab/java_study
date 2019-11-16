package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Exam21_4 {
	public static void main(String[] args) {
		Bingo b = new Bingo();
		b.display();
	}
}

class BtnHandler implements ActionListener {
	boolean[][] check = new boolean[5][5];
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.LIGHT_GRAY);

		// ���õ� ��ư�� ��ǥ Ȯ�� (setName���� ������ ��)
		String xy = btn.getName();
		System.out.println(xy);
		// X Y �� ���ڷ� ��ȯ/�и�
		// 01
		// 34
		int x = Integer.parseInt(xy.substring(0, 1));
		int y = Integer.parseInt(xy.substring(1, 2));
		check[x][y] = true;
		int count = 0;
		/* ������ �ϼ� Ȯ�� �ڵ� */
		for(int i = 0; i < 5; i++) {
			// �� ����, �� i ������ ���� �Ǵ� ���¸� üũ�Ͽ� 5���� �����Ǹ� ���� ����!
			if(check[x][i] == true) {
				count = count + 1;
			}
		}
		if(count == 5) {
			System.out.println("���� 1�� ����!");
		}
		count = 0;
		/* ������ �ϼ� Ȯ�� �ڵ� */
		for(int i = 0; i < 5; i++) {
			if(check[i][y] == true) {
				count++;
			}
		}
		if(count == 5) {
			System.out.println("���� 1�� ����!");
		}
		
	}
}





