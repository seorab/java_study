package socket.client;

import java.io.BufferedReader;
import java.io.IOException;

public class MessageReceiver extends Thread {
	private BufferedReader reader;

	public MessageReceiver(BufferedReader reader) {
		this.reader = reader;
	}

	@Override
	public void run() {
		boolean isContinue = true;
		while (isContinue) {
			try {
				String message = reader.readLine();
				System.out.println(message);
			} catch (IOException e) {
				isContinue = false;
			}
		}
	}
}