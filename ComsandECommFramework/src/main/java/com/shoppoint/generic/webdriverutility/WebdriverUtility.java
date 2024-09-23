package com.shoppoint.generic.webdriverutility;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void waitForElement(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public String switchNewDriverTab(WebDriver driver,String partialUrl)
	{
		Set<String> allWh = driver.getWindowHandles();
		String pwh = driver.getWindowHandle();
		
		for(String wh : allWh)
		{
			driver.switchTo().window(wh);
			if(!(wh.equals(pwh)))
			{
				break;
			}
		}
		return pwh;
	}
	
	public void switchToAlertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void mouseMoveOnElement(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	
	public void rightClickOnElement(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();
	}
	
	
	public void getScreenShot(WebDriver driver) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File  dest = new File("./screenshot/ss.png");
		FileUtils.copyFile(src, dest);
	}
	
	public void Tomaximizethebrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void Toscroll(WebDriver driver,int x,int y) {
		Actions a=new Actions(driver);
		a.scrollByAmount(x,y).perform();
	}
	
	public void ToScrollbyElement(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.scrollToElement(element).perform();
		
	}
}
