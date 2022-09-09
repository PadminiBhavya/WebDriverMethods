package WebDriverPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com");
	List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
	//System.out.println(listOfLinks);
	
	for(WebElement ele : listOfLinks)
	{
		if(ele.isDisplayed())
		{
			String name = ele.getText();
			System.out.println(name);
		}
	}
	}

}
