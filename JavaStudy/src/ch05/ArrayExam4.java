package ch05;

public class ArrayExam4 {
	public static void main(String[] args) {
		char[] chars = { 'b', 'e', 'z', 'a', 'w' };
		
		char 임시공간 = ' '; 
		for(int i = 0; i < chars.length; i++) {
			char 선택 = chars[i];
			for(int j = i+1; j < chars.length; j++) {
				char 비교대상 = chars[j];
				if(선택 > 비교대상) {
					임시공간 = 선택;
					선택 = 비교대상;
					비교대상 = 임시공간;
				}
			}
		}
		
		System.out.println(chars);
	}
}