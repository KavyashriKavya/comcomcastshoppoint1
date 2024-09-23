package com.comsand.ecommtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.shoppoint.generic.Fileutility.ExcelUtility;
import com.shoppoint.generic.objectrepository.Bookspage;
import com.shoppoint.generic.objectrepository.Electronicspage;
import com.shoppoint.generic.objectrepository.Homepage;
import com.shoppoint.generic.objectrepository.Mycartpage;
import com.shoppoint.generic.objectrepository.productpage;
import com.shoppoint.generic.webdriverutility.WebdriverUtility;
import com.shoppoint.genericutility.Baseclass;

public class AddingmultipleproducttocartTest extends Baseclass {

	@Test
		public void addingMultipleproductotocart() throws Exception {
	
			// click on books
	
			Homepage h = new Homepage(driver);
			h.getBookslink().click();
	
			// click on comics
			Bookspage bp = new Bookspage(driver);
			bp.getComicslink().click();
	
			// select one book and click on like icon
			ExcelUtility eLib = new ExcelUtility();
			String aproductname = eLib.getDataFromExcelFile("productpage", 2, 3);
			System.out.println(aproductname );
	
			WebdriverUtility wLib = new WebdriverUtility();
			wLib.Toscroll(driver, 0, 500);
	
			driver.findElement(By.xpath("//a[text()='"+aproductname +"']")).click();
			//wLib.Toscroll(driver, 0, 200);
			
			productpage p=new productpage(driver);
			wLib.Toscroll(driver, 0, 200);
			p.getAddtocartlink().click();
			wLib.switchToAlertAccept(driver);
			
			//h.getMycartlink().click();
			//sSystem.out.println(aproductname);
			 wLib.Toscroll(driver, 0, 200);
			Mycartpage mp=new Mycartpage(driver);
			mp.getContinueshippinglink().click();
			
			h.getElectronicslink().click();
			
			Electronicspage ep = new Electronicspage(driver);
			ep.getMobileslinks().click();
			
			String actualproduct = eLib.getDataFromExcelFile("productpage", 4, 3);
			System.out.println(actualproduct);

			//WebdriverUtility wLib = new WebdriverUtility();
			wLib.Toscroll(driver, 0, 500);
			
	        
			driver.findElement(By.xpath("//a[text()='"+ actualproduct+"']")).click();
			//wLib.switchToAlertAccept(driver);
			
			p.getAddtocartlink().click();
			wLib.switchToAlertAccept(driver);
			// String expectedproduct=eLib.getDataFromExcelFile("productpage",4, 5);
			 //System.out.println(expectedproduct);
			//Assert.assertEquals(actualproduct, expectedproduct);
	}

}
