package string;

import java.util.Scanner;

public class Exam12_1_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		double d = Math.pow(2, 38);
		System.out.println((long) d);
		
		System.out.print("���̵� �Է����ּ���. => ");
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();
		System.out.println(id);
		
		boolean isUpper = false;
		boolean isLower = false;

		for(int i = 0; i < id.length(); i++) {
			char c = id.charAt(i);
			if(c >= ASCII_A && c <= ASCII_Z) {
				isUpper = true;
			} else if(c >= ASCII_a && c <= ASCII_z) {
				isLower = true;
			}
		}
		if(isUpper && isLower) {
			System.out.println("���� �Ϸ�");
		} else {
			System.out.println("�ٽ� �Է����ּ���");
		}

		s.close();
	}
}




