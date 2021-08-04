package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InputFormSubmitLocators {
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Input form with validations")
	public WebElement inputFormSubmitTitle;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Contact Us Today!")
	public WebElement inputFormSubmitHeader;

	@FindBy(how=How.NAME, using ="first_name")
	public WebElement inputFormSubmitFirstName;
	
	@FindBy(how=How.NAME, using="last_name")
	public WebElement inputFormSubmitLastName;
	
	@FindBy(how=How.NAME, using="email")
	public WebElement inputFormSubmitEmail;
	
	@FindBy(how=How.NAME, using="phone")
	public WebElement inputFormSubmitPhone;
	
	@FindBy(how=How.NAME, using="address")
	public WebElement inputFormSubmitAddress;
	
	@FindBy(how=How.NAME, using="city")
	public WebElement inputFormSubmitCity;
	
	@FindBy(how=How.NAME, using="zip")
	public WebElement inputFormSubmitZip;
	
	@FindBy(how=How.NAME, using="comment")
	public WebElement inputFormSubmitProjectDescription;
	
	@FindBy(how=How.LINK_TEXT, using="Send ")
	public WebElement inputFormSubmitButton;

}
