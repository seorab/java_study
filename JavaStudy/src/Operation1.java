public class Operation1 {
	// 코드정렬 : Shift + Ctrl + F
	public static void main(String[] args) {
		int a = 10;

		// a의 값을 음수로
		a = -a;
		System.out.println(a);

		// a의 값 출력 후 증가
		System.out.println(a++);

		// 위의 증가된 a의 값 확인
		System.out.println(a);

		// a의 값 감소 후 출력
		System.out.println(--a);
		boolean b = true;
		System.out.println(b);

		// b의 값 논리 부정
		b = !b;
		System.out.println(b);
		char c1 = 'a';
		char c2 = c1++;
		char c3 = ++c1;
		System.out.println(c2);
		System.out.println(c3);
	}
}





