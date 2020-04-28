package com.accenttechPartnersGuru99.testCases;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.accenttechPartnersGuru99.baseClass.BaseClass;
import com.accenttechPartnersGuru99.browserfactory.browseFactory;
import com.accenttechPartnersGuru99.pages.NewCustomer;
import com.accenttechPartnersGuru99.utilities.ExcelUtility;
import com.accenttechPartnersGuru99.utilities.commonMethods;

public class TC_001 extends BaseClass {

	public TC_001() {
		super(driver);
		
	}
	NewCustomer newcustomer;

@BeforeMethod
public void setUp() {
	driver=browseFactory.initiateBrowser();
	logger.info("Browser is getting intilazed in before Method");
	newcustomer = PageFactory.initElements(driver, NewCustomer.class);
}	
@Test
public void Test_001_NewCustomerRegistration() throws InterruptedException {
System.out.println("Login into the test case");	
logger.info("Test Case_001 execution has started");

commonMethods.getTitle(getDriver(), "Guru99 Bank Manager HomePage");
//commonMethods.click(newcustomer.ClickNewCustomer,getDriver(),"Clicking on the Element");
driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
commonMethods.sendData(newcustomer.TxtCustomerName, getDriver(), "Mirza Abdul Awal");
//commonMethods.click(newcustomer.ClickGender, getDriver(), "Selecting the Gender");
commonMethods.sendData(newcustomer.TxtDateOfBirth, getDriver(), "01/01/2000");
commonMethods.sendData(newcustomer.TxtAddress, getDriver(), "1243 NW 100 Ave");
commonMethods.sendData(newcustomer.TxtCity, getDriver(), "Plantation");
commonMethods.sendData(newcustomer.TxtState, getDriver(), "Florida");
commonMethods.sendData(newcustomer.TxtPin, getDriver(), "987651");
commonMethods.sendData(newcustomer.TxtMobNum, getDriver(), "9541234567");
commonMethods.sendData(newcustomer.TxtEmail, getDriver(), "rtf4560lkjhhsogfd@aol.com");
commonMethods.sendData(newcustomer.TxtPassword, getDriver(),"mike09352");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@value='Submit']")).click();
//commonMethods.click(newcustomer.ClickSubmit, getDriver(), "Submitting the New Customer Information");
Thread.sleep(3000);
//driver.findElement(By.xpath("//*[@href='Managerhomepage.php']")).click();
logger.info("Execution of Test Case_001 is completed");
SoftAssert sa = new SoftAssert();
sa.assertEquals("http://www.demo.guru99.com/V4/manager/addcustomerpage.php", "http://www.demo.guru99.com/V4/manager/addcustomerpage.php");
}
@AfterMethod
public void tearDown() {
logger.info("Browser is teardown after Method");	
}
@Test(dataProvider = "New Customer", dataProviderClass=ExcelUtility.class)
public void test_002(String CustomerName, String DOB, String Address, String City, String State,String Pin,String Phone,String Email,String Password) {
	  logger.info("user successfully Login");
	   commonMethods.getTitle(getDriver(),"Guru99 Bank Manager HomePage");
	   //driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
	   commonMethods.click(newcustomer.ClickNewCustomer, getDriver());
	   commonMethods.sendData(newcustomer.TxtCustomerName, getDriver(), CustomerName);
	   commonMethods.sendData(newcustomer.TxtDateOfBirth, getDriver(), DOB);
	   commonMethods.sendData(newcustomer.TxtAddress, getDriver(), Address);
	   commonMethods.sendData(newcustomer.TxtCity, getDriver(), City);
	   commonMethods.sendData(newcustomer.TxtState, getDriver(), State);
	   commonMethods.sendData(newcustomer.TxtPin, getDriver(), Pin);
	   commonMethods.sendData(newcustomer.TxtMobNum, getDriver(), Phone);
	   commonMethods.sendData(newcustomer.TxtEmail, getDriver(), Email);
	   commonMethods.sendData(newcustomer.TxtPassword, getDriver(), Password);
	   //driver.findElement(By.xpath("//input[@value='Submit']")).click();
	   commonMethods.click(newcustomer.ClickSubmit, getDriver());
	   logger.info("Execution of Test Case_002 is completed");
	} 

@AfterMethod
public void tearDown1() {
	
}
	}
	

