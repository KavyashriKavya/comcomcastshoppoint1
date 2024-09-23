package com.shoppoint.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronicspage {
	
	public Electronicspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[contains(text(),' Television')])[2]")
	private WebElement televisionlink;
	
	@FindBy(xpath="//a[contains(text(),'Mobiles')]")
	private WebElement mobileslinks;
	
	@FindBy(xpath="//a[contains(text(),' Laptops')]")
	private WebElement laptoplink;

	public WebElement getTelevisionlink() {
		return televisionlink;
	}

	public WebElement getMobileslinks() {
		return mobileslinks;
	}

	public WebElement getLaptoplink() {
		return laptoplink;
	}
	

}
