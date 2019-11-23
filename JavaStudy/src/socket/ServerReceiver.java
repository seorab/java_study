package socket;

import java.io.BufferedReader;
import java.io.IOException;

public class ServerReceiver extends Thread {
	BufferedReader reader;
	
	public ServerReceiver(BufferedReader reader) {
		this.reader = reader;
	}
	
	@Override
	public void run() {
		while(true) {
			String data;
			try {
				data = reader.readLine();
				System.out.println(data);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}






