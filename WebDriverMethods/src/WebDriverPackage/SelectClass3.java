package WebDriverPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass3 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	WebElement ele = driver.findElement(By.xpath("//label[text()='Sub Unit']/../..//div[@class='oxd-select-text oxd-select-text--active']"));
	ele.click();
	driver.switchTo().activeElement();
	/*JavascriptExecutor js =(JavascriptExecutor)driver;	
	js.executeScript(null, args)*/
	//Select s = new Select(ele);
	try {
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='oxd-select-dropdown --position-bottom']"));
		Thread.sleep(5000);
	System.out.println(list);
	for(WebElement option: list)
	{
		if(option.getText().equals("OrangeHRM"))
		{
			System.out.println(option.getText());
			option.click();
		}
	}
	
	}
	catch(Exception e)
	{
		System.out.println("this is the exception" + e);
	}
	}
}
