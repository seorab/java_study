package http;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Http2 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://ggoreb.com/http/list2.jsp");
		URLConnection urlConnection = url.openConnection();
		HttpURLConnection con = (HttpURLConnection) urlConnection;
		con.setRequestMethod("POST");
		con.setDoOutput(true);
		OutputStream out = con.getOutputStream();
		OutputStreamWriter osr = new OutputStreamWriter(out, "utf-8");
		BufferedWriter writer = new BufferedWriter(osr);
		writer.close();
		osr.close();
		out.close();
		InputStream in = con.getInputStream();
		InputStreamReader isr = new InputStreamReader(in, "utf-8");
		BufferedReader reader = new BufferedReader(isr);
		StringBuffer response = new StringBuffer();
		String data = null;

		while (true) {
			data = reader.readLine();
			if (data == null)
				break;
			response.append(data + "\n");
		}
		reader.close();
		isr.close();
		in.close();
		System.out.println(response);
	}
}