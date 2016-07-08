package com.williamssonoma.buyerexperience.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
	
	WebDriver driver;
	
	public AddToCart (WebDriver driver){
		this.driver = driver;
	}
	private final By SELECTCARIBBEANCOLOR = By.xpath("//img[contains(@src,'/wcm/201611/0023/img64m.jpg')]");
	private final By QUANTITY = By.className("qty");
	private final By ADDTOCART = By.cssSelector(".btn.btn_addtobasket.btn_addtobasket_add");
	private final By VIEWVCART = By.className("view-cart");
	
	public void selectColor() throws InterruptedException{
		driver.findElement(SELECTCARIBBEANCOLOR).click();
		Thread.sleep(2000);
	}
	
	public void enterQuantity(String qty){
		WebElement quantity = driver.findElement(QUANTITY);
		quantity.clear();
		quantity.sendKeys(qty);
	}

	public CartOverlay clickAddToCart() throws InterruptedException{
		driver.findElement(ADDTOCART).click();
		Thread.sleep(3000);
		return new CartOverlay(driver);
	}
	
	
	public ShoppingCart clickViewCart(){
		driver.findElement(VIEWVCART).click();
		return new ShoppingCart(driver);
	}
}
