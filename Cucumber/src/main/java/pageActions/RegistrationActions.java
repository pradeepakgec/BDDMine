package pageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageLocators.RegistrationLocators;
import utils.DriverSetup;

public class RegistrationActions {
	
	RegistrationLocators RegistrationLocators = null;
	
	public RegistrationActions()
	{
		this.RegistrationLocators=new RegistrationLocators();
		PageFactory.initElements(DriverSetup.getDriver(), RegistrationLocators);
	}
	
	public void fullName(String firstName, String lastName)
	{
		RegistrationLocators.firstName.sendKeys(firstName);
		RegistrationLocators.lastName.sendKeys(lastName);
		System.out.println("FULL NAME FIELDS");
	}
	
	public void address(String address)
	{
		RegistrationLocators.address.sendKeys(address);
		System.out.println("ADDRESS FIELDS");
	}
	
	public void email(String email)
	{
		System.out.println("EMAIL FIELDS START");
		RegistrationLocators.email.sendKeys(email);
		System.out.println("EMAIL FIELDS");
	}
	
	public void phone(String  phone)
	{
		RegistrationLocators.phone.sendKeys(phone);
		System.out.println("PHONE FIELDS");
	}
	
	public void gender1()
	{
		RegistrationLocators.gender1.click();
	}
	
	public void gender2()
	{
		RegistrationLocators.gender2.click();
	}
	
	public void hobby1()
	{
		RegistrationLocators.hobby1.click();
	}
	
	public void hobby2()
	{
		RegistrationLocators.hobby3.click();	
	}
	
	public void hobby3()
	{
		RegistrationLocators.hobby3.click();	
	}
	
	public void language(String language)
	{
		RegistrationLocators.language.sendKeys(language);	
	}
	
	public void skills(String skill)
	{
		Select sel = new Select(RegistrationLocators.skills);	
		System.out.println("Skill is :"+skill);
		sel.selectByVisibleText(skill);
	}
	
	public void country(String country)
	{
		Select sel = new Select(RegistrationLocators.country);	
		System.out.println("Country is :"+country);
		sel.selectByVisibleText(country);
	}
	
	public void dateOfBirth(String year, String month, String day)
	{
		Select selYear = new Select(RegistrationLocators.year);	
		Select selMon = new Select(RegistrationLocators.month);	
		Select selDay = new Select(RegistrationLocators.day);	
		selDay.selectByVisibleText(day);
		selMon.selectByValue(month);
		selYear.selectByValue(year);
	}
	
	public void password(String password, String confirmPassword)
	{
		RegistrationLocators.password.sendKeys(password);
		RegistrationLocators.password.sendKeys(confirmPassword);
	}
	
	public void submit()
	{
		RegistrationLocators.submit.click();
	}
	
	public void userRegistration()
	{
		System.out.println("**********  REGISTRATION SUCCESS **********");
	}
}
