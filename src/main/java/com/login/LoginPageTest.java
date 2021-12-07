package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTest {
	
	WebDriver driver;
	
	@FindBy(id="email")
	private WebElement uname;
	@FindBy(id="password")
	private WebElement pass;
	@FindBy(xpath="//*[@id=\"form\"]/div[3]/div/button")
	private WebElement  loginbtn;

	public LoginPageTest(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public DashboardPage validlogin() {
		uname.clear();
		pass.clear();
		uname.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		loginbtn.click();
		return new DashboardPage(driver);
	}
	public void invalidlogin(String Uname,String Pass) {
		uname.sendKeys(Uname);
		pass.sendKeys(Pass);
		loginbtn.click();
		
		
	}
    
}
