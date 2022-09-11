package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.ShettyHomepageLocators;
import upskill.utilities.SetupDrivers;

public class ShettyHomepageActions {
	
	ShettyHomepageLocators ShettyHomepageLocatorsObj;
	
	public ShettyHomepageActions(){
		ShettyHomepageLocatorsObj = new ShettyHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, ShettyHomepageLocatorsObj);	
	}

	public void loadShettyHomepage() throws Exception {
		Thread.sleep(2000);
		SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
	}

	public void switchShettyIframe() {
		SetupDrivers.driver.switchTo().frame("iframe-name");
	}

	public void clickHome() {
		
		List<WebElement> framelist = SetupDrivers.driver.findElements(By.id("courses-iframe"));
		
		for(int i = 0; i<(framelist.size());i++){
			SetupDrivers.driver.switchTo().frame(i);
			
			try{
				ShettyHomepageLocatorsObj.btnHome.click();	
			} catch (Exception e){
				System.out.println("Element not found in that iframe list");
			}
		}
	}
	
	public void handleIframe(){
		
		//i find iframe using iframe tag in DOM or HTML
		//i use switchTo().frame() to switch iframes
		
		//Switch iframe by index
		SetupDrivers.driver.switchTo().frame(0);
		SetupDrivers.driver.switchTo().frame(1);
		
		//Switch iframe by Name or Id
		SetupDrivers.driver.switchTo().frame("iframe-name");
		SetupDrivers.driver.switchTo().frame("iframe2");
		SetupDrivers.driver.switchTo().frame("id");
		
		//Switch back to previous iframe
		SetupDrivers.driver.switchTo().defaultContent();
		SetupDrivers.driver.switchTo().parentFrame();
		
		//nested iframe
		SetupDrivers.driver.switchTo().frame("parent");
		SetupDrivers.driver.switchTo().frame("child");
		SetupDrivers.driver.switchTo().frame("inner");
	} 

	public void verifyShetty() throws Exception {
		Thread.sleep(5000);
		ShettyHomepageLocatorsObj.btnHome.isDisplayed();
	}
}