package com.shoppoint.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wishlistpage {
	
	public wishlistpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Add to cart']")
	private WebElement addtocartbutton;
	
	@FindBy(xpath="//a[@href='my-wishlist.php?del=105']")
	private WebElement clocsebutton;

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}

	public WebElement getClocsebutton() {
		return clocsebutton;
	}
	
	
	
	
	

}
