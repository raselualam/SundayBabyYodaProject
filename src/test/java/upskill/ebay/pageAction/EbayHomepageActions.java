package upskill.ebay.pageAction;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbayHomepageLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class EbayHomepageActions {
	
	EbayHomepageLocators EbayHomepageLocatorsObj;
	
	public EbayHomepageActions(){
		EbayHomepageLocatorsObj = new EbayHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsObj);
	}
	
	public void searchShoes(){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Shoes");
//		EbayHomepageLocatorsObj.btnSearch.click();
		
//		JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver; 	//Creating JS object		
//		js.executeScript("EbayHomepageLocatorsObj.btnSearch.click();");	
		
		
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys(Keys.ENTER);
	}
	
	public void searchShoesExcel() throws Exception{
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys(ReadExcelSheet.getMapData("BabyYoda"));
		Thread.sleep(5000);
		EbayHomepageLocatorsObj.btnSearch.click();
	}
	
	public void searchShirt(){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Big & Tall Cotton Tee");
		EbayHomepageLocatorsObj.btnSearch.click();
	}
	
	public void searchItems(String items){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys(items);
		EbayHomepageLocatorsObj.btnSearch.click();
	}
	
	public void seleniumWaits(){
		
		System.out.println("Page Title : " + SetupDrivers.driver.getTitle());						//Get Title
		System.out.println("Page Url : " + SetupDrivers.driver.getCurrentUrl());					//Get Title
		
		SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				//Implicit wait
				
		WebDriverWait wait = new WebDriverWait(SetupDrivers.driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsObj.txtbxSearch));	//Explicit wait
		
		FluentWait fluentWait = new FluentWait(SetupDrivers.driver);								//Fluent Wait
						fluentWait.withTimeout(20, TimeUnit.SECONDS);
						fluentWait.pollingEvery(5, TimeUnit.SECONDS);
						fluentWait.ignoring(NoSuchElementException.class);
						fluentWait.withMessage("Fluent Wait Time exceeded");
	}
	
	public void mouseHoverMyEbay() throws Exception{
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(EbayHomepageLocatorsObj.linkMyEbay);
		actions.perform();
		Thread.sleep(3000);
	}
	
	public void clickSummary() throws Exception{
		EbayHomepageLocatorsObj.linkSummary.isEnabled();
		EbayHomepageLocatorsObj.linkSummary.click();
		Thread.sleep(3000);
	}
	
	public void javaScriptExecutor(){
		
		JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver; 	//Creating JS object
		
//		js.executeScript(script, args);
		
		js.executeScript("EbaySearchResultLocatorsObj.cbxBrandNike.click();"); //Clicking on element
		
		js.executeScript("EbaySearchResultLocatorsObj.cbxBrandNike.value ='shirt';"); //Writing something
		
		js.executeScript("EbaySearchResultLocatorsObj.cbxBrandNike.checked=true;"); //Interect Checkbox
		
		js.executeScript("window.location = 'http://upskill.com';"); // initializing location
		
		js.executeScript("location.reload()"); 						//Refresh browser
		
		js.executeScript("alert('Confirmation');");					//Alert
		
		js.executeScript("window.scrollBy(0,500)", ""); 			//Scroll down to specific pixel
		
		js.executeScript("window.scrollBy(0,-500)", ""); 			//Scroll up to specific pixel
		
		js.executeScript("arguments[0].scrollIntoView();", EbayHomepageLocatorsObj.linkMyEbay);  //Scroll to a object
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //Scroll down to bottom of website
	}
	
	public void keyboardKeys(){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Shoes");
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys(Keys.ENTER);
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys(Keys.UP);
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys(Keys.DOWN);
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys(Keys.CLEAR);
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys(Keys.DELETE);
	}
	
	public void handlingAlert(){
		SetupDrivers.driver.switchTo().alert().accept();						//Yes to popup window
		SetupDrivers.driver.switchTo().alert().dismiss();						//No to popup window
		SetupDrivers.driver.switchTo().alert().sendKeys("Survey, good work");	//Write in prompts
		SetupDrivers.driver.switchTo().alert().getText();						//Get the text from alert
	}
	
}
