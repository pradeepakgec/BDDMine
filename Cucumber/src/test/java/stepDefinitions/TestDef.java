package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class TestDef {
	

	public static WebDriver dr;
	
	@Given("I want to login into ([^\"]*)")
	public void Test(String table)
	{
		//List<Map<String,String>> data = table.asMaps(String.class, String.class);
		System.out.println("Test");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","F:\\Soft Pract\\Testing Work\\Automation\\chromedriver.exe");
		dr = new ChromeDriver(chromeOptions);
		System.out.println("Before URL");
		//dr.get(data.get(0).get("URL"));--table
		dr.get(table);
		System.out.println("After URL");
	}
	
}
