package string;

public class Test {
	public static void main(String[] args) {
		String s = "abc";
//		for(int i = 0; i < 50000; i++) {
//			s = s + i;
//		}
//		System.out.println("end!");
		
		System.out.println();
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 5000000; i++) {
			sb.append(i);
		}
		System.out.println("end!");
	}
}





