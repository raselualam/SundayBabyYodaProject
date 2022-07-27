package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	//Search result validation
	@FindBy(xpath="//span[2][contains(text(), 'shoes')]")
	public WebElement txtShoes;
	
	

}
