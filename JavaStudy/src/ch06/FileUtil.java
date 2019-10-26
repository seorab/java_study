package ch06;

import java.io.File;
import java.io.IOException;

public class FileUtil {
	public static void main(String[] args) throws IOException {
		File file = new File("c:/my_folder");
//		if(file.isDirectory() == false) {
		if(!file.isDirectory()) {
			file.mkdir(); // 폴더 만들기
		}
		
		File file2 = new File("c:/my_folder/my_text.txt");
		file2.createNewFile();
	}
}






