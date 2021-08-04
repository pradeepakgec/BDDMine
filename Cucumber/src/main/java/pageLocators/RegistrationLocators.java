package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationLocators {

	@FindBy(how=How.XPATH, using = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")
	public WebElement firstName;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")
	public WebElement lastName;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")
	public WebElement address;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"eid\"]/input")
	public WebElement email;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")
	public WebElement phone;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")
	public WebElement gender1;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")
	public WebElement gender2;
	
	@FindBy(how=How.ID, using = "checkbox1")
	public WebElement hobby1;
	
	@FindBy(how=How.ID, using = "checkbox2")
	public WebElement hobby2;
	
	@FindBy(how=How.ID, using = "checkbox3")
	public WebElement hobby3;
	
	@FindBy(how=How.ID, using = "msdd")
	public WebElement language;
	
	@FindBy(how=How.ID, using = "Skills")
	public WebElement skills;
	
	@FindBy(how=How.ID, using = "countries")
	public WebElement country;
	
	@FindBy(how=How.ID, using = "yearbox")
	public WebElement year;
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")
	public WebElement month;
	
	@FindBy(how=How.ID, using = "daybox")
	public WebElement day;
	
	@FindBy(how=How.ID, using = "firstpassword")
	public WebElement password;
	
	@FindBy(how=How.ID, using = "secondpassword")
	public WebElement confirmPassword;
		
	@FindBy(how=How.ID, using = "submitbtn")
	public WebElement submit;
	
	@FindBy(how=How.ID, using = "Button1")
	public WebElement reset;
}
