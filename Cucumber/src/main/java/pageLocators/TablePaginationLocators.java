package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TablePaginationLocators {

	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Table with Pagination Example")
	public WebElement tablePaginationHeader;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Table has total 15 records, each page has max 5 records.")
	public WebElement tablePaginationParaOne;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Second Page will have both Prev and Next buttons enabled to navigate")
	public WebElement tablePaginationParaTwo;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Second Page will have both Prev and Next buttons enabled to navigate")
	public WebElement tablePaginationParaTo;
	
	
}
