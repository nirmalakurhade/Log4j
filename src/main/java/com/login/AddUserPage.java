package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {
	WebDriver driver;
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="mobile")
	private WebElement mob;
	@FindBy(id="email")
	private WebElement mail;
	@FindBy(id="course")
	private WebElement Course;
	public AddUserPage(WebDriver driver) {
		 this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public Operators adduserdata() {
		username.clear();
		mob.clear();
		username.sendKeys("vijay");
		mob.sendKeys("9822445566");
		mail.sendKeys("vijay@gmail.com");
		Course.sendKeys("Java");
		return new Operators(driver);
	}
}

