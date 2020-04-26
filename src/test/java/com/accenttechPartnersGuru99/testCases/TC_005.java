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
import com.accenttechPartnersGuru99.pages.EditAccount;
import com.accenttechPartnersGuru99.utilities.commonMethods;

public class TC_005 extends BaseClass{

	public TC_005() {
		super(driver);
	}
	EditAccount editaccount ;
	
	@BeforeMethod
	public void EditAccount() {
	
	driver=browseFactory.initiateBrowser();
	logger.info("Browser for TC_005 is getting Initialized");
	editaccount = PageFactory.initElements(driver, EditAccount.class);
	}
	@Test
	public void test_005_EditAccount() throws InterruptedException {
	System.out.println("Login into the Test Case_005");
	logger.info("Execution of TC_005 has Started");
	
	commonMethods.getTitle(getDriver(), "Guru99 Bank Manager HomePage");
	commonMethods.click(editaccount.ClickEditAccount, getDriver());
	commonMethods.sendData(editaccount.AccountNo, getDriver(), "77458");
	commonMethods.click(editaccount.Submit, getDriver());
	commonMethods.click(editaccount.FinalSubmit, getDriver());
	Alert al = driver.switchTo().alert();
	Thread.sleep(5000);
	al.accept();
	logger.info("Execution of TestCase_005 is Complited");
	Assert.assertEquals("http://www.demo.guru99.com/V4/manager/editAccount.php", "http://www.demo.guru99.com/V4/manager/editAccount.php");
	}
	@AfterMethod
	public void TC_005_AfterMethod() {
	logger.info("Browser is performing after method tast for TC_005");	
	}

}
