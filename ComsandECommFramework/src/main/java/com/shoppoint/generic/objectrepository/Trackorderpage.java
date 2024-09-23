package com.shoppoint.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trackorderpage {
	
	public Trackorderpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="orderid")
	private WebElement orderidtbx;
	
	@FindBy(name="email")
	private WebElement emailtbx;
	
	@FindBy(xpath="//button[text()='Track']")
	private WebElement trackbtn;

	public WebElement getOrderidtbx() {
		return orderidtbx;
	}

	public WebElement getEmailtbx() {
		return emailtbx;
	}

	public WebElement getTrackbtn() {
		return trackbtn;
	}
	
	public void Trackorder(String id, String email) {
		orderidtbx.sendKeys(id);
		emailtbx.sendKeys(email);
		trackbtn.click();
		
		
		
	}
	

}
