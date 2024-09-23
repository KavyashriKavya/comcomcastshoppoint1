package com.shoppoint.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="exampleInputEmail1")
	private WebElement Emailtbx;
	
	
	@FindBy(id="exampleInputPassword1")
	private WebElement passtbx;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement lgbtn;
	
	
	@FindBy(id="fullname")
	private WebElement fullnametbx;
	
	@FindBy(id="email")
	private WebElement signemailtbx;
	
	@FindBy(id="contactno")
	private WebElement contacnotbx;
	
	@FindBy(id="password")
	private WebElement pastbx;
	
	@FindBy(id="confirmpassword")
	private WebElement confpws;
	
	@FindBy(xpath="//button[text()='Sign Up']")
	private WebElement signupbtn;

	public WebElement getLgbtn() {
		return lgbtn;
	}

	public WebElement getSignupbtn() {
		return signupbtn;
	}

	public WebElement getEmailtbx() {
		return Emailtbx;
	}

	public WebElement getPasstbx() {
		return passtbx;
	}

	public WebElement getFullnametbx() {
		return fullnametbx;
	}

	public WebElement getSignemailtbx() {
		return signemailtbx;
	}

	public WebElement getContacnotbx() {
		return contacnotbx;
	}

	public WebElement getPastbx() {
		return pastbx;
	}

	public WebElement getConfpws() {
		return confpws;
	}

	public void setLogin(String email , String password ) {
		Emailtbx.sendKeys(email);
		passtbx.sendKeys(password);
		 lgbtn.click();
	}
	
	public void SignIn(String fullname ,String email,String contactno,String password ,String confirmpassword) {
		fullnametbx.sendKeys(fullname);
		 signemailtbx.sendKeys(email);
		 contacnotbx.sendKeys(contactno);
		 pastbx.sendKeys(password);
		 confpws.sendKeys(confirmpassword);
		 signupbtn.click();
		 
		 
	}
}
