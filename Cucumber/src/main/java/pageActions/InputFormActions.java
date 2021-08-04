package pageActions;

import org.openqa.selenium.support.PageFactory;

import pageLocators.InputFormSubmitLocators;
import utils.DriverSetup;

public class InputFormActions {
	
	InputFormSubmitLocators formLocators = null;
	public InputFormActions()
	{
		this.formLocators =  new InputFormSubmitLocators();
		PageFactory.initElements(DriverSetup.getDriver(), formLocators);
	}
	
	public void inputFormFirstName(String firstName)
	{
		formLocators.inputFormSubmitFirstName.sendKeys(firstName);
	}
	
	public void inputFormLastName(String lastName)
	{
		formLocators.inputFormSubmitLastName.sendKeys(lastName);
	}
	
	public void inputFormEmail(String email)
	{
		formLocators.inputFormSubmitEmail.sendKeys(email);
	}
	
	public void inputFormPhone(String phone)
	{
		formLocators.inputFormSubmitPhone.sendKeys(phone);
	}
	
	public void inputFormAddress(String address)
	{
		formLocators.inputFormSubmitAddress.sendKeys(address);
	}
	
	public void inputFormCity(String city)
	{
		formLocators.inputFormSubmitCity.sendKeys(city);
	}
	
	public void inputFormZip(String zip)
	{
		formLocators.inputFormSubmitZip.sendKeys(zip);
	}
	
	public void inputFormDescription(String description)
	{
		formLocators.inputFormSubmitProjectDescription.sendKeys(description);
	}
	
	public void inputFormSubmitButton()
	{
		formLocators.inputFormSubmitButton.click();	
	}
}
