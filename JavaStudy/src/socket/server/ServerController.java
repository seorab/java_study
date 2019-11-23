package socket.server;

import java.util.ArrayList;

public class ServerController {
	private static ServerController controller = new ServerController();
	private ArrayList<MessageThread> clients = new ArrayList<MessageThread>();

// �̱��� ���� ����� ���ؼ� ������ ���� (private)
	private ServerController() {
	}

	public static ServerController getInstance() {
		if (controller == null) {
			controller = new ServerController();
		}
		return controller;
	}

//Ŭ���̾�Ʈ ���ӽ� �߰�
	public void addClient(MessageThread client) {
		clients.add(client);
	}

//Ŭ���̾�Ʈ ����� ����
	public void removeClient(MessageThread client) {
		clients.remove(client);
	}

//���� ���ӵǾ� �ִ� ��� Ŭ���̾�Ʈ(Thread)���� �޼��� ����
	public void sendAll(String message) {
		for (MessageThread client : clients) {
			client.send(message);
		}
	}
}