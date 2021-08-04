package Alerts;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Alerts 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","F:\\Soft Pract\\Testing Work\\Automation\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demoqa.com");
		
		// Click on Alert to Open ALert Page
		WebElement alertPage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
		alertPage.click();
		Thread.sleep(5000);
		//Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("http://demoqa.com//alertsWindows"));
		
		// Scroll Down in AlertMenu To Make Element Visible
		//WebElement AlertMenu = driver.findElement(By.xpath("//*[contains(text(),'Alerts')]")); //*[@id="item-1"]
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		//WebElement AlertMenu =
				driver.findElement(By.xpath("//*[contains(text(),'Alerts')]")).click();
		//Assert.assertTrue(AlertMenu.isDisplayed());
		System.out.println("Is Alert Menu Displayed ?");
		Thread.sleep(5000);
		
		
		
		// Alert With "OK" 
		WebElement Alert_OK = driver.findElement(By.id("alertButton"));
		Alert_OK.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
				
		
		driver.quit();
	}
}
