package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	
	WebDriver driver;
	@FindBy(xpath="/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")
	private WebElement adduser;
	
	public UserPage (WebDriver driver) {
    this.driver=driver;
	PageFactory.initElements(driver,this);
	}

public AddUserPage adduserdata() {
	adduser.click();
	return new  AddUserPage(driver);
	
}
}