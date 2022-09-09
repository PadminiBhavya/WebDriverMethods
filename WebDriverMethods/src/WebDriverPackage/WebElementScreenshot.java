package WebDriverPackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	String timeStamp = LocalDateTime.now().toString().replace(':','-');
	driver.get("https://www.google.com/");
	//TakesScreenshot ts =(TakesScreenshot)driver;
	File tempFile = driver.findElement(By.name("q")).getScreenshotAs(OutputType.FILE);
	File destFile = new File("./errorshots/actitime" + timeStamp+ ".png");
	FileUtils.copyFile(tempFile, destFile);
	driver.quit();
	
	}

}
