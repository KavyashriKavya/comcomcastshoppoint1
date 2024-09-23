package com.comsand.ecommtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.shoppoint.generic.Fileutility.ExcelUtility;
import com.shoppoint.generic.objectrepository.Bookspage;
import com.shoppoint.generic.objectrepository.Electronicspage;
import com.shoppoint.generic.objectrepository.Homepage;
import com.shoppoint.generic.objectrepository.productpage;
import com.shoppoint.generic.objectrepository.wishlistpage;
import com.shoppoint.generic.webdriverutility.WebdriverUtility;
import com.shoppoint.genericutility.Baseclass;

public class RemoveproductfromwishlistTest extends Baseclass {
	
	@Test
	public void Tracktheorder() throws Exception {

		// click on electronics
      	Homepage h=new Homepage(driver);
		h.getElectronicslink().click();

		// click on mobile
		Electronicspage ep = new Electronicspage(driver);
		ep.getMobileslinks().click();

		// select one iphone  and click on like icon
		ExcelUtility eLib = new ExcelUtility();
		String data = eLib.getDataFromExcelFile("productpage", 4, 3);
		System.out.println(data);

		WebdriverUtility wLib = new WebdriverUtility();
		wLib.Toscroll(driver, 0, 500);
		
        
		driver.findElement(By.xpath("//a[text()='" + data + "']")).click();
		wLib.Toscroll(driver, 0, 200);
		productpage p = new productpage(driver);
		p.getWishlisticon().click();
		
		//To click on x icon 
		driver.findElement(By.xpath("//a[text()='"+data+"']/../../..//i[@class='fa fa-times']")).click();
		wLib.switchToAlertAccept(driver);
		
	
		
	}
}
