package ch07;

import java.util.Scanner;

public class BookStore {
	public static void main(String[] args) {
		Book book = new Book();
		
		Scanner s = new Scanner(System.in);
		System.out.println("제목을 입력해주세요");
		String 제목 = s.nextLine();
		book.제목 = 제목;

		System.out.println("저자를 입력해주세요");
		book.저자 = s.nextLine();

		System.out.println("가격을 입력해주세요");
		book.price = s.nextInt();
	}
}







