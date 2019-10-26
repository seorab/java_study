import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyMouse implements MouseListener {

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

public class MouseEventTest { // 실행 : Ctrl + F11
	public static void main(String[] args) {
		JFrame j = new JFrame();
		
		JButton btn = new JButton("버튼");
		btn.setBackground(Color.RED);
		btn.addMouseListener(new MyMouse());
		j.add(btn);
		
		j.setSize(300, 200);
		j.setVisible(true);
	}
}
















