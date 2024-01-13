package com.qa.tn_part_one_HomePage_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	public WebDriver driver;
	
	
	@FindBy(linkText = "My Account")
	private WebElement myAccountDropdown;
	
	
	@FindBy(linkText = "Login")
	private WebElement loginOption;
	
	
	
	@FindBy(name = "search")
	private WebElement searchTextBoxField;
	
	

	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public boolean searchTextBoxDisplayed() {
		boolean searchTextBox= searchTextBoxField.isDisplayed();
		return searchTextBox;
	}
	public boolean MyAccountDropDownMenuDisplayed() {
		boolean AccountDropdown= myAccountDropdown.isDisplayed();
		return AccountDropdown;
	}
	
	public void clickOnMyAccountDropDownMenu() {
		myAccountDropdown.click();
	}
	
	
public Loginpage clickOnLoginOption() {
	loginOption.click();
	return new Loginpage(driver);
}



}