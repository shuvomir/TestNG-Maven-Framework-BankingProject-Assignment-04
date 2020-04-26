package com.accenttechPartnersGuru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.accenttechPartnersGuru99.baseClass.BaseClass;

public class WithdrawalAmount extends BaseClass{

	public WithdrawalAmount(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//a[text()='Withdrawal']")
public WebElement ClickWithdrawal;

@FindBy(how=How.NAME,using = "accountno")
public WebElement AccountNo;

@FindBy(how=How.NAME, using = "ammount")
public WebElement Ammount;

@FindBy(how=How.NAME, using = "desc")
public WebElement Description;

@FindBy(how=How.NAME, using = "AccSubmit")
public WebElement Submit;

}
