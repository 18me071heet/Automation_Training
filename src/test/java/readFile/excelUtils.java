package readFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
    public static XSSFWorkbook wb;
    public static XSSFSheet ws;
    public static XSSFRow row;
    public static XSSFCell cell;
    
    public static int getrowCount(String xlfile,String xlsheet) throws IOException {
    	
    	fi=new FileInputStream(xlfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.createSheet(xlsheet);
    	
    	int rowCount = ws.getLastRowNum();
    	wb.close();
    	fi.close();
		return rowCount;
    	
    }
    
    public static int getcellCount(String xlfile,String xlsheet,int rowNum) throws IOException {
    	fi=new FileInputStream(xlfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.createSheet(xlsheet);
    	row=ws.getRow(rowNum);
    	
    	int cellCount = row.getLastCellNum();
    	wb.close();
    	fi.close();
		return cellCount;
    }
    
    
    
    public static String getcellData(String xlfile,String xlsheet,int rowNum,int coloumNum) throws IOException {
    	fi=new FileInputStream(xlfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.createSheet(xlsheet);
    	row=ws.getRow(rowNum);
    	cell=row.getCell(coloumNum);
    	
    	String data;
    	
    	try {
    		
    		data=cell.toString();
    	}
    	
    	catch(Exception e) {
    		
    		data="";
    	}
    	
    	wb.close();
    	fi.close();
    	return data;
    }
	
    
    public static void setcellData(String xlfile,String xlsheet,int rowNum,int coloumNum,String data) throws IOException {
    	
    	fi=new FileInputStream(xlfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.createSheet(xlsheet);
    	row=ws.getRow(rowNum);
    	cell=row.getCell(coloumNum);
    	cell.setCellValue(data);
    	  	
    	fo=new FileOutputStream(xlfile);
    	wb.createSheet(xlsheet);
    	wb.close();
    	fi.close();
    	fo.close();
    	
    }
	
}
