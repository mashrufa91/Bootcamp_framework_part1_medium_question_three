package com.qa.tn_part_one_HomePage_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
public WebDriver driver;
	
	
	@FindBy(xpath = "//div[@class='well']/h2[text()='Returning Customer']")
	private WebElement loginpageStatus;
	
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);}
		
	
	
	public boolean getDisplayOfReturningCustomerTextInLoginPage() {
	boolean getLoginPage= loginpageStatus.isDisplayed();
		return getLoginPage;
	}
	}

