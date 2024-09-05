package practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dynamic_writing_file_practise {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\dynamicFile.xlsx");
	    XSSFWorkbook workbook = new XSSFWorkbook();
	    XSSFSheet worksheet = workbook.createSheet("Testing");
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter how many rows");
	    
	    int totalRows = sc.nextInt();
	    
        System.out.println("Enter how many cells");
	    
	    int totalCells = sc.nextInt();
	    
	    for(int r=0;r<=totalRows;r++) {
	    	
	    	XSSFRow currentRow = worksheet.createRow(r);
	    	
	    	for(int c=0;c<totalCells;c++) {
	    		
	    		XSSFCell cell = currentRow.createCell(c);
	    		cell.setCellValue(sc.next());
	    		
	    	}
	    }
	    
	    workbook.write(file);
	    workbook.close();
	    file.close();
	    

	}

}
