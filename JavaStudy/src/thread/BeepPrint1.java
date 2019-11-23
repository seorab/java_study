package thread;

import java.awt.Toolkit;

public class BeepPrint1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}
		}).start();
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("½ÇÇà");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}