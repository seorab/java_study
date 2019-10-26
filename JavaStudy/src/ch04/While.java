package ch04;
//          F2 - 이름 변경
public class While {
	public static void main(String[] args) {
		int num = 123456789;
		
//		while(num > 0) {
		for(;num > 0;) {
			int num1 = num % 10; // 5
			num = num / 10; // 1234
			System.out.println(num1);
		}
	}
}
