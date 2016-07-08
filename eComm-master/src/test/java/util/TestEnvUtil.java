package util;

import org.openqa.selenium.WebDriver;


public class TestEnvUtil {

	WebDriver driver;
	
	public TestEnvUtil(WebDriver driver){
		this.driver = driver;
	}
	
	public void closeBrowser() {
		driver.close();
	}
	

}
