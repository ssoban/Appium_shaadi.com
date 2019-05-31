package com.shaadi.com.ui;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Driver extends Base_setup {
	  // protected AndroidDriver driver;
	AppiumDriver<MobileElement> driver;
	    public Driver() {
	        this.driver = (AppiumDriver<MobileElement>) super.getDriver();
	    }
}
