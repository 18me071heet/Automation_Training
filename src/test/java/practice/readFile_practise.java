package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readFile_practise {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testData\\myAccount.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet worksheet = workbook.getSheet("Sheet1");
		int totalrow = worksheet.getLastRowNum();
		int totalCell = worksheet.getRow(0).getLastCellNum();
		
		System.out.println(totalrow);
		System.out.println(totalCell);
		
		for(int r=0;r<=totalrow;r++) {
			
			XSSFRow currentrow = worksheet.getRow(r);
			
			for(int c=0;c<totalCell;c++) {
				
				XSSFCell cell = currentrow.getCell(c);
				System.out.println(cell.toString());
			}
			
		}
		
		workbook.close();
		file.close();
		
		

	}

}
