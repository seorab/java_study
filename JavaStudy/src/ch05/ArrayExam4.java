package ch05;

public class ArrayExam4 {
	public static void main(String[] args) {
		char[] chars = { 'b', 'e', 'z', 'a', 'w' };
		
		char �ӽð��� = ' '; 
		for(int i = 0; i < chars.length; i++) {
			char ���� = chars[i];
			for(int j = i+1; j < chars.length; j++) {
				char �񱳴�� = chars[j];
				if(���� > �񱳴��) {
					�ӽð��� = ����;
					���� = �񱳴��;
					�񱳴�� = �ӽð���;
				}
			}
		}
		
		System.out.println(chars);
	}
}