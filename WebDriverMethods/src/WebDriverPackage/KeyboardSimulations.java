package WebDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardSimulations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("Username");
		ele.sendKeys(Keys.CONTROL,"a");
		ele.sendKeys(Keys.CONTROL,"c");
		WebElement ele2 = driver.findElement(By.id("pass"));
		ele2.sendKeys(Keys.CONTROL,"v" );
	
	}

}
