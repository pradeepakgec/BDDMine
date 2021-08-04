package pageActions;

import org.openqa.selenium.support.PageFactory;

import pageLocators.HomePageLocators;
import utils.DriverSetup;

public class HomePageActions {

	HomePageLocators homeLocate = null;
	
	public HomePageActions()
	{
		this.homeLocate=new HomePageLocators();
		PageFactory.initElements(DriverSetup.getDriver(), homeLocate);
	}
	
	public void closeDialogueBox()
	{
		System.out.println("If Dialogue Present");
		if(homeLocate.dialogueBoxClose.isDisplayed())
		{
			System.out.println("Dialogue Click");
			homeLocate.dialogueBoxClose.click();
		}
	}
	
	public void navigateInputFormsMenu(String url)
	{
		homeLocate.inputFormsLink.click();
	}
	
	public void clickInputFormSubmit(String formLink)
	{
		closeDialogueBox();
		homeLocate.inputFormSubmitLink.click();
	}
}
