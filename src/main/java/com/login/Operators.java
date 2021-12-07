package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Operators {
	WebDriver driver;

	
	public Operators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}

}
