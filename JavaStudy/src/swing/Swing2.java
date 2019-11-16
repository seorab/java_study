package swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// 모든 Swing 요소는 클릭이 가능
		// 각 요소를 Component라는 형태로 찾아낼수 있음
		// 실제 요소의 기능을 제대로 활용하기 위해서는 Down Casting
		JButton btn = (JButton) e.getComponent();
		String text = btn.getText();
		System.out.println(text + "클릭!!!!!");
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
/* 인터페이스 상속 후 클래스 사용 */
public class Swing2 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		//j.setBounds(x, y, width, height);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(400, 200);
		
		// 요소 배치 관리자 (Layout)
		j.setLayout(new FlowLayout());
		
		MyListener m = new MyListener();
		// 버튼 추가 
		JButton btn1 = new JButton();
		btn1.setText("버튼1");
		btn1.addMouseListener(m);
		j.add(btn1);

		JButton btn2 = new JButton();
		btn2.setText("버튼2");
		btn2.addMouseListener(m);
		j.add(btn2);
		
		
		j.setVisible(true);
	}
}







