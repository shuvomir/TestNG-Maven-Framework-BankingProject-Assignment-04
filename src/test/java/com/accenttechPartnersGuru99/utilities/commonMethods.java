package com.accenttechPartnersGuru99.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.accenttechPartnersGuru99.baseClass.BaseClass;

public class commonMethods extends BaseClass{

	public commonMethods() {
		super(driver);
	}
	public static WebDriverWait wait;
	public static WebElement wElement;
	
	public static WebElement elelmentToVisible(WebElement ele, WebDriver driver) {
		try { wait = new WebDriverWait(getDriver(), 30);
		wElement = wait.until(ExpectedConditions.visibilityOf(ele));
		}
		catch (NoSuchElementException e) {
		e.printStackTrace();	
		}
		return wElement;
	}
	public static boolean sendData(WebElement ele, WebDriver driver, String data) {
		//logger.info("SendKeys reusable method is declared here");
		elelmentToVisible(ele,driver);
		if(ele==null) {
			return false;
		}else {
		ele.sendKeys(data);
		return true;
	}
	}
	//Send Keys method
	public static boolean click(WebElement ele, WebDriver driver) {
		elelmentToVisible(ele,getDriver());
		if(ele==null) {
		logger.info("Element is not visible");	
			return false;
		}else {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", ele);
		//ele.click();
		return true;
	}
		
	}
	
	public static boolean alert(WebElement ele, WebDriver driver) {
		if (ele==null) {
		logger.info("Element is not visible");	
		return false;
		}
		else {
			ele.click();
		return true;
		}
		}
		
	public static void getTitle(WebDriver driver, String expectedTitle) {
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	Assert.assertEquals(actualTitle, expectedTitle);
	}
	public static void closeBrowser() {
	driver.close();
}
}
