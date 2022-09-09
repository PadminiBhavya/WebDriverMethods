package WebDriverPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	String filePath = "./resources/testdata.xlsx";
	String status = null;
	FileInputStream fs = new FileInputStream(filePath);
	Workbook wb = WorkbookFactory.create(fs);
	Sheet sh = wb.getSheet("TC004");
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	String expectedUrl = "https://demo.actitime.com/login.do";
	String actualUrl = driver.getCurrentUrl();
	
	sh.getRow(1).createCell(4).setCellValue(actualUrl);
	if(actualUrl.equals(expectedUrl))
	{
	System.out.println("Pass: Login Url is correct");
	status= "PASS";
	}
	else
	{
		System.out.println("Fail:The login Url is incorrect");
		status="FAIL";
	}
	
	sh.getRow(1).createCell(5).setCellValue(status);
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(10000);
	
	String actualLoggedInUrl = driver.getCurrentUrl();
	String expectedLoggedInUrl = "https://demo.actitime.com/user/submit-tt.do";
	
	sh.getRow(2).createCell(4).setCellValue(actualLoggedInUrl);
	
	if(actualLoggedInUrl.equals(expectedLoggedInUrl))
	{
		System.out.println("Pass: Logged in URL is correct");
		status = "PASS";
	}
	else
	{
		System.out.println("Fail: Logged in URl is incorrect");
		status = "FAIL";
	}
	
	sh.getRow(2).createCell(5).setCellValue(status);
	
	String expectedTitle = "actiTIME - Enter Time-Track";
	String actualTitle = driver.getTitle();
	
	sh.getRow(3).createCell(4).setCellValue(actualTitle);
	
	if(actualTitle.equals(expectedTitle))
	{
		System.out.println("Pass: Title is correct");
		status="PASS";
	}
	else
	{
		System.out.println("Fail: Title is incorrect");
		status= "FAIL";
	}
	sh.getRow(3).createCell(5).setCellValue(status);
	
	FileOutputStream fout = new FileOutputStream(filePath);
	wb.write(fout);
	}
	}

