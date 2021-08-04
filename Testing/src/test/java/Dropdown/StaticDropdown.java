package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","F:\\Soft Pract\\Testing Work\\Automation\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in//Register.html");
		
		// Year
		WebElement year = driver.findElement(By.id("yearbox"));
		Select sely = new Select(year);
		
		// Month
		WebElement month = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select selm = new Select(month);
		
		// Day
		WebElement day = driver.findElement(By.id("daybox"));
		Select seld = new Select(day);
				
		for(int i=100;i<sely.getOptions().size();i++)
		{
			System.out.println("************************************In Years************************************");
			sely.selectByIndex(i);
			for(int k=1;k<selm.getOptions().size();k++)
			{
				System.out.println("************************************In Months************************************");
				selm.selectByIndex(k);
				for(int j=1;j<seld.getOptions().size();j++)
				{
					//System.out.println("************************************In Days************************************\n");
					seld.selectByIndex(j);
					System.out.println("Year : Months : Day = "+sely.getOptions().get(i).getText()+" "+selm.getOptions().get(k).getText()+" "+seld.getOptions().get(j).getText()+"\n");
				}
			}
		}
		
		driver.quit();
	}
}
