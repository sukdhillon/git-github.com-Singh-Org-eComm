package com.williamssonoma.buyerexperience.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart {
	
WebDriver driver;
	
	public ShoppingCart(WebDriver driver){
		this.driver = driver;
	}

	private final By ITEMTITLE = By.id("title-lineid-1");
	private final By ITEMQTY = By.className("storetext");
	
	public String getKettleNameFromCart() throws InterruptedException{
		String title = driver.findElement(ITEMTITLE).getText();
		String[] arr = title.split(",");
		String kettleName = arr[0].trim();
		return kettleName;
	}
	public String getKettleColorFromCart() throws InterruptedException{
		String title = driver.findElement(ITEMTITLE).getText();
		String[] arr = title.split(",");
		String kettleName = arr[1].trim();
		return kettleName;
	}
	
	public String getKettleQuantity(){
		String qty = driver.findElement(ITEMQTY).getAttribute("value");
		return qty;
	}

}
