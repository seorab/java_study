package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class File6 {
	public static void main(String[] args) {
		try {
//			FileInputStream fi = new FileInputStream("text.txt");
			URL url = new URL("http://ggoreb.com/busanit"); // 서버 데이터 가져오기
			URLConnection con = url.openConnection(); 
			InputStream fi = con.getInputStream();
			
			InputStreamReader isr = new InputStreamReader(fi);
			BufferedReader reader = new BufferedReader(isr);
			
			while(true) {
				String d = reader.readLine();
				if(d == null) break;
				System.out.println(d);
			}
/*			
			int count = 0;
			int before = 0;
			while(true) {
//			for(;;)
				int data = fi.read();
				if(data == (int)'a') {
					count++;
				}
				if(data == -1) break;
				System.out.println((char)data);
				before = data;
			}
			System.out.println("a 의 개수 " + count);
*/			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



