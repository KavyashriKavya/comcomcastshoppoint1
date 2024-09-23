package com.comsand.ecommtest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.shoppoint.generic.Fileutility.ExcelUtility;
import com.shoppoint.generic.objectrepository.Bookspage;
import com.shoppoint.generic.objectrepository.Homepage;
import com.shoppoint.generic.objectrepository.Mycartpage;
import com.shoppoint.generic.objectrepository.productpage;
import com.shoppoint.generic.objectrepository.wishlistpage;
import com.shoppoint.generic.webdriverutility.WebdriverUtility;
import com.shoppoint.genericutility.Baseclass;

public class RemoveProductFromCartTest extends Baseclass {
	
	@Test
	public void RemoveproductFromCart() throws Exception {

		// click on books

		Homepage h = new Homepage(driver);
		h.getBookslink().click();

		// click on comics
		Bookspage bp = new Bookspage(driver);
		bp.getComicslink().click();

		// select one book and click on add to cart
		ExcelUtility eLib = new ExcelUtility();
		String data = eLib.getDataFromExcelFile("productpage", 2, 3);
		System.out.println(data);

		WebdriverUtility wLib = new WebdriverUtility();
		wLib.Toscroll(driver, 0, 500);

		driver.findElement(By.xpath("//a[text()='" + data + "']")).click();
		wLib.Toscroll(driver, 0, 200);
		
		
		productpage p = new productpage(driver);
		p.getWishlisticon().click();

		
		//click on add to cart button
		
		wishlistpage w = new wishlistpage(driver);
		w.getAddtocartbutton().click();
		wLib.waitForPageToLoad(driver);
		
		//navigate to my cart link
		h.getMycartlink().click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()='"+data+"'])[2]/../../..//input[@type='checkbox']")).click();
		
		Mycartpage mp = new Mycartpage(driver);
		wLib.Toscroll(driver, 0, 1000);
		mp.getUpdateshoppingcartlink().click();
		//wLib.switchToAlertAccept(driver);
		//wLib.switchToAlertAccept(driver);
		
		
		
		
		
	
	
	}
	

}
