
package socket.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		Socket socket = null;
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader reader = null;
		OutputStream out = null;
		PrintWriter writer = null;
		Scanner scan = new Scanner(System.in);
		try {
			socket = new Socket("127.0.0.1", 20000);
			in = socket.getInputStream();
			isr = new InputStreamReader(in, "utf-8");
			reader = new BufferedReader(isr);
			out = socket.getOutputStream();
			writer = new PrintWriter(out, true);
			new MessageReceiver(reader).start();
// ���� ���� �� �г��� ����
			System.out.println("�г����� �Է��ϼ���.");
			System.out.print("=> ");
			String nickName = scan.nextLine();
			writer.println(nickName);
//�޼��� �Է� ���
			while (true) {
				String msg = scan.nextLine();
				writer.println(msg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scan.close();
			writer.close();
		}
	}
}