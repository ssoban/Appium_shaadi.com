package com.shaadi.com.ui;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TC_01_Registration_page<submit> extends Base_setup {
	
//protected static AndroidDriver<MobileElement> driver;
    
	public TC_01_Registration_page()
	{
    }
    public TC_01_Registration_page(AndroidDriver<MobileElement> driver) 
    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
	
    
    @AndroidFindBy(id = "com.shaadi.android:id/registerfree")
    public MobileElement registerfree;
    
    @AndroidFindBy(id = "email")
    public MobileElement email_add;
    
    @AndroidFindBy(id = "password1")
    public MobileElement passwrd;
    
    @AndroidFindBy(id = "postedby")
    public MobileElement profile_for;
    
    @AndroidFindBy(id = "android:id/text1")
    public ArrayList<MobileElement> dropdown;
    
    @AndroidFindBy(id="first_name")
    public MobileElement f_name;
    
    @AndroidFindBy(id="last_name")
    public MobileElement l_name;
    
    @AndroidFindBy(id = "gender" )
    public MobileElement s_gender;
    
    @AndroidFindBy(id = "day")
    public MobileElement s_day;
    
    @AndroidFindBy(id = "month")
    public MobileElement s_month;
    
    @AndroidFindBy(id = "year")
    public MobileElement s_year;
    
    @AndroidFindBy(id = "community")
    public MobileElement s_relegion;
    
    @AndroidFindBy(id = "mother_tongue")
    public MobileElement s_mother_tongue;
    
    @AndroidFindBy(id = "countryofresidence")
    public MobileElement s_country;
    
    @AndroidFindBy(id = "sign-up-btn")
    public MobileElement submit_btn;
    

    public void scrollToExactElement(String str) { 
 	((AndroidDriver) driver).findElementByAndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + str + "\").instance(0))").click(); }
	

	public void click_Signup_btn(){
		 sleep(3000);
		registerfree.click();
		System.out.println("Registration page is going to open");
		
	}
	public void Enter_email(String email){
		 sleep(2000);
		System.out.println("enter the valid email address");
		email_add.sendKeys(email);
		
	}
   public void Enter_password(String pass){
	   sleep(2000);
	   System.out.println("enter the valid paasword");
        passwrd.sendKeys(pass);
        driver.hideKeyboard();
       
        
		
	}
   
   public void select_profile_for(String pro){
	   
	   sleep(2000);
		System.out.println("Select the Profile");
	   profile_for.click();
	   sleep(2000);
	   for (MobileElement element : dropdown) {
			 if (element.getAttribute("text").equals(pro)) {
			  element.click();
			   break;
			  }
			
	   }
	
	}
  
   //Tap by coordinates
   
 


 
   public void enter_first_name(String fname){
	   sleep(2000);
	   System.out.println("enter the first name");
	   f_name.sendKeys(fname);
	   driver.hideKeyboard();
		
	}
   public void enter_last_name(String lname){
	   sleep(2000);
	   System.out.println("Enter the last name");
		l_name.sendKeys(lname);
		 driver.hideKeyboard();
	}
   public void select_gender(){
	   sleep(2000);
	   s_gender.click();
	   sleep(2000);
		System.out.println("Select Gender");
		for (MobileElement element : dropdown) {
			 if (element.getAttribute("text").equals("Male")) {
			  element.click();
			   break;
			  }
			 
			 }
		
	}
 
   public void select_day(String Dy){
	   
	  
	   sleep(2000);
	   System.out.println("Select the day");
	   s_day.click();
	   sleep(2000);
	   for (MobileElement element : dropdown) {
			 if (element.getAttribute("text").equals(Dy)) {
			  element.click();
			   break;
			  }else{
				  scrollToExactElement(Dy);
				  break;
			  }
			 }
	   
	 //  AndroidTouchAction touch = new AndroidTouchAction (driver);


 // set context to WEBVIEW_1
//["NATIVE_APP","WEBVIEW_chrome","WEBVIEW_com.shaadi.android"]

//do some web testing







		
	}

   public void select_month(String mth){
	
	   sleep(2000);
	   System.out.println("Select the month");
	   s_month.click();
	   sleep(2000);
	   for (MobileElement element : dropdown) {
			 if (element.getAttribute("text").equals(mth)) {
			  element.click();
			   break;
			  }else{
				  scrollToExactElement(mth);
				  break;
			  }
			 }
	  
	}
   public void select_year(String yr){
	  
	   sleep(2000);
	   System.out.println("Select the year");
	   s_year.click();
	   sleep(2000);
	   for (MobileElement element : dropdown) {
			 if (element.getAttribute("text").equals(yr)) {
			  element.click();
			   break;
			  }else{
				  scrollToExactElement(yr);
				  break;
			  }
			 }

		
	 
	}
   public void select_relegion(String rel){
	   sleep(2000);
	   System.out.println("Select the relegion");
	   s_relegion.click();
	   sleep(2000);
	   for (MobileElement element : dropdown) {
			 if (element.getAttribute("text").equals(rel)) {
			  element.click();
			   break;
			  }else{
				  scrollToExactElement(rel);
			  }
	   }
	  
	}
   public void mother_tongue(String mtongue){
	   sleep(2000);
	   System.out.println("Select the mother tongue");
		s_mother_tongue.click();
		 sleep(2000);
		for (MobileElement element : dropdown) {
			 if (element.getAttribute("text").equals(mtongue)) {
			  element.click();
			   break;
			  }else{
				  scrollToExactElement(mtongue);
			  }
	   }
			
	}
   public boolean verify_living_in(String Country1){
	   sleep(2000);
	   Assert.assertEquals(s_country.getText(), Country1);
		System.out.println("Verified the Country Name");
		return true;
	}
   public void click_submit_button(){
	   sleep(2000);
	   submit_btn.click();
		System.out.println("Successfully registered");
	}
   public void sleep(int n) {
       try {
           Thread.sleep(n);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }//sleep function end

}
