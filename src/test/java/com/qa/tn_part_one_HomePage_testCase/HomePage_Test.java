package com.qa.tn_part_one_HomePage_testCase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tn_part_one_HomePage_page.HomePage;
import com.qa.tn_part_one_HomePage_page.Loginpage;
import com.tn.qa.testBase.TestBase;




public class HomePage_Test extends TestBase {
	public WebDriver driver;
	public HomePage homepage;
	public Loginpage loginpage;
		
		@BeforeMethod
		public void registerSetup() {
			
			driver=initalizeBrowserAndOpenApplication();
		
		}
		@Test()
		public void verifySearchWithValidProduct() {
			homepage= new HomePage(driver);
			Assert.assertTrue(homepage.searchTextBoxDisplayed());
			Assert.assertTrue(homepage.MyAccountDropDownMenuDisplayed());
			homepage.clickOnMyAccountDropDownMenu();
			loginpage=homepage.clickOnLoginOption();
			loginpage.getDisplayOfReturningCustomerTextInLoginPage();
			
		}
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		

	}


