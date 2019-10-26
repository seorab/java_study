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
			
			while(true) {
				int data = fi.read();
				if(data == -1) break;
				fo.write(data);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



