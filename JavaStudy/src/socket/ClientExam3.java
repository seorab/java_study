package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientExam3 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 20000);
		
		OutputStream out = socket.getOutputStream();
		PrintWriter writer = new PrintWriter(out, true);
		
		InputStream in = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(in, "utf-8");
		BufferedReader reader = new BufferedReader(isr);
		
		ClientReceiver cr = new ClientReceiver(reader);
		cr.start();
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			String data = scan.nextLine();
			writer.println(data);
			
		}
	}
}



