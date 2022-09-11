package upskill.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {
	
	TakeScreenshot TakeScreenshotObj = new TakeScreenshot();
	
	@After
	public void afterActions(Scenario Scenario) throws Exception{
		
		if(Scenario.isFailed()){
			TakeScreenshotObj.screenshots();
		}
		
		SetupDrivers.tearDownDriver();
		System.out.println(" ------Test Complete, Browser Closed ");
	}
}