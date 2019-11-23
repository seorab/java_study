package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExam3 {
	public static void main(String[] args) throws IOException {
		ServerSocket sSocket = new ServerSocket(20000);
		Socket socket = sSocket.accept();
		
		InputStream in = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(in, "euc-kr");
		BufferedReader reader = new BufferedReader(isr);
		
		ServerReceiver sr = new ServerReceiver(reader);
		sr.start();
		
		OutputStream out = socket.getOutputStream();
		PrintWriter writer = new PrintWriter(out, true);
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			String data = scan.nextLine();
			writer.println(data);
		}
	}
}





