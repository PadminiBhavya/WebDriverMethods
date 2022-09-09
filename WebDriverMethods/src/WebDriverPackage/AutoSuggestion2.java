package WebDriverPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.udemy.com/");
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(5000);
	List<WebElement> auto = driver.findElements(By.xpath("//ul[@id = 'u7-search-form-autocomplete--3-menu-content-items']/li/a"));
	int count = auto.size();
	System.out.println(count);
	
	for(WebElement ele : auto)
	{
		System.out.println(ele.getText());
	}

	}

}
