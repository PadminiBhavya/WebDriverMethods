package WebDriverPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://collegedunia.com/contact-us");
		driver.findElement(By.id("fullname")).sendKeys("test");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9684357877");
		driver.findElement(By.name("message")).sendKeys("NA");
		driver.findElement(By.xpath("//button[text()='Send']")).click();
	}

}
