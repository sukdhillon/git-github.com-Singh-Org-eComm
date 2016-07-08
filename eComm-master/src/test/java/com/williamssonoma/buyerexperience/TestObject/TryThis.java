package com.williamssonoma.buyerexperience.TestObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TryThis {

private static XSSFWorkbook wb;

public static void main(String[] args){
		try{
		String filePath = "datasheet.xlsx";
		
		FileInputStream fileInputStream = new FileInputStream(filePath);
		
		Workbook wb = new XSSFWorkbook(fileInputStream);
		
		XSSFSheet sheet = (XSSFSheet) wb.getSheetAt(0);
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		System.out.println(cell);
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
		
		
		
}
	
}
