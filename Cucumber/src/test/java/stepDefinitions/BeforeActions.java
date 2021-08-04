package stepDefinitions;

import io.cucumber.java.Before;
import utils.DriverSetup;

public class BeforeActions {
	
	@Before
	public static void driverSetUp()
	{
		System.out.println("****** This is Before Method ******");
		DriverSetup.setUpDriver();
	}
}
