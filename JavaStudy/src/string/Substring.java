package string;

public class Substring {
	public static void main(String args[]) {
		//            012345 67     12 15        23
		String str = "Java ������ �缺�� ���� ����������!!";

		while(true) {
			if(str.length() == 0) {
				break;
			}
			str = str.substring(0, str.length() - 1);
			System.out.println(str);
		}

		// ������ ���� 24
//		int len = str.length();
		
		// back space �����
//		str = str.substring(0, len - 1);
//		System.out.println(str);
		
//		str = str.substring(0, str.length() - 1);
//		System.out.println(str);
		
//		String str1 = str.substring(0);
//		System.out.println(str1);
//		
//		String str2 = str.substring(5, 8);
//		System.out.println(str2);
	}
}