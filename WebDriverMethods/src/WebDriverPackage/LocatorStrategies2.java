package WebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorStrategies2 {
	public static void main(String[] args)
	{
		try {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.tagName("b")).click();
		}
		catch(Exception e)
		{
			System.out.println("No such element is found");
			System.out.println(e);
		}
	}

}
