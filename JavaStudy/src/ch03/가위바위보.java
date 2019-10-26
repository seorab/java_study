package ch03;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {
	public static void main(String[] args) {
		int com = 0; // 초기화
		int player = 0; // 초기화
		player += com;
		
		// 컴퓨터가 랜덤으로 가위바위보 내기
		Random r = new Random();
		com = r.nextInt(3); // 0, 1, 2
		System.out.println(com);
		
		// 플레이어가 키보드 입력을 통해서 가위바위보 내기
		Scanner s = new Scanner(System.in);
		player = s.nextInt();
		
		// 가위바위보 공식 표현
		if( (player + 1) % 3 == com ) {
			int a = 0;
			System.out.println("컴퓨터 이김");
		} else {
			if(player == com) {
				System.out.println("비김");
			} else {
				System.out.println("플레이어 이김");
			}
		}
	}
}
