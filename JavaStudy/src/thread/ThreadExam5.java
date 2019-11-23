package thread;

public class ThreadExam5 {
	public static void main(String[] args) {
		ValueClass vc = new ValueClass();
		new MyThread5(vc, 1, 500).start();
		new MyThread5(vc, 501, 1000).start();
	}
}