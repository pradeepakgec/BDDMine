package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","F:\\Soft Pract\\Testing Work\\Automation\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.cricbuzz.com//live-cricket-scorecard//26853/caxi-vs-enga-1st-unofficial-odi-england-lions-tour-of-australia-2020");
		
		WebElement tab = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-hdr-rw']"));
		
		//To get all the rows
		List<WebElement> rows = tab.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms"));
		List<WebElement> count = tab.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(4)"));
		
		System.out.println("No Of Rows are : "+count.size());
		
		driver.quit();
	}

}
