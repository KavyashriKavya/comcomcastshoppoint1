package com.comsand.ecommtest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.shoppoint.generic.Fileutility.ExcelUtility;
import com.shoppoint.generic.objectrepository.Bookspage;
import com.shoppoint.generic.objectrepository.Homepage;
import com.shoppoint.generic.objectrepository.Mycartpage;
import com.shoppoint.generic.objectrepository.productpage;
import com.shoppoint.generic.webdriverutility.WebdriverUtility;
import com.shoppoint.genericutility.Baseclass;

public class UpdateproductinthecartTest extends Baseclass {
	
	@Test
	public void Updateproductintocart() throws Exception {

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
		
		h.getMycartlink().click();
		System.out.println(aproductname);
		String expectedproductname="Thea Stilton and the Tropical Treasure ";
	    Assert.assertEquals(aproductname, expectedproductname);
	    
	    
	    //update quantity
	   WebElement quantity = driver.findElement(By.xpath("(//a[text()='"+aproductname+"'])[2]/../../..//input[@type='text']"));
	   quantity.clear();
	   String actualquantity = eLib.getDataFromExcelFile("productpage", 2, 4);
	   
	   quantity.sendKeys(actualquantity );
	   
	   
	   //To click on update shopping cart button
	   Mycartpage mp=new Mycartpage(driver);
	   wLib.Toscroll(driver, 0, 200);
	   mp.getUpdateshoppingcartlink().click();
	 //  wLib.switchToAlertAccept(driver);
	   
	   
	  //To click on my cart link
	 // h.getMycartlink().click();
	  
	  //validating actualquantity and updatedquantity
	 String expectedquantity=driver.findElement(By.xpath("(//a[text()='"+aproductname+"'])[2]/../../..//input[@type='text']")).getAttribute("value");
	 System.out.println(expectedquantity);
      Assert.assertEquals(actualquantity, expectedquantity);	   
	   
	   
	}
	
	

}
