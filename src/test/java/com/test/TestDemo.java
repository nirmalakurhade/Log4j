package com.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.login.AddUserPage;
import com.login.DashboardPage;
import com.login.LoginPageTest;
import com.login.UserPage;

public class TestDemo {
	WebDriver driver;
	LoginPageTest lp;
	static DashboardPage dp;
	UserPage up;
	AddUserPage ad;
	private Logger log = Logger.getLogger(TestDemo.class);

	@BeforeSuite
	public void setup() {
		log.info("opening a new chrome browser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		lp = new LoginPageTest(driver);
	}
	@Test
	public void test02() {
		lp.invalidlogin("vijay", "sjhdgdj");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}

	@Test
	public void test03() {
		dp = lp.validlogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}	
	@Test
	public void test4() {
		dp.verifycourses();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Add User");
	}

	@Test
	public void test05() {
		up = dp.clickuserlink();
	}
	@Test
	public void test06() {
		ad = up.adduserdata();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Add User");
}
	
}
