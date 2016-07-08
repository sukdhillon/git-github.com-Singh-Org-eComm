package com.williamssonoma.buyerexperience.PageObject;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	private final By COOKWARECATEGOTY = By.cssSelector(".topnav-cookware ");
	private final By COOKTOOLSCATEGOTY = By.cssSelector(".topnav-cooks-tools ");
	private final By TEAKETTLESCATEGOTY = By.linkText("Tea Kettles");
	
	
	public Cookware clickCookware() throws InterruptedException{
		System.out.println("got into clickCookWare Method");
		driver.findElement(COOKWARECATEGOTY).click();
		Thread.sleep(5000);
		return new Cookware(driver);
	}
	
	public void clickVoidCookTools() throws InterruptedException{
		System.out.println("got into clickCookWare Method");
		driver.findElement(COOKTOOLSCATEGOTY).click();
		Thread.sleep(5000);
	}
	
	public void mouseOverCookwareAndClickTeaKettles() throws InterruptedException{
		try{Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(COOKWARECATEGOTY)).moveToElement(driver.findElement(By.linkText("Tea Kettles"))).click().build().perform();
		Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
			Reporter.log("Not able to find Cookware and mouse over it");
		}
	}
	
	public Cookware navigateToCookware() throws InterruptedException{
		driver.navigate().to("http://www.williams-sonoma.com/shop/cookware/?cm_type=gnav");
		Thread.sleep(3000);
		return new Cookware(driver);
	}
}
