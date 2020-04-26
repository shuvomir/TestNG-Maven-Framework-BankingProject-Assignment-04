package com.accenttechPartnersGuru99.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.accenttechPartnersGuru99.baseClass.BaseClass;
import com.accenttechPartnersGuru99.browserfactory.browseFactory;
import com.accenttechPartnersGuru99.pages.NewAccount;
import com.accenttechPartnersGuru99.pages.NewCustomer;
import com.accenttechPartnersGuru99.utilities.commonMethods;

public class TC_002 extends BaseClass{

	public TC_002() {
		super(driver);
	}
	NewAccount newaccount;
	
	@BeforeMethod
	public void NewAccount() {
	driver=browseFactory.initiateBrowser();	
	logger.info("Browser is getting initialized in Before Method");	
	newaccount = PageFactory.initElements(driver, NewAccount.class);
	}
	@Test 
	public void Test_003_NewAccount() throws InterruptedException {
	System.out.println("Login into the test case_002");	
	logger.info("Test Case_003 execution has started");

	commonMethods.getTitle(getDriver(), "Guru99 Bank Manager HomePage");
	commonMethods.click(newaccount.ClickNewAccount, getDriver());
	//driver.findElement(By.xpath("//a[@href='addAccount.php']")).click();
	commonMethods.sendData(newaccount.CustomerId, getDriver(), "40548");
	commonMethods.sendData(newaccount.InitialDeposit, getDriver(), "20000");
	commonMethods.click(newaccount.Submit, getDriver());
	logger.info("Execution of Test Case -003 is completed");
	Assert.assertEquals("http://www.demo.guru99.com/V4/manager/AccCreateMsg.php?aid=77348", "http://www.demo.guru99.com/V4/manager/AccCreateMsg.php?aid=77348");
	}
	@AfterMethod
	public void testCase_003_afterMethod( ) {
	logger.info("Browser is getting Close in AfterMethod");	
	}
	
}


