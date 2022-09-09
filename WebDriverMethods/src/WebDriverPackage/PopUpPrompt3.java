package WebDriverPackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpPrompt3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Admin/Documents/SampleHTMLPage5.html");
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.sendKeys("Test");
		Thread.sleep(5000);
		alert1.accept();

	}

}
