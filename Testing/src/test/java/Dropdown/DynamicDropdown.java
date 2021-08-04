package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropdown 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","F:\\Soft Pract\\Testing Work\\Automation\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.easemytrip.com");
		
		// From
		WebElement from = driver.findElement(By.id("FromSector_show"));
		from.click();
		
		WebElement from_drop = driver.findElement(By.className("tp-cit"));
		List<WebElement> from_list = from_drop.findElements(By.tagName("li"));		
		
		for(WebElement ele : from_list)
		{
			if(ele.getText().contains("Goa"))
			{
				ele.click();
				WebElement from_selection = driver.findElement(By.className("spnair"));
				System.out.println("From "+""+from_selection.getText()+""+" Is Selected Successfully !!!!!!!!");
				break;
			}
		}
		
		// To
		WebElement to = driver.findElement(By.id("Editbox13_show"));
		to.click();
		
		WebElement to_drop = driver.findElement(By.className("tp-cit"));
		List<WebElement> to_list = to_drop.findElements(By.tagName("li"));
		to_list.get(6).click();
		
		
		driver.quit();
	}
}
