package WebDriverPackage;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World");
		Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		System.out.println("Chrome browser launched successfully");
		driver.get("https://www.google.com");
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		String title = driver.getTitle();
		System.out.println("Title of the current webpage is " +title);
		//String source = driver.getPageSource();
		//System.out.println(source);
		driver.get("https://www.amazon.in/");
		Navigation nav=driver.navigate();
		nav.back();
		nav.forward();
		nav.refresh();
		
	}

}
