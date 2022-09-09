package WebDriverPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CSV1 {

	public static void main(String[] args) throws CsvValidationException, IOException {
	String filePath ="./resources/testdata1.csv";
	FileReader fr = new FileReader(filePath);
	CSVReader cr = new CSVReader(fr);
	String sarr[] = cr.readNext();
	while(sarr!=null)
	{
		System.out.println(sarr[0]+ " ");
		System.out.println(sarr[1]);
		sarr= cr.readNext();
	}
			cr.close();

	}

}
