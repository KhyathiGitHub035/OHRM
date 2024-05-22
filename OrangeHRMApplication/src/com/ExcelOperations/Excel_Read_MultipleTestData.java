package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {
	public static void main(String[] args) throws IOException {
		
		FileInputStream testDataFile=new FileInputStream("C:\\OrangeHRMApplication\\OrangeHRMApplication\\src\\excelTestDataFile\\Book3.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet=workBook.getSheet("TestData");
		
		//Identifying the number of Active Rows(Only Rows with TestData)in the Sheet
		int rowsCount=testDataSheet.getLastRowNum();
		
		//To go to Every Active Row in the Sheet
		for(int rowIndex=0;rowIndex<=rowsCount;rowIndex++)
		{
			//Going to the Particular row in the Sheet
			Row row=testDataSheet.getRow(rowIndex);
			
			//of the Current Active Row-Finding the number of Active Cells in it
			int rowOfCellsCount=row.getLastCellNum();
			
			//To go to every Active Row of its Corresponding Active Cells
			for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCellsCount;rowOfCellIndex++)
			{
				//To go to every Active Row of its Corresponding Active Cell
				Cell rowOfActiveCell=row.getCell(rowOfCellIndex);
				
				//Get the Test Data from the Active Row of an Active Cell
				String testData=rowOfActiveCell.getStringCellValue();
				System.out.print(testData+" ");
				
			}
			     System.out.println();
			
		}
		
		
	}

}
