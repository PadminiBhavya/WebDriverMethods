package WebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://github.com/signup");
	WebElement pwd = driver.findElement(By.id("password"));
	if (!(pwd.isDisplayed()))
	{
		System.out.print("Password is not displayed. Its a pass");
	}
	else
	{
		System.out.println("Password field is displayed. Its a fail");
	}
	}

}
