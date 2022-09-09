package WebDriverPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties1 {

	public static void main(String[] args) throws IOException {
	String filePath = "./resources/config.properties";
	FileInputStream fs = new FileInputStream(filePath);
	Properties pr = new Properties();
	pr.load(fs);
	String url = pr.getProperty("appUrl");
	String Key = pr.getProperty("chromeKey");
	String path = pr.getProperty("chromePath");
	String time = pr.getProperty("ito");

	System.setProperty(Key, path);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(time)));
	driver.get(url);
	}

}
