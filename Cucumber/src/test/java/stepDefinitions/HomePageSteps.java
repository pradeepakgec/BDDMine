package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageActions.HomePageActions;
import utils.DriverSetup;

public class HomePageSteps {

	@Given("^Open \"([^\"]*)\" in the browser$")
	public void open_in_the_browser(String webUrl) {
		DriverSetup.openUrl(webUrl);
	}
	
	@When("^Click on \"([^\"]*)\" menu$")
	public void click_on_menu(String inputFormsMenu) {
		HomePageActions HomePageActions = new HomePageActions();
		HomePageActions.navigateInputFormsMenu(inputFormsMenu);
	}
	
	@And("^Click on \"([^\"]*)\" link$")
	public void click_on(String inputFormSubmit) {
		HomePageActions HomePageActions = new HomePageActions();
		HomePageActions.clickInputFormSubmit(inputFormSubmit);
	}
}
