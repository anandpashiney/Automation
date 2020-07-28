package excelFunctions;

public class UseReader {

	public static void main(String[] args) {


		Xls_reader xl = new Xls_reader();
		
		String path ="C:\\27062020\\Automation\\ExcelFunctions\\src\\excelFunctions\\TestData.xlsx";
 
		
		String data = xl.getCellData(path, "Sheet1", 0, 0);
		
		
	}

}
