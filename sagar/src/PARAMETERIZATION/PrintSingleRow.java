package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintSingleRow {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\dell\\Downloads\\selenium.xlsx");
		
		 org.apache.poi.ss.usermodel.Sheet sheet1 = WorkbookFactory.create(file).getSheet("Sheet1");
		
		short cellsize = sheet1.getRow(0).getLastCellNum();
		
System.out.println(cellsize);
		
		for  (int i=0; i<cellsize;i++) {
			
		String data = sheet1.getRow(0).getCell(i).getStringCellValue();
	     System.out.println(" "+data);

}
}
}
				

