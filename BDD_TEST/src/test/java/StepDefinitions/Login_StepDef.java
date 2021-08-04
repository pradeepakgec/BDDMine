package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDef 
{
	
	WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_on_Login_Page() 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Soft Pract\\Testing Work\\Automation\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://demo.testfire.net//login.jsp");
	}
	
	@When("^user logs in with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_Login(String user, String pass)
	{
		LoginPage logV = new LoginPage(driver);
		logV.Login(user, pass);
	}
	
	@Then("^user home page is diplayed$")
	public void user_Login_Success()
	{
		System.out.println("Test");
		if(driver.getCurrentUrl().equalsIgnoreCase("http://demo.testfire.net//login.jsp"))
		{
			System.out.println("User credentials are incorrect");
		}
		else
		{
			System.out.println("User LogIn UnSucessful");
		}
		driver.quit();
	}
	
	@Then("^error message is diplayed for incor$")
	public void error_messg()
	{
		
	}
	
}
