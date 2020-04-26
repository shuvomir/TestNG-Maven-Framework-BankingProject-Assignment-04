package com.accenttechPartnersGuru99.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.accenttechPartnersGuru99.baseClass.BaseClass;
import com.accenttechPartnersGuru99.browserfactory.browseFactory;
import com.accenttechPartnersGuru99.pages.FundTransfer;
import com.accenttechPartnersGuru99.utilities.commonMethods;

public class TC_003 extends BaseClass {

	public TC_003() {
		super(driver);
		}
	FundTransfer fundtransfer;

	@BeforeMethod
	public void FundTransfer() {
	driver=browseFactory.initiateBrowser();
	logger.info("Browser for TC_003 is Getting Initialized");
	fundtransfer = PageFactory.initElements(driver, FundTransfer.class);
	}

	@Test
	public void test_004_FundTransfer() throws InterruptedException {
	System.out.println("Login into the Test Case_003");
	logger.info("Execution of Test Case_003 has Started");
	
	commonMethods.getTitle(getDriver(), "Guru99 Bank Manager HomePage");
	commonMethods.click(fundtransfer.ClickFundTransfer, getDriver());
	commonMethods.sendData(fundtransfer.PayerAccountNumber, getDriver(), "77458");
	commonMethods.sendData(fundtransfer.PayeesAccountNumber, getDriver(), "77461");
	commonMethods.sendData(fundtransfer.Ammount, getDriver(), "1000");
	commonMethods.sendData(fundtransfer.Description, getDriver(), "Monthly Rent");
	commonMethods.click(fundtransfer.ClickSubmit, getDriver());
	logger.info("Execution of TestCase_003 is Complited");
	Assert.assertEquals("http://www.demo.guru99.com/V4/manager/FundTrans.php", "http://www.demo.guru99.com/V4/manager/FundTrans.php");
	}
	@AfterMethod
	public void testCase_003_afterMethod() {
	logger.info("Browser is Getting Closed in testCase_003_AfterMethod");	
	}
	}
	


