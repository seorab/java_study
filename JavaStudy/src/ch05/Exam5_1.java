package ch05;

public class Exam5_1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// 3. �ݺ����� �������� Ȱ��
		String sep = "";
		for(int i = 0; i < arr.length; i += 2) {
			System.out.print(sep + arr[i]);
			sep = ", ";
		}
		// 2. ����� �� ���� - ��� ���� Ȧ���� ���
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 2 != 0) {
//				System.out.print(arr[i] + " ");
//			}
//		}
		// 1. index ���� - index�� ¦���� ���
//		for(int i = 0; i < arr.length; i++) {
//			if(i % 2 == 0) {
//				System.out.print(arr[i] + " ");
//			}
//		}
	}
}