package ch07.exam;

public class Main {
	public static void main(String[] args) {
		Account a = new Account();
		a.���¹�ȣ = "1002-03-0001000";
		a.�ܾ� = 100000;
		System.out.println(a.��������());
		
		Account b = new Account("1-2-3", "ȫ�浿", 900000);
		System.out.println(b.��������());
	}
}
