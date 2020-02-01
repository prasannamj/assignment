package com.facebook.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	

		WebDriver ldriver;
		
		public AddCustomerPage(WebDriver rdriver) {
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		

		@CacheLookup
		@FindBy(how = How.NAME, using = "emailid")
		WebElement txtemailid;

		@CacheLookup
		@FindBy(how = How.NAME, using = "password")
		WebElement txtpassword;

		@CacheLookup
		@FindBy(how = How.NAME, using = "sub")
		WebElement btnSubmit;

		public void custemailid(String cemailid) {
			txtemailid.sendKeys(cemailid);
		}

		public void custpassword(String cpassword) {
			txtpassword.sendKeys(cpassword);
		}

		public void custsubmit() {
			btnSubmit.click();
		}
		
	}



