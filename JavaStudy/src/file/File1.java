package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fo = 
					new FileOutputStream("e:/eclipse/file.txt");
			fo.write(65);
			fo.write(80);
			fo.write(91);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
