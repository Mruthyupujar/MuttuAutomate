package com.convo.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.convo.pageobjects.LoginPage;



public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest () throws InterruptedException
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassWord(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		lp.Profile();
		
		//review after add
		if (driver.getPageSource().equals("https://qa-sde.useconvo.com/")) {
			Assert.assertTrue(false);
			
		}
		else {
			Assert.assertTrue(true);
		}
		
	}
	
}
