package ch05;

public class Exam5_1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// 3. 반복문의 증감식을 활용
		String sep = "";
		for(int i = 0; i < arr.length; i += 2) {
			System.out.print(sep + arr[i]);
			sep = ", ";
		}
		// 2. 요소의 값 기준 - 요소 값이 홀수인 경우
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 2 != 0) {
//				System.out.print(arr[i] + " ");
//			}
//		}
		// 1. index 기준 - index가 짝수인 경우
//		for(int i = 0; i < arr.length; i++) {
//			if(i % 2 == 0) {
//				System.out.print(arr[i] + " ");
//			}
//		}
	}
}