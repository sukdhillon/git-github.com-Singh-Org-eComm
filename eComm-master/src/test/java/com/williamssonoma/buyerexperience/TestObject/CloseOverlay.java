package com.williamssonoma.buyerexperience.TestObject;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.TestEnvUtil;

import com.williamssonoma.buyerexperience.PageObject.AddToCart;
import com.williamssonoma.buyerexperience.PageObject.CartOverlay;
import com.williamssonoma.buyerexperience.PageObject.Cookware;
import com.williamssonoma.buyerexperience.PageObject.HomePage;
import com.williamssonoma.buyerexperience.PageObject.ShoppingCart;
import com.williamssonoma.buyerexperience.PageObject.TeaKettles;
import com.williamssonoma.buyerexperience.PageObject.WelcomePopUpPage;


public class CloseOverlay {
	
	


	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver, 10);

	
	//String URL = "http://www.williams-sonoma.com/";
	//TestEnvUtil testEnvUtil = new TestEnvUtil(driver);
	
	
	@Test 
	@Parameters ("baseUrl")
	public void closeOverlayScreen(String baseurl) throws InterruptedException{
	WelcomePopUpPage welcomePopUpPage = new WelcomePopUpPage(driver, baseurl);
	HomePage homePage = welcomePopUpPage.clickOverlayCloseButton();	
	Cookware cookware = homePage.navigateToCookware();
	//Mouse is not working, so used navigate to function
	//homePage.mouseOverCookwareAndClickTeaKettles();
	TeaKettles teaKettles = cookware.clickTeaKettles();
	AddToCart addToCart= teaKettles.clickTeaKettle();
	addToCart.selectColor();
	addToCart.enterQuantity("1");
	CartOverlay cartOverlay = addToCart.clickAddToCart();
	cartOverlay.clickOverlayCloseButton();
	ShoppingCart shoppingCart = addToCart.clickViewCart();
	System.out.println(shoppingCart.getKettleNameFromCart());
	System.out.println(shoppingCart.getKettleColorFromCart());
	System.out.println(shoppingCart.getKettleQuantity());
	
	
	}
	@AfterTest
	public void afterTestCleanUp(){
		TestEnvUtil testEnvUtil = new TestEnvUtil(driver);
		testEnvUtil.closeBrowser();
	}

	
}
