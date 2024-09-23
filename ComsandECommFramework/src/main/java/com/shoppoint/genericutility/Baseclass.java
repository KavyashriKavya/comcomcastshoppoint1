package com.shoppoint.genericutility;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.shoppoint.generic.Fileutility.ExcelUtility;
import com.shoppoint.generic.Fileutility.FileUtility;
import com.shoppoint.generic.objectrepository.Homepage;
import com.shoppoint.generic.objectrepository.Loginpage;
import com.shoppoint.generic.webdriverutility.WebdriverUtility;
@Listeners(com.shoppoint.listenerutility.ListenerImplementation.class)
public class Baseclass {
	
	  FileUtility fLib=new FileUtility();
	 protected ExcelUtility eLib=new ExcelUtility();
	 WebdriverUtility wLib=new WebdriverUtility();
	 public WebDriver driver = null;
	 public static WebDriver sdriver=null;
	 
	 
	@Parameters("BROWSER")
	 @BeforeClass(groups = {"smokeTest" , "regressionTest"})
	 public void beforeclass(/*String BROWSER*/) throws IOException {
		//String browser =BROWSER;
		String browser = fLib.getDataFromPropertyFile("browser");
		String url = fLib.getDataFromPropertyFile("url");
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
			}
		else if(browser.equals("edge")) {
			driver=new EdgeDriver();
			}
		else {
			driver=new ChromeDriver();
		}
		sdriver=driver;
		driver.get(url);
		
	    wLib.waitForPageToLoad(driver);
}
	 @BeforeMethod(groups = {"smokeTest" , "regressionTest"})
	 public void beforeMethod() throws Exception
		{
		
			Homepage h=new Homepage(driver);
			h.getLiginlink().click();
			WebdriverUtility WLib=new WebdriverUtility();
			wLib.Tomaximizethebrowser(driver);
			wLib.Toscroll(driver,0,400);
			String email = fLib.getDataFromPropertyFile("email");
			String password = fLib.getDataFromPropertyFile("password");
			Loginpage lp=new Loginpage(driver);
			lp.setLogin(email, password);
			

			
	}
	 
	 @AfterMethod(groups = {"smokeTest" , "regressionTest"})
		public void afterMethod()
		{
		Homepage h = new Homepage(driver);
			h.getLogoutlink().click();
		}
	 
	 @AfterClass(groups = {"smokeTest" , "regressionTest"})
	 public void afterClass()
		{
	        driver.quit();
		}
		
	 

}
