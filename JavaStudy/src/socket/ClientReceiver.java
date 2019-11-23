package socket;

import java.io.BufferedReader;
import java.io.IOException;

public class ClientReceiver extends Thread {
	BufferedReader reader;
	
	public ClientReceiver(BufferedReader reader) {
		this.reader = reader;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println(reader.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}



