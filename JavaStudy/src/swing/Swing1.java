package swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/* 익명 클래스 활용 */
public class Swing1 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		//j.setBounds(x, y, width, height);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(400, 200);
		
		// 요소 배치 관리자 (Layout)
		j.setLayout(new FlowLayout());
		
		// 버튼 추가 
		JButton btn1 = new JButton();
		btn1.setText("버튼1");
		btn1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("click");
			}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
		});
		j.add(btn1);

		JButton btn2 = new JButton();
		btn2.setText("버튼2");
		j.add(btn2);
		
		
		j.setVisible(true);
	}
}







