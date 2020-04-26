package com.accenttechPartnersGuru99.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.accenttechPartnersGuru99.baseClass.BaseClass;
import com.accenttechPartnersGuru99.browserfactory.browseFactory;
import com.accenttechPartnersGuru99.pages.DeleteAccount;
import com.accenttechPartnersGuru99.utilities.commonMethods;

public class TC_006 extends BaseClass{

	public TC_006() {
		super(driver);
	}
	DeleteAccount deleteaccount;
	
	@BeforeMethod
	
	public void DeleteAccount() {
		
	driver = browseFactory.initiateBrowser();
	logger.info("Browser for TC_006 is getting initialized");
	deleteaccount = PageFactory.initElements(driver, DeleteAccount.class);
	}
	@Test
	public void test_006_DeleteAccount() throws InterruptedException {
	System.out.println("Login into the Test Case_006");
	logger.info("Execution of TC_006 has Started");
	
	commonMethods.getTitle(getDriver(), "Guru99 Bank Manager HomePage");
	commonMethods.click(deleteaccount.ClickDeleteAccount, getDriver());	
	commonMethods.sendData(deleteaccount.AccountNo, getDriver(), "77709");
	commonMethods.click(deleteaccount.Submit, getDriver());
	Alert al = driver.switchTo().alert();
	Thread.sleep(5000);
	al.accept();
	logger.info("Execution of TestCase_006 is Complited");
	Assert.assertEquals("http://www.demo.guru99.com/V4/manager/DeleteAccount.php", "http://www.demo.guru99.com/V4/manager/DeleteAccount.php");
	}
	@AfterMethod
	public void TC_006_AfterMethod() {
	logger.info("Browser is performing after method tast for TC_006");	
	}

	}


