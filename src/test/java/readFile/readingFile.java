package readFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testData\\ops1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet worksheet = workbook.getSheet("Sheet1");
		
		int totalrows = worksheet.getLastRowNum();
		int totalcolumn = worksheet.getRow(0).getLastCellNum();
		
		System.out.println(totalrows);
		System.out.println(totalcolumn);
		
		for(int r=0;r<=totalrows;r++) {
			
			XSSFRow currentRow = worksheet.getRow(r);
			
			for(int c=0;c<totalcolumn;c++) {
				XSSFCell cell = currentRow.getCell(c);
				System.out.println(cell.toString());
			}
		}
		
		workbook.close();
		file.close();     
	}
	

}

