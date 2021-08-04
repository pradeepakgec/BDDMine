package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOn {
	
	WebDriver driver;
	public void setUp()
	{
		
	}
	
	@Given("Navigate to the URL")
	public void navigate_to_the_url() {
		System.out.println("URL");
	}
	
	@And("Click on SignIn or LogIn button")
	public void click_on_sign_in_or_log_in_button() {
		System.out.println("Login Form Open");
	}
	
	@When("Enter username ([^\"]*), password ([^\"]*)")
	public void enter_username_username_password_password() {
		System.out.println("Provide Credentials");
	}
	
	@And("Click on LogIn button")
	public void click_on_log_in_button() {
		System.out.println("Submit Form");
	}
	
	@Then("Vadidate Login status")
	public void vadidate_login_status() {
		System.out.println("Success");
	}
}
