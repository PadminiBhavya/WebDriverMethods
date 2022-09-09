package WebDriverPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		List<WebElement> auto= driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		List<String> actualOrder = new ArrayList<String>();
		
		for(WebElement ele: auto)
		{
			actualOrder.add(ele.getText());
		}

		List<String> sortedOrder = new ArrayList<String>(actualOrder);
		Collections.sort(sortedOrder);
		
	System.out.println("Actual Order is "+actualOrder);
	System.out.println("______________________________");
	System.out.println("Sorted Order is "+sortedOrder);
	}

}
