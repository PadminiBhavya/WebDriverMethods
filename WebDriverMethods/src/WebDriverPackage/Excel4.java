package WebDriverPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	String filePath = "./resources/testdata.xlsx";
	FileInputStream fs = new FileInputStream(filePath);
	Workbook wb = WorkbookFactory.create(fs);
	Sheet sh = wb.getSheet("TC003");
	int rowsCount = sh.getPhysicalNumberOfRows();
	int cellCount = sh.getRow(0).getPhysicalNumberOfCells();
	String sarr[][] = new String[rowsCount-1][cellCount];
	for(int i =1,k=0;i<=rowsCount-1;i++,k++)
	{
		for(int j=0;j<=cellCount-1;j++)
		{
			sarr[k][j]= sh.getRow(i).getCell(j).toString();
		}
	}
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/login/");
	
	for(int i=0;i<=sarr.length-1;i++)
	{
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement ele1 = driver.findElement(By.id("email"));
	ele1.sendKeys(sarr[i][0]);
	Thread.sleep(5000);
	WebElement ele2 = driver.findElement(By.id("pass"));
	ele2.sendKeys(sarr[i][1]);
	Thread.sleep(5000);
	js.executeScript("arguments[0].value='';", ele1);
	js.executeScript("arguments[0].value='';", ele2);
	sarr[i][0]=null;
	sarr[i][1]=null;
	System.out.println(sarr[i][0] + " " + sarr[i][1]);
	
	}

	}

}
