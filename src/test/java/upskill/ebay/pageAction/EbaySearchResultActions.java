package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}
	
	public void verifyShoesItems(){
		//Option 1
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
		
		//Option 2
		Assert.assertEquals("shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		
		//Option 3
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
	}
	
	public void filterBrand(String brand){
		if(brand.equals("Adidas")){
			EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
		} else if(brand.equals("Nike")){
			EbaySearchResultLocatorsObj.cbxBrandNike.click();
		} else if(brand.equals("Unbranded")){
			EbaySearchResultLocatorsObj.cbxBrandUnbranded.click();
		} else {
			System.out.println(" Brand not found, please implement ! ");
		}
	}
	
	public void verifyBrandItems(String brand){
		if(brand.equals("Adidas")){
			EbaySearchResultLocatorsObj.txtShirts.isDisplayed();
		} else if(brand.equals("Nike")){
			EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
		} else if(brand.equals("Unbranded")){
			EbaySearchResultLocatorsObj.txtPants.isDisplayed();
		} else {
			System.out.println(" Brand not found, please implement ! ");
		}
	}
	
	public void selectShirt(){
		EbaySearchResultLocatorsObj.linkShirtItems.click();
	}
}
