package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.DemoEnterActions;
import pageActions.RegistrationActions;
import utils.DriverSetup;

public class RegistrationSteps {

	RegistrationActions RegistrationActions = new RegistrationActions();
	
	//@When("^User enters FirstName ([^\"]*), LastName ([^\"]*), Address ([^\"]*), Email ([^\"]*) and Phone ([^\"]*)$")
	@When("^User enters FirstName, LastName, Address, Email and Phone$")
	public void nameEmailPhoneAddress(DataTable table)
	{
		System.out.println("############ Step Definition ############");
		List<Map<String,String>> data = table.asMaps(String.class, String.class);	
		String firstName = data.get(1).get("<FIRSTNAME>"); 
		String lastName = data.get(1).get("<LASTNAME>");
		String address = data.get(1).get("<ADDRESS>");
		String email = data.get(1).get("<EMAIL>");
		String phone = data.get(1).get("<PHONE>");
		RegistrationActions.fullName(firstName, lastName);
		RegistrationActions.address(address);
		RegistrationActions.email(email);
		RegistrationActions.phone(phone);
	}
	
	@And("^User selects Gender, chooses Hobbies and provides Language$")
	public void genderHobbiesLanguage(DataTable table1)
	{
		List<Map<String,String>> data1 = table1.asMaps(String.class, String.class);
		/*String gender1 = data1.get(1).get("<GENDER>");
		String gender2 = data1.get(2).get("<GENDER>");
		String hobby1 = data1.get(3).get("<HOBBIES>");
		String hobby2 = data1.get(4).get("<HOBBIES>");
		String hobby3 = data1.get(5).get("<HOBBIES>");
		String laguage1 = data1.get(6).get("<HOBBIES>");*/
		String laguage2 = data1.get(1).get("<LANG>");
		System.out.println("LANG :"+laguage2);
		RegistrationActions.gender1();
		RegistrationActions.hobby2();
		RegistrationActions.hobby3();
		//RegistrationActions.language(laguage2);
	}
	
	@And("^User selects Skills and Country$")
	public void skillsCountry(DataTable table)
	{
		List<Map<String,String>> data = table.asMaps(String.class, String.class);
		String skill = data.get(0).get("<SKILLS>");
		String country = data.get(0).get("<COUNTRY>");
		RegistrationActions.skills(skill);
		RegistrationActions.country(country);
	}
	
	@And("^User selects Date Of Birth$")
	public void dateOfBirth()
	{
			String  day = "1";
			String month = "January";
			String year = "1999";
			RegistrationActions.dateOfBirth(year,  month,  day);
	}
	
	@And("^User enters Password and Confirm Password$")
	public void passwords(DataTable table)
	{
		List<Map<String,String>> data = table.asMaps(String.class, String.class);
		String password = data.get(1).get("<PASS>");
		String confirmPassword = data.get(1).get("<COPASS>");
		RegistrationActions.password(password, confirmPassword);
	}
	
	@When("User clicks on Submit button$")
	public void submitForm()
	{
		RegistrationActions.submit();
	}
	
	@Then("Validate that user is registered successfully$")
	public void registerSuccess()
	{
		RegistrationActions.userRegistration();
	}

}
