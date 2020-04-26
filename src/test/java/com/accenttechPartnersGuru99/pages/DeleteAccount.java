package com.accenttechPartnersGuru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.accenttechPartnersGuru99.baseClass.BaseClass;

public class DeleteAccount extends BaseClass {

	public DeleteAccount(WebDriver driver) {
		super(driver);
}
	
	@FindBy(xpath="//a[@href='deleteAccountInput.php']")
	public WebElement ClickDeleteAccount;

	@FindBy(how=How.NAME,using = "accountno")
	public WebElement AccountNo;

	@FindBy(how=How.NAME, using = "AccSubmit")
	public WebElement Submit;
}
