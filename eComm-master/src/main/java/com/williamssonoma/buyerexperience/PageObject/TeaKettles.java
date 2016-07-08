package com.williamssonoma.buyerexperience.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeaKettles {
	
	WebDriver driver;
	
	public TeaKettles(WebDriver driver){
		this.driver = driver;
	}
	
	private final By TEAKETTLES = By.linkText("Le Creuset Classic Tea Kettle");
	
	public AddToCart clickTeaKettle() throws InterruptedException{
		driver.findElement(TEAKETTLES).click();
		Thread.sleep(5000);
		return new AddToCart(driver);
	}

	
	
}
