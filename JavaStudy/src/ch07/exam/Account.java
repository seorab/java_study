package ch07.exam;

public class Account {
	String ���¹�ȣ;
	String ������;
	int �ܾ�;
	
	public Account() {
		
	}
	
	public Account(String ���¹�ȣ, String ������, int �ܾ�) {
		this.���¹�ȣ = ���¹�ȣ;
		this.������ = ������;
		this.�ܾ� = �ܾ�;
	}
	
	String ��������() {
		return "[���¹�ȣ:" + ���¹�ȣ + "] �ܾ� " + �ܾ�;
	}
	
	public String get���¹�ȣ() {
		return ���¹�ȣ;
	}
	public void set���¹�ȣ(String ���¹�ȣ) {
		this.���¹�ȣ = ���¹�ȣ;
	}
	public String get������() {
		return ������;
	}
	public void set������(String ������) {
		this.������ = ������;
	}
	public int get�ܾ�() {
		return �ܾ�;
	}
	public void set�ܾ�(int �ܾ�) {
		this.�ܾ� = �ܾ�;
	}
}
