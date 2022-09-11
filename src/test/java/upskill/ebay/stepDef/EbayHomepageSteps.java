package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;

public class EbayHomepageSteps {
	
	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
	    // todo
	}

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
//		EbayHomepageActionsObj.searchShoes();
		EbayHomepageActionsObj.searchShoesExcel();
	}
	
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomepageActionsObj.searchItems(items);
	}
	
	@Given("^Search for Shirt$")
	public void search_for_Shirt() throws Throwable {
		EbayHomepageActionsObj.searchShirt();
	}
	
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
		EbayHomepageActionsObj.mouseHoverMyEbay();
	}

	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		EbayHomepageActionsObj.clickSummary();
	}
}
