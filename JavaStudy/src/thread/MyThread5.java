package thread;

public class MyThread5 extends Thread {
	ValueClass vc;
	int start;
	int end;

	MyThread5(ValueClass vc, int start, int end) {
		this.vc = vc;
		this.start = start;
		this.end = end;
	}

	public void run() {
		for (int i = start; i <= end; i++) {
			vc.addNumber(i);
		}
		System.out.println(vc.getNumber());
	}
}