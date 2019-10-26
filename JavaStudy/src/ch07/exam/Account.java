package ch07.exam;

public class Account {
	String 계좌번호;
	String 예금주;
	int 잔액;
	
	public Account() {
		
	}
	
	public Account(String 계좌번호, String 예금주, int 잔액) {
		this.계좌번호 = 계좌번호;
		this.예금주 = 예금주;
		this.잔액 = 잔액;
	}
	
	String 계좌정보() {
		return "[계좌번호:" + 계좌번호 + "] 잔액 " + 잔액;
	}
	
	public String get계좌번호() {
		return 계좌번호;
	}
	public void set계좌번호(String 계좌번호) {
		this.계좌번호 = 계좌번호;
	}
	public String get예금주() {
		return 예금주;
	}
	public void set예금주(String 예금주) {
		this.예금주 = 예금주;
	}
	public int get잔액() {
		return 잔액;
	}
	public void set잔액(int 잔액) {
		this.잔액 = 잔액;
	}
}
