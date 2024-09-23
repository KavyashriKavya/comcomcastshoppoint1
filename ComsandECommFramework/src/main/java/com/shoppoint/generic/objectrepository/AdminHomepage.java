package com.shoppoint.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomepage {
	
	public AdminHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='#togglePages']	")
	private WebElement ordermanglink;
	
	@FindBy(xpath="//a[@href='todays-orders.php']")
	private WebElement Todaysorderlink;
	
	@FindBy(xpath="//a[@href='pending-orders.php']")
	private WebElement pendingorderlink;
	
	@FindBy(xpath="//a[@href='delivered-orders.php']")
	private WebElement deliverdorderlink;

	public WebElement getOrdermanglink() {
		return ordermanglink;
	}

	public WebElement getTodaysorderlink() {
		return Todaysorderlink;
	}

	public WebElement getPendingorderlink() {
		return pendingorderlink;
	}

	public WebElement getDeliverdorderlink() {
		return deliverdorderlink;
	}
	

}
