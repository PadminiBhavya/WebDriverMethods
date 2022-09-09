package WebDriverPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectClass2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/");
	driver.findElement(By.xpath("//button[text()='Customer Login']")).click();
	WebElement ele = driver.findElement(By.id("userSelect"));
	Select s = new Select(ele);
	if(!s.isMultiple())
	{
		s.selectByValue("2");
		
	}
		else
		{
			System.out.println("Its a multiselect listbox");
		}
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	WebElement accountSelect = driver.findElement(By.id("accountSelect"));
	accountSelect.click();
	Select s1 = new Select(accountSelect);
		List<WebElement> list = s1.getOptions();
		//To get the index of the option in the list box
		for(int i=0; i<list.size()-1; i++)
		{
			if(list.get(i).getText().equals("1004"))
			{
				System.out.println(i);
			}
		}
		//To print the different options in the list box
		for(WebElement accountNum: list)
		{
			System.out.println(accountNum.getText());	
		}
		s1.selectByValue("number:1005");
		//Actions ac = new Actions(driver);
		//WebElement bankAppLayout = driver.findElement(By.xpath("//body[@ng-app='BankApp']"));
		//ac.click(bankAppLayout);
		
		//To close the open listbox
		driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
		
	}
	}	
	

