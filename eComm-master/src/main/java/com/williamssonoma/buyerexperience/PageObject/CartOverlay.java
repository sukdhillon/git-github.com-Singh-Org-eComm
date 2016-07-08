package com.williamssonoma.buyerexperience.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartOverlay {
	
	WebDriver driver;
	
	public CartOverlay(WebDriver driver){
		this.driver = driver;
	}

	private final By CLOSEBUTTON = By.cssSelector(".overlayCloseButton.overlayCloseX");
	
	public AddToCart clickOverlayCloseButton() throws InterruptedException{
		driver.findElement(CLOSEBUTTON).click();
		Thread.sleep(5000);
		return new AddToCart(driver);
	}
	
}
