package thread;

public class MovieThread extends Thread { // [코드작성]
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("동영상 재생");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}