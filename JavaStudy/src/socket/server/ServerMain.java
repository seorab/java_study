package socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	public static void main(String[] args) {
		ServerSocket sSocket = null; // ���� ��� ����
		Socket socket = null; // Ŭ���̾�Ʈ�� ����� ����
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader reader = null;
		OutputStream out = null;
		PrintWriter writer = null;
		try {
			sSocket = new ServerSocket(20000);
// ��Ʈ�ѷ� ��ü ���� (�̱��� ���� - ��ü 1���� ����)
			ServerController controller = ServerController.getInstance();
			while (true) {
				System.out.println("���� ���");
				socket = sSocket.accept(); // Ŭ���̾�Ʈ ���� ���
				in = socket.getInputStream();
				isr = new InputStreamReader(in, "utf-8");
				reader = new BufferedReader(isr);
				out = socket.getOutputStream();
				writer = new PrintWriter(out, true);
				String nickName = reader.readLine(); // ���� �޼����� �̿��ؼ� �г��� ����
				System.out.println("[" + nickName + "] ����");
// Ŭ���̾�Ʈ 1�� �� ������ 1�� ����
				MessageThread client = new MessageThread(socket, reader, writer, nickName);
				client.start();
// ��Ʈ�ѷ����� �����ڸ� �˷��༭ �߰�
				controller.addClient(client);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}