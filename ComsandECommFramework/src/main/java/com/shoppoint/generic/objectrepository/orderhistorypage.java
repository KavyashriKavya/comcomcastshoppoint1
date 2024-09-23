package com.shoppoint.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderhistorypage {
	public  orderhistorypage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@title='Track order']")
	private WebElement trackorder;
	
	public WebElement getTrackorder() {
		return trackorder;
	}

}
