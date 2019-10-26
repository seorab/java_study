package excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Lotto {
	public static void main(String[] args) throws BiffException, IOException {
		File f = new File("lotto.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh = wb.getSheet(0);
		
		int rows =sh.getRows(); // 엑셀의 전체 행 수

		//        4번째 행부터 데이터 가져오기
		for(int i = 3; i < rows; i++) {
			Cell cell = sh.getCell(13, i);
			String con = cell.getContents();
			System.out.print(con + " ");
			
			Cell cell2 = sh.getCell(14, i);
			String con2 = cell2.getContents();
			System.out.print(con2 + " ");
			
			Cell cell3 = sh.getCell(15, i);
			String con3 = cell3.getContents();
			System.out.print(con3 + " ");
			
			Cell cell4 = sh.getCell(16, i);
			String con4 = cell4.getContents();
			System.out.print(con4 + " ");
			
			Cell cell5 = sh.getCell(17, i);
			String con5 = cell5.getContents();
			System.out.print(con5 + " ");
			
			Cell cell6 = sh.getCell(18, i);
			String con6 = cell6.getContents();
			System.out.print(con6 + " ");
			
			Cell cell7 = sh.getCell(19, i);
			String con7 = cell7.getContents();
			System.out.println(con7);
			
		}
		
	}
}










