package com.shoppoint.generic.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement myaccountlink;
	
	@FindBy(xpath="//a[text()='Wishlist']")
	private WebElement wishlistlink;
	
	@FindBy(xpath="//a[text()='My Cart']")
	private WebElement mycartlink;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement liginlink;
	
	@FindBy(xpath="//a[text()='Admin Login']")
	private WebElement adminlink;
	
	@FindBy(xpath="//a[text()=' Books']")
	private WebElement bookslink;
	
	@FindBy(xpath="//a[text()=' Electronics']")
	private WebElement electronicslink;
	
	@FindBy(linkText = " Furniture")
	private WebElement furniturelink;
	
	@FindBy(linkText = " Fashion")
	private WebElement fashionlink;
	
	@FindBy(linkText = "Track Order")
	private WebElement trackorderlink;
	
	@FindBy(linkText  ="Logout")
	private WebElement logoutlink;
	
	@FindBy(name = "product")
	private WebElement searchtbx;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitbtn;
	
	
	

	public WebElement getSearchtbx() {
		return searchtbx;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getTrackorderlink() {
		return trackorderlink;
	}

	public WebElement getMyaccountlink() {
		return myaccountlink;
	}

	public WebElement getWishlistlink() {
		return wishlistlink;
	}

	public WebElement getMycartlink() {
		return mycartlink;
	}

	public WebElement getLiginlink() {
		return liginlink;
	}

	public WebElement getAdminlink() {
		return adminlink;
	}

	public WebElement getBookslink() {
		return bookslink;
	}

	public WebElement getElectronicslink() {
		return electronicslink;
	}

	public WebElement getFurniturelink() {
		return furniturelink;
	}

	public WebElement getFashionlink() {
		return fashionlink;
	}
	
	
	public void Tosearchproduct(String productname) {
		searchtbx.sendKeys(productname);
		submitbtn.click();
		
		
		
	}

	

}
