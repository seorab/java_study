package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File2 {
	public static void main(String[] args) {
		try {
			FileInputStream fo = 
					new FileInputStream("e:/eclipse/file.txt");
			int data = fo.read();
			System.out.println(data);
			System.out.println( (char)data );
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
