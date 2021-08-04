package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
	
	// Table Menu Locators
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Table")
	public WebElement tableLink;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Table Pagination")
	public WebElement tablePaginationLink;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Table Data Search")
	public WebElement tableDataSearchLink;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Table Filter")
	public WebElement tableFilterLink;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Table Sort & Search")
	public WebElement tableSortAndSearchLink;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Table Data Download")
	public WebElement tableDataDwonloadLink;
	
	// Input Forms Locators
	@FindBy(how=How.XPATH, using="//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")
	public WebElement inputFormsLink;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Input Form Submit")
	public WebElement inputFormSubmitLink;
	
	@FindBy(how=How.ID, using="at-cv-lightbox-close")
	public WebElement dialogueBoxClose;
	
	// Date Pickers Locators
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Date pickers")
	public WebElement datePickersLink;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Progress Bars")
	public WebElement progressBarsLink;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Alerts & Modals")
	public WebElement alertsAndModalslink;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="List Box")
	public WebElement listBoxLink;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Others")
	public WebElement othersLink;
	


}
