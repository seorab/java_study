package ch07;

public class Book {
	String 제목 = null;
	String 출판사;
	String 저자;
	int price = 0;
	public String get제목() {
		return 제목;
	}
	public void set제목(String 제목) {
		this.제목 = 제목;
	}
	public String get출판사() {
		return 출판사;
	}
	public void set출판사(String 출판사) {
		this.출판사 = 출판사;
	}
	public String get저자() {
		return 저자;
	}
	public void set저자(String 저자) {
		this.저자 = 저자;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
