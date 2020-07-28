package excelFunctions;

import java.io.IOException;

public class UseReader {

	public static void main(String[] args) throws IOException {

		String path ="C:\\27062020\\Automation\\ExcelFunctions\\src\\excelFunctions\\TestData.xlsx";

		Xls_reader xl = new Xls_reader(path);
		
 
		
		String data = xl.getCellData(path, "Sheet1", 0, 0);
		
		
	}

}
