package thread;

public class Exam20_1 {
	public static void main(String[] args) {
		// MovieThread ���� �� ������ ����
		MovieThread mt = new MovieThread();
		mt.start();
		
		// MusicRunnable ���� �� ������ ����
		MusicRunnable mr = new MusicRunnable();
		Thread t = new Thread(mr);
		t.start();
	}
}







