package excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Test {
	public static void main(String[] args) throws BiffException, IOException {
		File f = new File("excel.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh = wb.getSheet(0);
		
		int rows =sh.getRows(); // ¿¢¼¿ÀÇ ÀüÃ¼ Çà ¼ö
		
		for(int i = 0; i < rows; i++) {
			Cell cell = sh.getCell(0, i);
			String con = cell.getContents();
			System.out.println(con);
			
			Cell cell2 = sh.getCell(1, i);
			String con2 = cell2.getContents();
			System.out.println(con2);
			
		}
		
	}
}










