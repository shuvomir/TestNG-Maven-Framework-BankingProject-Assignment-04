package com.accenttechPartnersGuru99.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop = new Properties() ;
	FileInputStream fis=null;	
	
	public ConfigReader () {
	try {
		fis = new FileInputStream("C:\\Users\\Owner-Pc\\Documents\\Eclipse 2020\\eclipse-workspace\\com.accenttechPartnersGuru99\\src\\test\\resources\\Config\\testData.properties");
		// fis = new FileInputStream(".\\src\\test\\resources\\Config\\testData.properties");  (instead of puting full path we can write only . symbol
		prop.load(fis);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		
}
}
// will get the string value from the property file	
public String getTestData (String Element) {
String value = prop.getProperty(Element);	
	return value;
	
	
}
}
