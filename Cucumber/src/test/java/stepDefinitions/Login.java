package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver;
	
	//@Before
	public void browserInitiation()
	{
		System.out.println("Browser Launching .....\n");
	}
	
	@Given("User navigates to the URL and clicks on SignIn or LogIn button")
	public void navigationToURL() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("1 - User navigates to the URL");
		/*System.setProperty("webdriver.chrome.driver","F:\\Soft Pract\\Testing Work\\Automation\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://demo.testfire.net//login.jsp");*/
	}
	@When("^User enters username ([^\"]*) and password ([^\"]*)$")
	public void credentialsProvider(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("3 - User enters username "+username+ " and password "+ password);
	}
	@And("User provides Gender, Age, Location and EmailID clicks on SignIn or LogIn button")
	public void userDeatils(DataTable table) {
		List<Map<String,String>> data = table.asMaps(String.class, String.class);
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("4 - User enters Name "+data.get(0).get("Name")+ " and Email "+ data.get(0).get("EmailID"));
		System.out.println("5 - User enters Name "+data.get(1).get("Name")+ " and Email "+ data.get(1).get("EmailID"));
	}	
	@Then("User Login should be successful")
	public void loginStatus() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("6 - User should be logged in successfully");
	}
	
	//@After
	public void browserClosing()
	{
		System.out.println("Quiting the Browser .....");
		System.out.println("*************** End Of Test **************\n");
	}
}
