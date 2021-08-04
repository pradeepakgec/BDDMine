package stepDefinitions;

import io.cucumber.java.After;
import utils.DriverSetup;

public class AfterActions {
	
	@After
	public static void afterActionsTearDown()
	{
		DriverSetup.tearDown();
		System.out.println("###### This is After Method ######");
		//WebDriver driver = DriverSetup.getDriver();
		//System.out.println("Scenario Failure: "+scenario.isFailed());
		//if(scenario.isFailed())
		//{
			//byte[] screenshotBytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			//scenario.attach(screenshotBytes, "image/png", "Test First Cucumber");
		//}
	}
}
