package readFile;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\writingOps.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("ops");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Tc_001");
		row1.createCell(1).setCellValue("V1.1");
		row1.createCell(2).setCellValue("Sigin");
		row1.createCell(3).setCellValue("High");
		row1.createCell(4).setCellValue("Functional");
		row1.createCell(5).setCellValue("User");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Tc_002");
		row2.createCell(1).setCellValue("V1.1");
		row2.createCell(2).setCellValue("Sigin");
		row2.createCell(3).setCellValue("Medium");
		row2.createCell(4).setCellValue("Functional");
		row2.createCell(5).setCellValue("User");
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("Tc_003");
		row3.createCell(1).setCellValue("V1.1");
		row3.createCell(2).setCellValue("Sigin");
		row3.createCell(3).setCellValue("Low");
		row3.createCell(4).setCellValue("Functional");
		row3.createCell(5).setCellValue("User");
		
		XSSFRow row4 = sheet.createRow(3);
		row4.createCell(0).setCellValue("Tc_004");
		row4.createCell(1).setCellValue("V1.1");
		row4.createCell(2).setCellValue("Sigin");
		row4.createCell(3).setCellValue("High");
		row4.createCell(4).setCellValue("Functional");
		row4.createCell(5).setCellValue("User");
		
		
		XSSFRow row5 = sheet.createRow(4);
		row5.createCell(0).setCellValue("Tc_004");
		row5.createCell(1).setCellValue("V1.1");
		row5.createCell(2).setCellValue("Sigin");
		row5.createCell(3).setCellValue("Medium");
		row5.createCell(4).setCellValue("Functional");
		row5.createCell(5).setCellValue("User");
		
		
		XSSFRow row6 = sheet.createRow(5);
		row6.createCell(0).setCellValue("Tc_005");
		row6.createCell(1).setCellValue("V1.1");
		row6.createCell(2).setCellValue("Sigin");
		row6.createCell(3).setCellValue("Low");
		row6.createCell(4).setCellValue("Functional");
		row6.createCell(5).setCellValue("User");
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		
	}

	

}

