package com.shoppoint.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccountpage {
	
	public Myaccountpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='#collapseTwo']")
	private WebElement changepwdlink;
	
	
	@FindBy(xpath="//a[@href='#collapseOne']")
	private WebElement myprofilelink;
	
	@FindBy(linkText = "Shipping / Billing Address")
	private WebElement shippingandbillinglink;
	
	@FindBy(linkText = "Order History")
	private WebElement orderhistorylink;
	
	@FindBy(linkText = "Payment Pending Order")
	private WebElement paymentpendingorderlink;

	public WebElement getChangepwdlink() {
		return changepwdlink;
	}

	public WebElement getMyprofilelink() {
		return myprofilelink;
	}

	public WebElement getShippingandbillinglink() {
		return shippingandbillinglink;
	}

	public WebElement getOrderhistorylink() {
		return orderhistorylink;
	}

	public WebElement getPaymentpendingorderlink() {
		return paymentpendingorderlink;
	}
	
	
	
	
	
	
	
	
	
	

}
