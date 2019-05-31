package com.shaadi.com.ui;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class RUN_TC_01_Registration_page extends Base_setup {
	
	
	TC_01_Registration_page TC_01;
	
	//data can be pass by adding excel sheet via code.
	String email="syedmohdsoban@gmail.com";
	String pass="ssjjdlld123";
	String pro="Daughter";
	String fname="Soban";
    String lname="Syed";
	String Dy="15";
	String mth="May";
	String yr="1993";
	String rel="Muslim";
	String mtongue="Hindi";
	String Country1="India";
	
	@Test
	public void run_tc_01(){

		TC_01 = new TC_01_Registration_page((AndroidDriver<MobileElement>) driver);
		 
		TC_01.click_Signup_btn();
		
		TC_01.Enter_email(email);
			
		TC_01.Enter_password(pass);

	    TC_01.enter_first_name(fname);
			
		TC_01.enter_last_name(lname);
		
		TC_01.select_day(Dy);
		
		TC_01.select_month(mth);
		
		TC_01.select_year(yr);
		TC_01.select_relegion(rel);
		TC_01.mother_tongue(mtongue);
		TC_01.verify_living_in(Country1);
	   TC_01.click_submit_button();
		
	}

}
