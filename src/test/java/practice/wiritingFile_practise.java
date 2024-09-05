package practice;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class wiritingFile_practise {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\testSheet.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet ws = wb.createSheet("testing");
		
		
		XSSFRow row = ws.createRow(0);
		row.createCell(0).setCellValue("Test Case");
		row.createCell(1).setCellValue("Version");
		row.createCell(2).setCellValue("Test Scenario");
		row.createCell(3).setCellValue("Test Type");
		row.createCell(4).setCellValue("Priority");
		
		
		XSSFRow row2 = ws.createRow(1);
		row2.createCell(0).setCellValue("Tc_001");
		row2.createCell(1).setCellValue("v1.1");
		row2.createCell(2).setCellValue("Manage Account");
		row2.createCell(3).setCellValue("Functional");
		row2.createCell(4).setCellValue("High");
		
		XSSFRow row3 = ws.createRow(2);
		row3.createCell(0).setCellValue("Tc_002");
		row3.createCell(1).setCellValue("v1.1");
		row3.createCell(2).setCellValue("Manage Account");
		row3.createCell(3).setCellValue("Smoke");
		row3.createCell(4).setCellValue("Medium");
		
		XSSFRow row4 = ws.createRow(3);
		row4.createCell(0).setCellValue("Tc_003");
		row4.createCell(1).setCellValue("v1.1");
		row4.createCell(2).setCellValue("Manage Account");
		row4.createCell(3).setCellValue("Smoke");
		row4.createCell(4).setCellValue("High");
		
		
		XSSFRow row5 = ws.createRow(4);
		row5.createCell(0).setCellValue("Tc_004");
		row5.createCell(1).setCellValue("v1.1");
		row5.createCell(2).setCellValue("Manage Account");
		row5.createCell(3).setCellValue("UI");
		row5.createCell(4).setCellValue("Low");
		
		wb.write(file);
		wb.close();
		file.close();
		

	}

}
