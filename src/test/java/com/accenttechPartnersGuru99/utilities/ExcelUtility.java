package com.accenttechPartnersGuru99.utilities;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	// to open the excel sheet and to open the sheet
	public void openExcel(String SheetName) {
		
		try {
			FileInputStream	fis = new FileInputStream (".\\src\\test\\resources\\ExcelDatas\\New Customer.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(SheetName);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		}
	// to get the data from the excel sheet
	public String getData(int row, int col) {
		if (sheet.getRow(row).getCell(col)!=null) {
		return sheet.getRow(row).getCell(col).toString();	
		}
		else
		return " " ;
	}
	public int getRowNum() {
		return sheet.getPhysicalNumberOfRows();
	}	
		
	public int getcolumn(int rowIndex) {
		return sheet.getRow(rowIndex).getLastCellNum();
		
	}
	public void closeExcel() {
	try {
		workbook.close();
	} catch (IOException e) {
		e.printStackTrace();
	}	
	}
	@DataProvider(name="New Customer")
	public Object [][] getNewCustomerData(){
	
		ExcelUtility ec = new ExcelUtility();
		ec.openExcel("Sheet1");
		int TotalRows = ec.getRowNum();
		int TotalColumn = ec.getcolumn(0);
		Object[][] data = new Object [TotalRows-1][TotalColumn];
		for(int i=1; i<TotalRows; i++) {
		for(int j=0; j<TotalColumn; j++) {
			data[i-1][j]=ec.getData(i, j);
			
		
		}
		}
		
	return data ;
		
	}
	}


