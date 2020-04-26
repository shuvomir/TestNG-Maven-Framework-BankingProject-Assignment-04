package com.accenttechPartnersGuru99.browserfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.accenttechPartnersGuru99.baseClass.BaseClass;
import com.accenttechPartnersGuru99.utilities.ConfigReader;

public class browseFactory extends BaseClass {

	public browseFactory() {
		super(driver);
	
	}
static ConfigReader cf = PageFactory.initElements(driver, ConfigReader.class);

public static WebDriver initiateBrowser() {
	driver = BaseClass.getDriver();
if (cf.getTestData("browser").equalsIgnoreCase("chrome")) {
System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");
driver = new ChromeDriver();
}
else if(cf.getTestData("browser").equalsIgnoreCase("IE")) {
System.setProperty("webdriver.ie.driver", ".\\src\\test\\resources\\drivers\\IEDriverServer.exe");
driver = new ChromeDriver();
}
else if(cf.getTestData("browser").equalsIgnoreCase("firefox")) {
System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\drivers\\geckodriver.exe");
driver = new ChromeDriver();
}
else {
	System.out.println("Invalid Browser Selected");
}
driver.get(cf.getTestData("URL"));
driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(cf.getTestData("UserName"));
driver.findElement(By.xpath("//input[@name='password']")).sendKeys(cf.getTestData("Password"));
driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
driver.manage().window().maximize();
return driver;

}	
}
