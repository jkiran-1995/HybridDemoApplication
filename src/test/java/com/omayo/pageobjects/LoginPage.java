package com.omayo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="userid")
	WebElement loginFiled;
	@FindBy(name="pswrd")
	WebElement passwordFiled;
	
	
	public void setUserName(String uname) {
		loginFiled.sendKeys("kiran");
	}
	public void setPassword(String uname) {
		passwordFiled.sendKeys("kiran");
	}
	

}
