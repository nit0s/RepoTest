package POM;

import org.openqa.selenium.WebDriver;

public class test_youtube {
	//declaring the objects we will need
	static Utilities util;
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//calling the utilities object to use it,creating an utilities object
		 util = new Utilities();
		 
		 //configuring webdriver  and saving them into the same variable
		 driver = util.configureChromeDriver(driver);
		 //once browser is configured now we can use it
		 
		 //opening youtube
		 util.openWebDriver(driver, "https://www.youtube.com");
		 
		 //wait for see the action
		 Thread.sleep(2000);
		 
		 //close the webdriver
		 util.closeWebDriver(driver);
		 
		 
	}


}
