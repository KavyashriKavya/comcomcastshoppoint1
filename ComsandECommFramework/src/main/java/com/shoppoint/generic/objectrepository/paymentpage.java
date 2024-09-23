package com.shoppoint.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentpage {
	
	public paymentpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='COD']")
	private WebElement codradiobutton;
	
	@FindBy(xpath="//input[@value='Internet Banking']")
	private WebElement internetradiobutton;
	
	@FindBy(xpath="//input[@value='Debit / Credit card']")
	private WebElement internetbankingradiobutton;
	
	@FindBy(xpath="//input[@value='submit']")
	private WebElement submitbutton;

	public WebElement getCodradiobutton() {
		return codradiobutton;
	}

	public WebElement getInternetradiobutton() {
		return internetradiobutton;
	}

	public WebElement getInternetbankingradiobutton() {
		return internetbankingradiobutton;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	
	
	

}
