package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	//Validate Shoes Items
	@FindBy(xpath="//span[2][contains(text(), 'shoes')]")
	public WebElement txtShoes;
	
	//Validate Shirts Items
	@FindBy(xpath="//span[2][contains(text(), 'shirts')]")
	public WebElement txtShirts;
	
	//Validate Pants Items
	@FindBy(xpath="//span[2][contains(text(), 'pants')]")
	public WebElement txtPants;
	
	//Checkbox Brand Adidas
	@FindBy(xpath="//input[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;

	//Checkbox Brand Nike
	@FindBy(xpath="//input[@aria-label='Nike']")
	public WebElement cbxBrandNike;

	//Checkbox Brand Unbranded
	@FindBy(xpath="//input[@aria-label='Unbranded']")
	public WebElement cbxBrandUnbranded;
	
	//Shirt link
	@FindBy(xpath="//span[contains(text(), 'Big & Tall Cotton Tee')]")
	public WebElement linkShirtItems;
	
}