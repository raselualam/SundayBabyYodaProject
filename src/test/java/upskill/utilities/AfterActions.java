package upskill.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {
	
	@After
	public void afterActions(Scenario Scenario){
		SetupDrivers.tearDownDriver();
		System.out.println(" ------Test Complete, Browser Closed ");
	}
}