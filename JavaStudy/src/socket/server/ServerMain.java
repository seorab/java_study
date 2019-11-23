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
		ServerSocket sSocket = null; // 서버 사용 소켓
		Socket socket = null; // 클라이언트와 연결될 소켓
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader reader = null;
		OutputStream out = null;
		PrintWriter writer = null;
		try {
			sSocket = new ServerSocket(20000);
// 컨트롤러 객체 생성 (싱글톤 패턴 - 객체 1개만 생성)
			ServerController controller = ServerController.getInstance();
			while (true) {
				System.out.println("접속 대기");
				socket = sSocket.accept(); // 클라이언트 접속 대기
				in = socket.getInputStream();
				isr = new InputStreamReader(in, "utf-8");
				reader = new BufferedReader(isr);
				out = socket.getOutputStream();
				writer = new PrintWriter(out, true);
				String nickName = reader.readLine(); // 최초 메세지를 이용해서 닉네임 저장
				System.out.println("[" + nickName + "] 접속");
// 클라이언트 1개 당 스레드 1개 생성
				MessageThread client = new MessageThread(socket, reader, writer, nickName);
				client.start();
// 컨트롤러에게 접속자를 알려줘서 추가
				controller.addClient(client);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}