package com.shoppoint.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminpage {
	
	public Adminpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="inputEmail")
	private WebElement usernametbx;
	
	@FindBy(id="inputPassword")
	private WebElement pwdtbx;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement lgbtn;

	public WebElement getUsernametbx() {
		return usernametbx;
	}

	public WebElement getPwdtbx() {
		return pwdtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
	
	
		
	}

