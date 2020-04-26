package com.accenttechPartnersGuru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.accenttechPartnersGuru99.baseClass.BaseClass;

public class NewAccount extends BaseClass {

	public NewAccount(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[@href='addAccount.php']")
	public WebElement ClickNewAccount;		
	
	@FindBy(how=How.NAME,using = "cusid")
	public WebElement CustomerId;
	
	@FindBy(how = How.NAME, using="inideposit")
	public WebElement InitialDeposit;
	
	@FindBy(how=How.NAME, using = "button2")
	public WebElement Submit;

}
