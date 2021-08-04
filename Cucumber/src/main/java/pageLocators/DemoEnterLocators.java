package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DemoEnterLocators {
		
	@FindBy(how=How.ID, using="enterimg")
	public WebElement enterDemoLink;
}
