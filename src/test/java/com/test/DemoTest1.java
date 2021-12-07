package com.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DemoTest1 {
	WebDriver driver;
	public static Logger log= Logger.getLogger(DemoTest1.class);
	@Test
	public void test01() {
	  log.info("opening a new chrome browser");
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("file:///E:/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	  Assert.assertEquals(driver.getTitle(),"JavaByKiran | Log in");
	}
	@Test
	public void test02() {
		log.info("inside test2");
		Assert.assertTrue(false);
	}
	@Test
	public void test03() {
		log.info("inside test3");
		throw new SkipException("skipping a test") ;
	}

}
