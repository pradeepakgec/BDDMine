package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 
{
	public LoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "uid" )
	public static WebElement username;
	
	@FindBy(how = How.ID, using = "passw" )
	public static WebElement password;
	
	@FindBy(how = How.NAME, using = "btnSubmit" )
	public static WebElement submit;
	
	public void Login(String str1, String str2)
	{
		username.sendKeys(str1);
		password.sendKeys(str2);
		submit.click();
	}
	
}
