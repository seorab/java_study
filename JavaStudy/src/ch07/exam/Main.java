package ch07.exam;

public class Main {
	public static void main(String[] args) {
		Account a = new Account();
		a.°èÁÂ¹øÈ£ = "1002-03-0001000";
		a.ÀÜ¾× = 100000;
		System.out.println(a.°èÁÂÁ¤º¸());
		
		Account b = new Account("1-2-3", "È«±æµ¿", 900000);
		System.out.println(b.°èÁÂÁ¤º¸());
	}
}
