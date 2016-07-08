package com.williamssonoma.buyerexperience.TestObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadingFromExcel {
	
	@Test
	public void TryThisTest() throws Exception{
		
		String filePath = "src\\test\\resources\\datasheet.xlsx";
		FileInputStream fileInputStream = null;
		
		try {
		fileInputStream = new FileInputStream(filePath);
		System.out.println(fileInputStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("<font color = green> file is not accessible at given location</font>");
			e.printStackTrace();
			
		}
		
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		 Sheet firstSheet = workbook.getSheetAt(0);
	        Iterator<Row> iterator = firstSheet.iterator();
	         
	        while (iterator.hasNext()) {
	            Row nextRow = iterator.next();
	            Iterator<Cell> cellIterator = nextRow.cellIterator();
	             
	            while (cellIterator.hasNext()) {
	                Cell cell = cellIterator.next();
	                 
	                switch (cell.getCellType()) {
	                    case Cell.CELL_TYPE_STRING:
	                        System.out.print(cell.getStringCellValue());
	                        break;
	                    case Cell.CELL_TYPE_BOOLEAN:
	                        System.out.print(cell.getBooleanCellValue());
	                        break;
	                    case Cell.CELL_TYPE_NUMERIC:
	                        System.out.print(cell.getNumericCellValue());
	                        break;
	                }
	                System.out.print(" - ");
	            }
	            System.out.println();
	        }
	         
	        (workbook).close();
	        //inputStream.close();
	    }
		
		
	}


