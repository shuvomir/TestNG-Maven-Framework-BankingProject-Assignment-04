package com.accenttechPartnersGuru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.accenttechPartnersGuru99.baseClass.BaseClass;

public class FundTransfer extends BaseClass {

	public FundTransfer(WebDriver Driver) {
		super(driver);
	}
@FindBy(xpath="//a[@href='FundTransInput.php']")
public WebElement ClickFundTransfer;

@FindBy(how=How.NAME, using = "payersaccount")
public WebElement PayerAccountNumber;

@FindBy(how=How.NAME, using = "payeeaccount")
public WebElement PayeesAccountNumber;
	
@FindBy(how=How.NAME, using = "ammount")
public WebElement Ammount;	
	
@FindBy(how=How.NAME, using = "desc")
public WebElement Description;

@FindBy(how=How.NAME, using = "AccSubmit")
public WebElement ClickSubmit;


}
