package thread;

public class MyThread2 implements Runnable {
	String name;

	MyThread2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " : " + i);
		}
	}
}