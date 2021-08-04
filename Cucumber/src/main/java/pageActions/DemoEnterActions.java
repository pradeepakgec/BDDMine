package pageActions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import pageLocators.DemoEnterLocators;
import utils.DriverSetup;

public class DemoEnterActions {

	DemoEnterLocators DemoEnterLocators = null;
	
	public DemoEnterActions()
	{
		this.DemoEnterLocators=new DemoEnterLocators();
		PageFactory.initElements(DriverSetup.getDriver(), DemoEnterLocators);
	}
		
	public void clickEnterDemo()
	{
		String page = DriverSetup.getDriver().getCurrentUrl();
		System.out.println("User is on Page : "+page);
		if(page.equalsIgnoreCase("http://demo.automationtesting.in/"))
		{
			DemoEnterLocators.enterDemoLink.click();
		}
	}
	
	public void validateTitle()
	{
		String register = DriverSetup.getDriver().getTitle();
		Assert.assertTrue(register.equalsIgnoreCase("Register"));
		System.out.println("User is moved to page: "+register);
		System.out.println("Closing the Driver...");
	}
}
