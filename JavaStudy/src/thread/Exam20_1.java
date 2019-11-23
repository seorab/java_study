package thread;

public class Exam20_1 {
	public static void main(String[] args) {
		// MovieThread 생성 및 스레드 시작
		MovieThread mt = new MovieThread();
		mt.start();
		
		// MusicRunnable 생성 및 스레드 시작
		MusicRunnable mr = new MusicRunnable();
		Thread t = new Thread(mr);
		t.start();
	}
}







