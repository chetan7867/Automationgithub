package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Verifycell {
	
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\dell\\Downloads\\selenium.xlsx");
		
        CellType CT = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getCellType();
           System.out.println(CT);

}
}
