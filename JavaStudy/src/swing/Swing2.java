package swing;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// ��� Swing ��Ҵ� Ŭ���� ����
		// �� ��Ҹ� Component��� ���·� ã�Ƴ��� ����
		// ���� ����� ����� ����� Ȱ���ϱ� ���ؼ��� Down Casting
		JButton btn = (JButton) e.getComponent();
		String text = btn.getText();
		System.out.println(text + "Ŭ��!!!!!");
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
/* �������̽� ��� �� Ŭ���� ��� */
public class Swing2 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		//j.setBounds(x, y, width, height);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(400, 200);
		
		// ��� ��ġ ������ (Layout)
		j.setLayout(new FlowLayout());
		
		MyListener m = new MyListener();
		// ��ư �߰� 
		JButton btn1 = new JButton();
		btn1.setText("��ư1");
		btn1.addMouseListener(m);
		j.add(btn1);

		JButton btn2 = new JButton();
		btn2.setText("��ư2");
		btn2.addMouseListener(m);
		j.add(btn2);
		
		
		j.setVisible(true);
	}
}







