package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageActions.DemoEnterActions;
import utils.DriverSetup;

public class DemoSiteEnter {
	
	@Given("^Navigate to the website \"([^\"]*)\"$")
	public void navigateToWebsite(String webUrl)
	{
		DriverSetup.openUrl(webUrl);
	}
	
	@And("^Click on button to enter the website$")
	public void clickOnEnter()
	{
		DemoEnterActions DemoEnterActions = new DemoEnterActions();
		DemoEnterActions.clickEnterDemo();
	}
	
	@And("^Register page is Opened$")
	public void userMovesToRegister()
	{
		DemoEnterActions DemoEnterActions = new DemoEnterActions();
		DemoEnterActions.validateTitle();
	}
}
