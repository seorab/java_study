package ch04;

import java.util.Random;
import java.util.Scanner;

public class Exam4_6 {
	public static void main(String[] args) {
		Scanner[] scans = new Scanner[7];
		Random[] randoms = new Random[5];
		
		int[] s = new int[30];
		s[5] = 1000;
		int ss5 = s[5];
		
		
		int s1 = 100;
		double d = 10.0;
		char c = 'A';
		
		int s5 = 60;
		
		int total = s1 + s5;
		double average = total / 30.0;
		
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= 5; j++) {
				if(5 - i >= j) {
					System.out.print(" ");
				} else {
					System.out.print("@");
				}
			}
			System.out.println();
		}
		
		
	}
}









