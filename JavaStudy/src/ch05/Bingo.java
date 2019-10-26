package ch05;

import java.util.Arrays;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		int[] bingo = new int[25];
		
		// 1 - 빙고판의 숫자 채우기
		for(int i = 0; i < 25; i++) {
			bingo[i] = i + 1;
		}
		System.out.println(   Arrays.toString(bingo)   );
		
		// 2 - 빙고 숫자 섞어주기
		for(int i = 0; i < 100; i++) {
			Random r = new Random();
			int num = r.nextInt(25);
			int temp = bingo[0];
			bingo[0] = bingo[num];
			bingo[num] = temp;
		}
		System.out.println(   Arrays.toString(bingo)   );
		
		// 3 - 빙고 출력하기 (5개씩)
		for(int i = 0; i < 25; i++) {
			if(i % 5 == 0) {
				System.out.println();
			}
			
			System.out.print( 
				(bingo[i] < 10) ? "0" + bingo[i] : bingo[i]  );
			System.out.print(" ");
		}
		
	}
}





