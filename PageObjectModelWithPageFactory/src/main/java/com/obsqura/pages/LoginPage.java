package com.obsqura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	//By email = By.xpath("//input[@id='email']");
	//By password = By.xpath("//input[@id='passwd']");
	//By login = By.xpath("//button[@type='submit']");
	//replacing  with below code because we are using page factory
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickLogin(String email1, String password1) {
		email.sendKeys(email1);
		password.sendKeys(email1);
		login.click();
	}
	
}



