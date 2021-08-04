package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver; 
		System.setProperty("webdriver.gecko.driver","F:\\Soft Pract\\Testing Work\\Automation\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		// To find Links on Webpage
		List<WebElement> links = driver.findElements(ById.tagName("a"));
		int count = links.size();
		System.out.println("Links On Webpage are: "+count);
		for(int i=0; i<count; i++)
		{
			System.out.println("Link at position "+i+"   is : "+links.get(i).getText());
		}
		
		// Verification of Links
		for(int j=0; j<count; j++)
		{
			System.out.println("Link @ "+j+" is "+links.get(j).getText());
			links.get(j).click();
			System.out.println("Titile of the Page : "+driver.getTitle());
			driver.navigate().back();
			System.out.println("Iteration : "+j++);
			driver.close();
		}
		driver.quit();
	}

}
