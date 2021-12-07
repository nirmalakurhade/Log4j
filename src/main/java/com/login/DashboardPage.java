package com.login;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;
	@FindBy(tagName = "h3")
	private List<WebElement>courses;
	
	@FindBy(xpath = "//span[text()='Users']")
	private WebElement userlink;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public ArrayList<String> verifycourses() {
		ArrayList<String>actcoursename = new ArrayList<String>();
		for(WebElement course: courses) 
		{
			String text = course.getText();
			actcoursename.add(text);
		}
	return actcoursename;
}
	public UserPage clickuserlink() {
		userlink.click();
	return new UserPage(driver);
}
}////span[text()='Users']
