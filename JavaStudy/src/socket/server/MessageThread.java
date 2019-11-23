
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

// 생성자를 이용하여 입출력스트림과 닉네임 저장
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
				String message = reader.readLine(); // 클라이언트 메세지 수신
// 메세지 수신시 모든 클라이언트에게 메세지 전달
				controller.sendAll("[" + this.nickName + "] " + message);
			} catch (IOException e) {
// 클라이언트와의 연결 해제시 퇴장으로 간주, 입출력스트림 해제
				isContinue = false;
				controller.removeClient(this);
				controller.sendAll("[" + nickName + "] 퇴장");
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