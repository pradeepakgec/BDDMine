package WindowsHandler;
 
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class WindowHandle {
public static void main(String[] args) throws InterruptedException
{
WebDriver driver; 
System.setProperty("webdriver.gecko.driver","F:\\Soft Pract\\Testing Work\\Automation\\geckodriver.exe");
driver = new ChromeDriver();
driver.get("https://courses.letskodeit.com/practice");
driver.manage().window().maximize();
String parentWindowHandle = driver.getWindowHandle();
System.out.println("Parent window's handle -> " + parentWindowHandle);
WebElement clickElement = driver.findElement(By.id("opentab"));
 
for(int i = 0; i < 5; i++)
{
clickElement.click();
Thread.sleep(3000);
}
 
Set<String> allWindowHandles = driver.getWindowHandles();
String lastWindowHandle = "";
for(String handle : allWindowHandles)
{
System.out.println("Switching to window - > " + handle);
System.out.println("Navigating to google.com");
driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
driver.get("http://google.com");
lastWindowHandle = handle;
System.out.println("Last Window: "+lastWindowHandle);
}
 
//Switch to the parent window
driver.switchTo().window(parentWindowHandle);
//close the parent window
driver.close();
//at this point there is no focused window, we have to explicitly switch back to some window.
driver.switchTo().window(lastWindowHandle);
driver.get("http://toolsqa.com");
driver.quit();
}
}