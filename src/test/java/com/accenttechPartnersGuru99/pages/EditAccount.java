package com.accenttechPartnersGuru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.accenttechPartnersGuru99.baseClass.BaseClass;

public class EditAccount extends BaseClass {

	public EditAccount(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[@href='editAccount.php']")
	public WebElement ClickEditAccount;

	@FindBy(how=How.NAME, using = "accountno")
	public WebElement AccountNo;

	@FindBy(how=How.NAME, using = "AccSubmit")
	public WebElement Submit;
	
	@FindBy(how=How.NAME, using="AccSubmit")
	public WebElement FinalSubmit;
	
}
