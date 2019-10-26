package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File3 {
	public static void main(String[] args) {
		try {
			FileInputStream fi = 
					new FileInputStream("e:/eclipse/file.txt");
			FileOutputStream fo = 
					new FileOutputStream("e:/eclipse/file2.txt");
			
			int data = fi.read();
			fo.write(data);
			
			data = fi.read();
			fo.write(data);
			
			data = fi.read();
			fo.write(data);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



