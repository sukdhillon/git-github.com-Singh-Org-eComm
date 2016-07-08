package com.williamssonoma.buyerexperience.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.williamssonoma.buyerexperience.PageObject.*;

public class WelcomePopUpPage {

	WebDriver driver;

	public WelcomePopUpPage(WebDriver driver, String url) {
		this.driver = driver;
		driver.get(url);
		driver.manage().window().maximize();
	}

	public final By CLOSEBUTTON = By
			.cssSelector(".overlayCloseButton.overlayCloseX");

	public void goToURL(String URL) throws InterruptedException {
		driver.get(URL);
		driver.manage().window().maximize();
		

	}

	public HomePage clickOverlayCloseButton() {
		if (verifyOverlayPopUpPresent()) {
			driver.findElement(CLOSEBUTTON).click();
		} else {
			System.out.println("Overlay was not displayed.");
		}
		return new HomePage(driver);
	}

	

	public boolean verifyOverlayPopUpPresent() {
		if (driver.findElement(CLOSEBUTTON).isDisplayed()) {
			return true;

		} else {
			return false;
		}

	}

}
