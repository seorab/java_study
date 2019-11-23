package socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.0.106", 10000);
		
		OutputStream out = s.getOutputStream();
		OutputStreamWriter osw = 
			new OutputStreamWriter(out);
		BufferedWriter writer = 
			new BufferedWriter(osw);
		Scanner scan = new Scanner(System.in);
		while(true) {
			String msg = scan.nextLine();
			writer.write(msg + "\n"); // 보낼 문자열
			writer.flush(); // 보내기
		}
	}
}








