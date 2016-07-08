package com.williamssonoma.buyerexperience.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cookware {

	WebDriver driver;
	
	public Cookware(WebDriver driver){
		this.driver = driver;
	}
	
	
	private final By TEAKETTLESCATEGORY = By.linkText("Tea Kettles");
	
	public TeaKettles clickTeaKettles() throws InterruptedException{
		driver.findElement(TEAKETTLESCATEGORY).click();
		Thread.sleep(5000);
		return new TeaKettles(driver);
	}
	
	
}
