package WebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//For elementInterceptedException, use javascript code for execution
public class FlipkartLoginLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement LoginButton = driver.findElement(By.xpath("//a[text()='Login']"));
		jse.executeScript("arguments[0].click;",LoginButton);
		driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']/../..//input[@type='text']")).sendKeys("Username");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();

	}

}
