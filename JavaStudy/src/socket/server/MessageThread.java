
package socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MessageThread extends Thread {
	private BufferedReader reader;
	private PrintWriter writer;
	private ServerController controller;
	private String nickName;
	private Socket socket;

// �����ڸ� �̿��Ͽ� ����½�Ʈ���� �г��� ����
	public MessageThread(Socket socket, BufferedReader reader, PrintWriter writer, String nickName) {
		this.socket = socket;
		this.reader = reader;
		this.writer = writer;
		this.controller = ServerController.getInstance();
		this.nickName = nickName;
	}

	@Override
	public void run() {
		boolean isContinue = true;
		while (isContinue) {
			try {
				String message = reader.readLine(); // Ŭ���̾�Ʈ �޼��� ����
// �޼��� ���Ž� ��� Ŭ���̾�Ʈ���� �޼��� ����
				controller.sendAll("[" + this.nickName + "] " + message);
			} catch (IOException e) {
// Ŭ���̾�Ʈ���� ���� ������ �������� ����, ����½�Ʈ�� ����
				isContinue = false;
				controller.removeClient(this);
				controller.sendAll("[" + nickName + "] ����");
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException e1) {
					}
				}
				if (writer != null) {
					writer.close();
				}
				if (socket != null) {
					try {
						socket.close();
					} catch (IOException e1) {
					}
				}
			}
		}
	}

	public void send(String message) {
		this.writer.println(message);
	}
}