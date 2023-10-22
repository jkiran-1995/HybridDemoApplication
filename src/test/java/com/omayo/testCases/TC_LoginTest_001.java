package com.omayo.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.omayo.pageobjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		lp.setPassword(username);
		lp.setPassword(password);
		//lp.Clicksubmit();
		if(driver.getTitle().equals("omayo (QAFox.com)")) {
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
