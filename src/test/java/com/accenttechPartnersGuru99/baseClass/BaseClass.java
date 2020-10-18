package com.accenttechPartnersGuru99.baseClass;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
public static WebDriver driver=null;
public static WebDriverWait wait;
public static WebElement WElement;
public static Logger logger;
public static Logger1 logger1;

public BaseClass (WebDriver driver) {
	BaseClass.driver=driver;
}
public static WebDriver getDriver() {
	logger = Logger.getLogger("ebanking");
	PropertyConfigurator.configure("log4j.properties");
	
if (driver==null) {
	return driver;
}
else {
	return driver;
}
}

public void setDriver(WebDriver driver) {
	BaseClass.driver=driver;	
}
}
