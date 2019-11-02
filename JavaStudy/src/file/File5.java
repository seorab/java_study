package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class File5 {
	public static void main(String[] args) {
		try {
			FileInputStream fi = 
					new FileInputStream("text.txt");
			// OOStream => Reader 변환시켜주는 보조 스트림
			InputStreamReader isr = new InputStreamReader(fi);
			
			BufferedReader reader = new BufferedReader(isr);
			int count = 0;
			while(true) {
				String d = reader.readLine();
				if(d == null) break;
				int idx = d.indexOf("Python");
				if(idx > -1) {
					count++;
				}
				System.out.println(d);
			}
			System.out.println("Python의 개수 " + count);
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



