package WebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleXpath {

	public static void main(String[] args) {
	try {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Admin/Documents/SampleHTMLPage.html");
	WebElement ele = driver.findElement(By.xpath("html/body/div[1]/input[1]"));
	ele.clear();
	ele.sendKeys("Username");
	Thread.sleep(3000);
	driver.quit();
	}
	catch(Exception e)
	{
		System.out.println("Unable to access file at the moment");
	}
	}

}
