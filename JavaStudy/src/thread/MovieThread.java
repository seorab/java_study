package thread;

public class MovieThread extends Thread { // [�ڵ��ۼ�]
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("������ ���");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}