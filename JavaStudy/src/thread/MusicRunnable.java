package thread;

public class MusicRunnable implements Runnable { // [�ڵ��ۼ�]
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("���� ���");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}