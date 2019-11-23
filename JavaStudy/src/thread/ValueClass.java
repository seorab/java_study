package thread;

public class ValueClass {
	private int number;

	public synchronized void addNumber(int number) {
		this.number += number;
	}

	public int getNumber() {
		return number;
	}
}