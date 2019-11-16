package swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/* 인터페이스 상속 후 클래스 사용 */
public class Swing3 implements MouseListener {
	public Swing3() { // 생성자
		JFrame j = new JFrame();
		//j.setBounds(x, y, width, height);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(400, 200);
		
		// 요소 배치 관리자 (Layout)
		j.setLayout(new FlowLayout());
		
		// 버튼 추가 
		JButton btn1 = new JButton();
		btn1.setText("버튼1");
		
		btn1.addMouseListener(this);
		
		j.add(btn1);

		JButton btn2 = new JButton();
		btn2.setText("버튼2");
		j.add(btn2);
		
		
		j.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}







