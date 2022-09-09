package WebDriverPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.actitime.com/");
		String expectedtitle = "actiTIME Time Tracking Software For Smart Teams";
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String actualTitle =(String)jse.executeScript("return document.title;");
		System.out.println(actualTitle);

	}

}
