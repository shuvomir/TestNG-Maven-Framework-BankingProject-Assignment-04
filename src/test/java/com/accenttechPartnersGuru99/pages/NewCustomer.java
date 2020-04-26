package com.accenttechPartnersGuru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.accenttechPartnersGuru99.baseClass.BaseClass;

public class NewCustomer extends BaseClass {
	
	public NewCustomer(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[@href='addcustomerpage.php']")
	public WebElement ClickNewCustomer;
	
	@FindBy(xpath="//input[@onkeyup='validatecustomername();']")
	public WebElement TxtCustomerName;
	
	@FindBy(xpath="//input[@value='m']")
	public WebElement ClickGender;
	
	@FindBy(xpath="//input[@id='dob']")
	public WebElement TxtDateOfBirth;
	
	@FindBy(how = How.NAME, using = "addr")
	public WebElement TxtAddress;
	
	@FindBy(how = How.NAME, using = "city")
	public WebElement TxtCity;
	
	@FindBy (how = How.NAME, using = "state")
	public WebElement TxtState;
	
	@FindBy (how = How.NAME, using = "pinno")
	public WebElement TxtPin;
	
	@FindBy (how = How.NAME, using = "telephoneno")
	public WebElement TxtMobNum;
	
	@FindBy (how = How.NAME, using = "emailid")
	public WebElement TxtEmail;
	
	@FindBy (how = How.NAME, using = "password")
	public WebElement TxtPassword;
	
	@FindBy(how = How.NAME, using = "sub")
	public WebElement ClickSubmit;

}
