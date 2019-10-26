package ch07.exam01;

import java.util.Scanner;

public class Exam01 {
	static final int INSERT = 1;
	static final int SELECT = 2;
	static final int EXIT = 3;
	
	// �������� Member �迭 ����
	Member[] members = new Member[5];
	int count = 0;
	
	public static void main(String[] args) {
		boolean isExit = false;

		Exam01 e = new Exam01();
		/* 1-1. ���α׷� ���� ��� */
		while (!isExit) {
			System.out.println("=================");
			System.out.println("1.�Է� 2.��ȸ 3.����");
			System.out.println("=================");

			// 1-2. ����� �Է� ���
			Scanner s = new Scanner(System.in);
			int inputNum = s.nextInt();
			switch(inputNum) {
			case Exam01.INSERT: 
				// �Է� �޼ҵ� ����
				e.insert();
				break; // break�� ������ 2�� case�� ���� ����
			case Exam01.SELECT:
				// ��ȸ �޼ҵ� ����
				e.select();
				break;
			case Exam01.EXIT:
				isExit = true; // ����
				break;
			default:
				System.out.println("1 ~ 3�� ���ڸ� �Է����ּ���.");
			} // end switch
		} // end while
	} // end main method
	
	void insert() {
		Scanner s = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���.");
		String name = s.nextLine(); // ���ڿ��� �Է¹����� nextLine()
		System.out.println("���̸� �Է����ּ���.");
		int age = s.nextInt(); // ���� �Է¹����� nextInt()
		Member m = new Member(); // ȸ�������� Ŭ����(�ν��Ͻ�)�� ����
		m.name = name;
		m.age = age;
		members[count] = m;
		count++;
	}
	
	void select() {
		// members �迭 ���
		for(int i = 0; i < count; i++) { // 1��
			if(members[i] != null) { // 2��
				System.out.printf(
				  "�̸�:%s, ����:%d", members[i].name, members[i].age);
			}
		}
	}
} // end Exam01 class

class Member {
	String name;
	int age;
}












