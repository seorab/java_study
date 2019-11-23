package socket.server;

import java.util.ArrayList;

public class ServerController {
	private static ServerController controller = new ServerController();
	private ArrayList<MessageThread> clients = new ArrayList<MessageThread>();

// 싱글톤 패턴 사용을 위해서 생성자 숨김 (private)
	private ServerController() {
	}

	public static ServerController getInstance() {
		if (controller == null) {
			controller = new ServerController();
		}
		return controller;
	}

//클라이언트 접속시 추가
	public void addClient(MessageThread client) {
		clients.add(client);
	}

//클라이언트 퇴장시 제거
	public void removeClient(MessageThread client) {
		clients.remove(client);
	}

//현재 접속되어 있는 모든 클라이언트(Thread)에게 메세지 전송
	public void sendAll(String message) {
		for (MessageThread client : clients) {
			client.send(message);
		}
	}
}