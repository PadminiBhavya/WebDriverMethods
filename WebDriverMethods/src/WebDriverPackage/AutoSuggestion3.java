package WebDriverPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		List<WebElement> auto= driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		String searchKey = "SELENIUM";
		for(WebElement ele: auto)
		{
			String searchKeyString = ele.getText().toUpperCase();
			if(searchKeyString.contains(searchKey))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
		}

	}

}
