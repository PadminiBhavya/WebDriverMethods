package WebDriverPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String filePath = "./resources/testdata.xlsx";
	FileInputStream fs = new FileInputStream(filePath);
	Workbook wb = WorkbookFactory.create(fs);
	Sheet sheet = wb.getSheet("TC002");
	int rowCount = sheet.getPhysicalNumberOfRows();
	int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
	for(int i=1; i<=rowCount-1; i++)
	{
	for(int j=0; j<=cellCount-1;j++)
	{
		System.out.print(sheet.getRow(i).getCell(j).toString()+ "::");
	}
	System.out.println();

	}

	}
}
