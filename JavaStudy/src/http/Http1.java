package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Http1 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://ggoreb.com/http/html1.jsp");
		URLConnection urlConnection = url.openConnection();
		InputStream in = urlConnection.getInputStream();
		InputStreamReader isr = new InputStreamReader(in, "utf-8");
		BufferedReader reader = new BufferedReader(isr);
		StringBuffer response = new StringBuffer();
		String data = null;
		while (true) {
			data = reader.readLine();
			if (data == null) break;
			int idx = data.indexOf("title=");
			if(idx > -1) { // title=  이라는 문자열이 존재한다면..
				String title = data.substring(idx+7, idx + 9);
				System.out.println(title);
			}
			response.append(data + "\n");
		}
		reader.close();
		isr.close();
		in.close();
		System.out.println(response);
	}
}




