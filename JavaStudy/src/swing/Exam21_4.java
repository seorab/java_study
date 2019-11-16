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

		// 선택된 버튼의 좌표 확인 (setName으로 지정된 값)
		String xy = btn.getName();
		System.out.println(xy);
		// X Y 를 숫자로 변환/분리
		// 01
		// 34
		int x = Integer.parseInt(xy.substring(0, 1));
		int y = Integer.parseInt(xy.substring(1, 2));
		check[x][y] = true;
		int count = 0;
		/* 가로줄 완성 확인 코드 */
		for(int i = 0; i < 5; i++) {
			// 행 고정, 열 i 값으로 변경 되는 상태를 체크하여 5개가 만족되면 한줄 빙고!
			if(check[x][i] == true) {
				count = count + 1;
			}
		}
		if(count == 5) {
			System.out.println("가로 1줄 빙고!");
		}
		count = 0;
		/* 세로줄 완성 확인 코드 */
		for(int i = 0; i < 5; i++) {
			if(check[i][y] == true) {
				count++;
			}
		}
		if(count == 5) {
			System.out.println("세로 1줄 빙고!");
		}
		
	}
}





