package com.obsqura.testscripts;

import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;



public class NewTest1 extends TestBase {
	@Test
	public void loginpagetest1() {
    	driver.get("https://demo.guru99.com/test/login.html");
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.clickLogin("hello@mail.com","abc@123");	
   	   	
    }
	@Test
	public void loginpagetest2() {
    	driver.get("https://demo.guru99.com/test/login.html");
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.clickLogin("niyata@mail.com","abc123");	
   	   	
    }
}
