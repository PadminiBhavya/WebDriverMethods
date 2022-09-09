package WebDriverPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		List<WebElement> auto= driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		int count = auto.size();
		System.out.println(count);
		for(WebElement ele: auto)
		{
			System.out.println(ele.getText());
			
		}
		auto.get(count-5).click();
		
	}

}
