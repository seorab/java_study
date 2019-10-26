package ch06;

public class Exam6_1 {
	static int checkGrade(int n) {
		int result = 0;
		if(n >= 10) {
			result = 1;
			System.out.println(1);
		} else if(n >= 7) {
			result = 2;
			System.out.println(2);
		} else if(n >= 4) {
			result = 3;
			System.out.println(3);
		} else {
			result = 4;
			System.out.println(4);
		}
		return result;
	}
	
	public static void main(String[] args) {
		checkGrade(15);
	}
}








