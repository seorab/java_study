package string;

public class CharAt {
	public static void main(String[] args) {
		String str = "Java Secure Coding";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}
	}
}