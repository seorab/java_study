package ch03;

import java.util.Random;
import java.util.Scanner;

public class ���������� {
	public static void main(String[] args) {
		int com = 0; // �ʱ�ȭ
		int player = 0; // �ʱ�ȭ
		player += com;
		
		// ��ǻ�Ͱ� �������� ���������� ����
		Random r = new Random();
		com = r.nextInt(3); // 0, 1, 2
		System.out.println(com);
		
		// �÷��̾ Ű���� �Է��� ���ؼ� ���������� ����
		Scanner s = new Scanner(System.in);
		player = s.nextInt();
		
		// ���������� ���� ǥ��
		if( (player + 1) % 3 == com ) {
			int a = 0;
			System.out.println("��ǻ�� �̱�");
		} else {
			if(player == com) {
				System.out.println("���");
			} else {
				System.out.println("�÷��̾� �̱�");
			}
		}
	}
}
