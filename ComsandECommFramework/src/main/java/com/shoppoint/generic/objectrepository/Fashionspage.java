package com.shoppoint.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fashionspage {
	
	public Fashionspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'  Men Footwears')]")
	private WebElement footwarelink;

	public WebElement getFootwarelink() {
		return footwarelink;
	}
	
	

}
