package com.test;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.login.AddUserPage;
import com.login.DashboardPage;
import com.login.LoginPageTest;
import com.login.UserPage;

public class DashBoardPageTest {
	WebDriver driver;
	LoginPageTest lp; 
	DashboardPage dp;
    UserPage up;
    
    private Logger log= Logger.getLogger(DashBoardPageTest.class);
    	
   @Test
   public void test04() {
	   ArrayList<String>expCourses = new ArrayList<String>();
	   expCourses.add("Selenium");
	   expCourses.add("Java / J2EE");
	   expCourses.add("Python");
	   expCourses.add("Php");
	   Assert.assertEquals(TestDemo.dp.verifycourses(),expCourses);
   }
  
}
