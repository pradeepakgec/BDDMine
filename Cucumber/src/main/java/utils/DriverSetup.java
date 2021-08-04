package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverSetup {
	
	private static DriverSetup classDrive;
	private static WebDriver driver; 
	private static WebDriverWait webWait;
	private static final int TIMEOUT = 30;
	private static final int PAGE_LOAD_TIMEOUT = 50;

	private DriverSetup()
	{
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","C:\\HandsON\\TestingFrameworks\\Automation\\chromedriver.exe");
		//driver = new ChromeDriver(chromeOptions);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		webWait = new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	
	public static void openUrl(String url)
	{
		System.out.println("UrL :"+url);
		System.out.println("Driver :"+driver.getCurrentUrl());
		driver.get(url);
		System.out.println("Setup");
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static void setUpDriver()
	{
		System.out.println("Is Webdriver Null? : "+classDrive);
		if(classDrive==null)
		{
			classDrive = new DriverSetup(); 
		}
	}
	
	public static void tearDown()
	{
		if(driver!=null)
		{
			driver.close();
			driver.quit();
		}
		classDrive = null;
	}
	
}
