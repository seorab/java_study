package ch07.exam01;

import java.util.Scanner;

public class Exam01 {
	static final int INSERT = 1;
	static final int SELECT = 2;
	static final int EXIT = 3;
	
	// 전역변수 Member 배열 생성
	Member[] members = new Member[5];
	int count = 0;
	
	public static void main(String[] args) {
		boolean isExit = false;

		Exam01 e = new Exam01();
		/* 1-1. 프로그램 설명 출력 */
		while (!isExit) {
			System.out.println("=================");
			System.out.println("1.입력 2.조회 3.종료");
			System.out.println("=================");

			// 1-2. 사용자 입력 대기
			Scanner s = new Scanner(System.in);
			int inputNum = s.nextInt();
			switch(inputNum) {
			case Exam01.INSERT: 
				// 입력 메소드 실행
				e.insert();
				break; // break가 없으면 2번 case도 같이 실행
			case Exam01.SELECT:
				// 조회 메소드 실행
				e.select();
				break;
			case Exam01.EXIT:
				isExit = true; // 종료
				break;
			default:
				System.out.println("1 ~ 3번 숫자만 입력해주세요.");
			} // end switch
		} // end while
	} // end main method
	
	void insert() {
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String name = s.nextLine(); // 문자열을 입력받을때 nextLine()
		System.out.println("나이를 입력해주세요.");
		int age = s.nextInt(); // 정수 입력받을때 nextInt()
		Member m = new Member(); // 회원정보를 클래스(인스턴스)에 저장
		m.name = name;
		m.age = age;
		members[count] = m;
		count++;
	}
	
	void select() {
		// members 배열 출력
		for(int i = 0; i < count; i++) { // 1번
			if(members[i] != null) { // 2번
				System.out.printf(
				  "이름:%s, 나이:%d", members[i].name, members[i].age);
			}
		}
	}
} // end Exam01 class

class Member {
	String name;
	int age;
}












