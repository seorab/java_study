package thread;

public class ThreadExam2 {
	public static void main(String[] args) {
		
		String name = "first";
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(name);
			}
		}).start();
		
		
		
		new Thread(new MyThread2("first")).start();
		
//		MyThread2 tt1 = new MyThread2("first");
//		MyThread2 tt2 = new MyThread2("second");
//		Thread thread1 = new Thread(tt1);
//		Thread thread2 = new Thread(tt2);
//		thread1.start();
//		thread2.start();
	}
}