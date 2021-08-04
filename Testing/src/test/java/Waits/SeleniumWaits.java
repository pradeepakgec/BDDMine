package Waits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWaits {


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","F:\\Soft Pract\\Testing Work\\Automation\\chromeDriver.exe");
		driver = new FirefoxDriver();
		driver.get("https:\\courses.letskodeit.com\\practice");
		List<WebElement> ls = driver.findElements(ById.tagName("a"));
		for(int i=0; i<ls.size();i++)
		{
			System.out.println("Link for: "+ls.get(i).getText());
		}
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("This to validate Implicut Wait");
		driver.quit();
	}
}
