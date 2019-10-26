package ch06;

public class Exam6_2 {
	static void getBetweenSum(int a, int b) {
		int total = 0;
		
		int temp = 0;
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		for(int i = a; i <= b; i++) {
			total = total + i;
		}
		System.out.println(total);
	}
	public static void main(String[] args) {
		getBetweenSum(5, 3);
		getBetweenSum(3, 5);
	}
}
