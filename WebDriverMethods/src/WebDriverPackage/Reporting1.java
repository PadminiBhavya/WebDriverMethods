package WebDriverPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporting1 {
	@Test
	public void report()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/");
		Reporter.log("Login page is open", true);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Reporter.log("entered username", true);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Reporter.log("Entered password", true);
		driver.findElement(By.id("loginButton")).click();
		Reporter.log("clicked Login", true);
		driver.quit();
		
	}

}
