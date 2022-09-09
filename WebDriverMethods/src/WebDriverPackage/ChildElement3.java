package WebDriverPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildElement3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Admin/Documents/SampleHTMLPage2.html");
		WebElement table = driver.findElement(By.id("books"));
		List<WebElement> ele = table.findElements(By.tagName("td"));
		
		for(WebElement booksData: ele)
		{
			int num = Integer.parseInt(booksData.getText());
			System.out.println(num);
		}

	}

}
