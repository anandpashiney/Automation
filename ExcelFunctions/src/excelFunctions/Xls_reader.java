package excelFunctions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_reader {
	
	public String getCellData(String path, String SheetName , int rowNum ,int colNum) throws IOException
	{
		  
		  FileInputStream file = new FileInputStream(path);
	  
		  XSSFWorkbook wb = new XSSFWorkbook(file);
	  		  
		  XSSFSheet sheet=wb.getSheet(SheetName);
		
		  
		  XSSFRow row = sheet.getRow(rowNum);
		  
		  XSSFCell cell = row.getCell(colNum);
     
		  
		  String data = cell.getStringCellValue();
			System.out.println(data);
		
		  
		   return data;
		  
		 
	
	}

}
