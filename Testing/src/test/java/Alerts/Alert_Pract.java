package Alerts;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Alert_Pract 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","F:\\Soft Pract\\Testing Work\\Automation\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in//Alerts.html");
				
		// Alert With "OK" 
		WebElement Alert_OK = driver.findElement(By.xpath("//*[contains(text(),'Alert with OK ')]")); 
		Alert_OK.click();
		System.out.println("Before Alert : OK");
		driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
		System.out.println("After Alert : OK");
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println("Click on Alert : OK");
		alert.accept();
				
		// Alert With "OK" & "Cancel"
		WebElement Alert_O_C = driver.findElement(By.xpath("//*[contains(text(),'Alert with OK & Cancel')]")); 
		Alert_O_C.click();
		System.out.println("Before Alert : CANCEL");
		driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
		System.out.println("After Alert : CANCEL");
		Alert alert_o_c = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println("Click on Alert : CANCEL");
		alert_o_c.dismiss();
		
		driver.quit();
	}
}
