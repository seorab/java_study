package ch06;

import java.util.Scanner;

public class MethodExam3 {
	static int nextInt(int ... bound) {
		return 0;
	}
	
	int nextInt(int bound) {
		double num = Math.random(); // 0.0 <= X < 1.0 
		//System.out.println(num);
		int result = (int) (num * bound); // 0.0 <= X < 10
		return result;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.nextInt();
		
		
		MethodExam3 m = new MethodExam3();
		
		
		nextInt(1,2,3,4,5,7);
		
		int num = m.nextInt(10);
		System.out.println(num);
	}
}








