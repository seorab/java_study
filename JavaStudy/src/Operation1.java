public class Operation1 {
	// �ڵ����� : Shift + Ctrl + F
	public static void main(String[] args) {
		int a = 10;

		// a�� ���� ������
		a = -a;
		System.out.println(a);

		// a�� �� ��� �� ����
		System.out.println(a++);

		// ���� ������ a�� �� Ȯ��
		System.out.println(a);

		// a�� �� ���� �� ���
		System.out.println(--a);
		boolean b = true;
		System.out.println(b);

		// b�� �� �� ����
		b = !b;
		System.out.println(b);
		char c1 = 'a';
		char c2 = c1++;
		char c3 = ++c1;
		System.out.println(c2);
		System.out.println(c3);
	}
}





