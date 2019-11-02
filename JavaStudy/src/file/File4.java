package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File4 {
	public static void main(String[] args) {
		try {
			FileInputStream fi = 
					new FileInputStream("e:/eclipse/file.bin");
			FileOutputStream fo = 
					new FileOutputStream("e:/eclipse/file2.bin");
			
			byte[] buffer = new byte[1024];
			System.out.println("시작");
			while(true) {
				int data = fi.read(buffer);
				if(data == -1) break;
				fo.write(buffer);
			}
			System.out.println("종료");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



