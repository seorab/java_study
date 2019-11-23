package thread;

public class MusicRunnable implements Runnable { // [코드작성]
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("음악 재생");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}