package com.obsqura.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
		WebDriver driver;
				
		@BeforeMethod
		public void openBrowser() {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			
			
		@AfterMethod
		public void closeBrowser() {
			driver.quit();
			}	

	}


