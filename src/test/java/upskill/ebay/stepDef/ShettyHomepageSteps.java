package upskill.ebay.stepDef;

import cucumber.api.java.en.*;
import upskill.ebay.pageAction.ShettyHomepageActions;

public class ShettyHomepageSteps {
	
	ShettyHomepageActions ShettyHomepageActionObj = new ShettyHomepageActions();

	@Given("^Open Shetty Homepage$")
	public void open_Shetty_Homepage() throws Throwable {
		ShettyHomepageActionObj.loadShettyHomepage();
	}

	@When("^Click on iFrame Home$")
	public void click_on_iFrame_Home() throws Throwable {
		ShettyHomepageActionObj.switchShettyIframe();
		ShettyHomepageActionObj.clickHome();
	}

	@Then("^It should reload iframe homepage$")
	public void it_should_reload_iframe_homepage() throws Throwable {
		ShettyHomepageActionObj.verifyShetty(); 
	}
}