package generic;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchdata 
{
 public static String get_data(String sh , int row,int cell)
 {
	 
	 try
	 {
		 	FileInputStream fis = new FileInputStream("./Excel/Book1.xlsx");
		 	Workbook book = WorkbookFactory.create(fis);
		 	org.apache.poi.ss.usermodel.Sheet sheet = book.getSheet(sh);
		 	 Row row1 = sheet.getRow(row);
		 	Cell cell1 = row1.getCell(cell);
		 	 String value = cell1.getStringCellValue();
		 
		    
		 	System.out.println(value);
		 	
		 	
		 	
		 	
		 	
		 	
	 }
	 catch (Exception e)
	 {
		System.out.println(e); 
	 }
	
	return null;
	 
	 
	 
	 
	 
	 
}
	
	
	
	
}
