package readFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dynamicWritingFile {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\dynamicData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet worksheet = workbook.createSheet("dynamic");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many rows");
		int noofRows = sc.nextInt();
		
		System.out.println("Enter how many colums");
		int noofColums = sc.nextInt();
		
		for(int r=0;r<=noofRows;r++) {
			
			XSSFRow currentrow = worksheet.createRow(r);
			
			for(int c=0;c<noofColums;c++) {
				
				XSSFCell cell = currentrow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
	}

}
