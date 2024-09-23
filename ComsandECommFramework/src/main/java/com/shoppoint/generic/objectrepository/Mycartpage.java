package com.shoppoint.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mycartpage {
	public Mycartpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath="//input[@name='quantity[17]']")
	private WebElement quantity;
	
	@FindBy(xpath="//input[@value='Update shopping cart']")
	private WebElement updateshoppingcartlink;
	
	@FindBy(xpath ="//a[text()='Continue Shopping']")
	private WebElement continueshippinglink;
	
	@FindBy(xpath="//button[text()='PROCCED TO CHEKOUT']")
	private WebElement proceedtocheckoutlink;
	
	@FindBy(name="billingaddress")
	private WebElement billingaddresstbx;
	
	@FindBy(id="bilingstate")
	private WebElement billingstatetbx;
	
	@FindBy(id="billingcity")
	private WebElement billingcitytbx;
	
	@FindBy(id="billingpincode")
	private WebElement billingcode;
	
	@FindBy(name="shippingaddress")
	private WebElement shippingaddresstbx;
	
	@FindBy(name="shippingstate")
	private WebElement shippingstatetbx;
	
	@FindBy(name="shippingcity")
	private WebElement shippingcitytbx;
	
	@FindBy(name="shippingpincode")
	private WebElement shippingpincodetbx;
	
	@FindBy(xpath="//button[@name='update']")
	private WebElement buttonlink;

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getUpdateshoppingcartlink() {
		return updateshoppingcartlink;
	}

	public WebElement getContinueshippinglink() {
		return continueshippinglink;
	}

	public WebElement getProceedtocheckoutlink() {
		return proceedtocheckoutlink;
	}

	public WebElement getBillingaddresstbx() {
		return billingaddresstbx;
	}

	public WebElement getBillingstatetbx() {
		return billingstatetbx;
	}

	public WebElement getBillingcitytbx() {
		return billingcitytbx;
	}

	public WebElement getBillingcode() {
		return billingcode;
	}

	public WebElement getShippingaddresstbx() {
		return shippingaddresstbx;
	}

	public WebElement getShippingstatetbx() {
		return shippingstatetbx;
	}

	public WebElement getShippingcitytbx() {
		return shippingcitytbx;
	}

	public WebElement getShippingpincodetbx() {
		return shippingpincodetbx;
	}

	public WebElement getButtonlink() {
		return buttonlink;
	}
	
	public void Setbillingaddress(String address,String state,String city,String i) {
		billingaddresstbx.sendKeys(address);
		billingstatetbx.sendKeys(state);
		billingcitytbx.sendKeys(city);
		billingcode.sendKeys(i);
		 
		
}
	
	public void Setshippingaddress(String address,String state,String city,String i) {
		shippingaddresstbx.sendKeys(address);
		shippingstatetbx.sendKeys(state);
		shippingcitytbx.sendKeys(city);
		shippingpincodetbx.sendKeys(i);
		
		
}
	

	}
	
	
