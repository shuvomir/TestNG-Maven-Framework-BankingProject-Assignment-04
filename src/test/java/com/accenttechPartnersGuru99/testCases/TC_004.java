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
import com.accenttechPartnersGuru99.pages.WithdrawalAmount;
import com.accenttechPartnersGuru99.utilities.commonMethods;

public class TC_004 extends BaseClass{

	public TC_004() {
		super(driver);
	}
	WithdrawalAmount withdrawalamount;
	
	@BeforeMethod
	
	public void WithdrawalAmount() {
	driver = browseFactory.initiateBrowser();
	logger.info("Browser for TC_004 is getting initialized");
	withdrawalamount = PageFactory.initElements(driver, WithdrawalAmount.class);	
	}
	@Test
	public void test_004_Withdrawal() throws InterruptedException {
	System.out.println("Login into the Test Case_004");	
	logger.info("Execution of TC_004 has Started");
	
	commonMethods.getTitle(getDriver(), "Guru99 Bank Manager HomePage");
	commonMethods.click(withdrawalamount.ClickWithdrawal, getDriver());	
	commonMethods.sendData(withdrawalamount.AccountNo, getDriver(), "77458");
	commonMethods.sendData(withdrawalamount.Ammount, getDriver(), "1000");
	commonMethods.sendData(withdrawalamount.Description, getDriver(), "Elec Bill");
	commonMethods.click(withdrawalamount.Submit, getDriver());
	logger.info("Execution of TestCase_004 is Complited");
	Assert.assertEquals("http://www.demo.guru99.com/V4/manager/Withdrawal.php", "http://www.demo.guru99.com/V4/manager/Withdrawal.php");
	}
	@AfterMethod
	public void testCase_004AfterMethod() {
	logger.info("Browser is performing AfterMethod Test for TC_004");	
	}
	

}
