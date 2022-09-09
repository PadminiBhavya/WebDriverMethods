package WebDriverPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChileElement2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Admin/Documents/SampleHTMLPage1.html");
		WebElement parent = driver.findElement(By.id("id1"));
		List<WebElement> list = parent.findElements(By.xpath(".//span[@id='S1']"));
		
		for(WebElement ele: list)
		{
			System.out.println(ele.getText());
		}

	}

}
