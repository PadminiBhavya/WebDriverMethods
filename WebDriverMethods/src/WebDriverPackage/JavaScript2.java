package WebDriverPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript2 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.easemytrip.com");
		WebElement calendarDeparture = driver.findElement(By.xpath("//input[@placeholder='Departure']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].click();", calendarDeparture);
		Thread.sleep(3000);
		//jse.executeScript("arguments[0].value = '20/20/2022';", calendarDeparture);
		jse.executeScript("arguments[0].value = '20 Oct'2022';", calendarDeparture);
		
	}

}
