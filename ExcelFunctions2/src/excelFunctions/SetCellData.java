package excelFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetCellData {

	public static void main(String[] args) throws IOException {

		String path ="C:\\27062020\\Automation\\ExcelFunctions\\src\\excelFunctions\\TestData.xlsx";
		  
		  FileInputStream file = new FileInputStream(path);
	  
		  XSSFWorkbook wb = new XSSFWorkbook(file);
	  		  
		  XSSFSheet sheet=wb.getSheet("Test");
		
		  
		  XSSFRow row = sheet.getRow(0);
		  
		  XSSFCell cell = row.getCell(0);

		  
		  if(row==null)
		  {
			  row=sheet.createRow(0);
		  }
	
		  if(cell==null)
		  {
			  cell =row.createCell(0);
		  }
	
	 cell.setCellValue("anand");
	
	FileOutputStream fileout = new FileOutputStream(path);
	
	wb.write(fileout);
	
	}

}
