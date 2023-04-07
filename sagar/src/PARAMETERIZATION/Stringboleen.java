package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Stringboleen {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\dell\\Downloads\\selenium.xlsx");
		
		boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getBooleanCellValue();
		System.out.println(data);
	

}
}
