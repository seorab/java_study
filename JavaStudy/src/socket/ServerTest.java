package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10000);
		System.out.println("server start");
		Socket s = ss.accept();
		System.out.println("client connect");
		
		InputStream in = s.getInputStream();
		InputStreamReader isr = 
			new InputStreamReader(in);
		BufferedReader reader =
			new BufferedReader(isr);
		
		while(true) {
			String msg = reader.readLine();
			System.out.println(msg);
		}
	}
}







