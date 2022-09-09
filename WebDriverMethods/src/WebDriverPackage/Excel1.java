package WebDriverPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String filePath = "./resources/testdata.xlsx";
	FileInputStream fs = new FileInputStream(filePath);
	Workbook wb = WorkbookFactory.create(fs);
	String url = wb.getSheet("TC001").getRow(1).getCell(0).getStringCellValue();
	String username = wb.getSheet("TC001").getRow(1).getCell(1).getStringCellValue();
	String password = wb.getSheet("TC001").getRow(1).getCell(2).getStringCellValue();
	
	System.out.println(url);
	System.out.println(username);
	System.out.println(password);
	
	}
}

