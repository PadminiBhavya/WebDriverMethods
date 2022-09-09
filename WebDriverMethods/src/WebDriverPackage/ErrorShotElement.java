package WebDriverPackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorShotElement {
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		String timeStamp = LocalDateTime.now().toString().replace(':','-');
		File tempFile = driver.findElement(By.xpath("//img[@src='/dist/img/logo-aT.svg']")).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/actitimelogo"+ timeStamp + ".png");
		FileUtils.copyFile(tempFile, destFile);
	}

}
