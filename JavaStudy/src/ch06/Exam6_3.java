package ch06;

public class Exam6_3 {
	static void getDate(int m) {
		int[] month = {
			31, 28, 31, 30, 31, 
			30, 31, 31, 30, 31, 
			30, 31
		};
		int date = month[m - 1];
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		getDate(2);
		
//		int[] a = {1, 3, 5, 7, 8, 10, 12};
//		int[] b = {4, 6, 9, 11};
//		
//		int month = 3;
//		
//		for(int i = 0; i < a.length; i++) {
//			if(a[i] == month) {
//				System.out.println(31);
//			}			
//		}
//
//		for(int i = 0; i < b.length; i++) {
//			if(b[i] == month) {
//				System.out.println(30);
//			}			
//		}
	}
}
