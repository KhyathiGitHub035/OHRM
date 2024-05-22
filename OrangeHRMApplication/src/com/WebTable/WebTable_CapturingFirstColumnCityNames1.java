package com.WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_CapturingFirstColumnCityNames1 extends BaseTest {
	
	@Test(priority=1,description="Capturing First Column City Names from the WebTable")
	public void capturingFirstColumnCityNames() throws IOException
	{
		
		String xpathExpressionPart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	    String xpathExpressionPart2="]/td[1]";
	    
	    FileInputStream excelWebDataFile = new FileInputStream("C:\\OrangeHRMApplication\\OrangeHRMApplication\\src\\excelTestDataFile\\WebTable_SingleColumn.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(excelWebDataFile);
		XSSFSheet testDataSheet = workBook.getSheet("SingleColumn");
		
	    for(int rowIndex=1;rowIndex<=36;rowIndex++)
	    {
	 	
	    	Row newRow=testDataSheet.createRow(rowIndex);
	    	Cell newRowOfCell=newRow.createCell(0);
	    	By cityNameProperty=By.xpath(xpathExpressionPart1+rowIndex+xpathExpressionPart2);
	        WebElement cityName=driver.findElement(cityNameProperty);
	        String cityNameText=cityName.getText();
	        
	        System.out.println(cityNameText);
	        newRowOfCell.setCellValue(cityNameText);
	        
	    	}

    		
	   
	    FileOutputStream testResultFile = new FileOutputStream("C:\\\\OrangeHRMApplication\\\\OrangeHRMApplication\\\\src\\\\excelTestDataFile\\\\WebTable_SingleColumn.xlsx");
	    workBook.write(testResultFile);

	
	}
}
