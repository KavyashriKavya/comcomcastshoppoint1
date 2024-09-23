package com.shoppoint.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Furniturepage {
	
	public Furniturepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),' Beds')]")
	private WebElement bedslink;
	
	@FindBy(xpath="//a[contains(text(),' Sofas')]")
	private WebElement sofaslink;

	public WebElement getBedslink() {
		return bedslink;
	}

	public WebElement getSofaslink() {
		return sofaslink;
	}
	

}
