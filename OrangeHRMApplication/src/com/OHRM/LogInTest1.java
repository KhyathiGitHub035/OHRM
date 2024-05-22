package com.OHRM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

      public class LogInTest1
      {
    	public static void main(String[] args) throws IOException
    	{
			
		
    	WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
	
		FileInputStream excelTestDataFile = new FileInputStream("C:\\OrangeHRMApplication\\OrangeHRMApplication\\src\\com\\OrangeHRMLoginTestDataFiles\\OrangeHrmLoginValidation.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
		   XSSFSheet testDataSheet = workBook.getSheet("validation");
		   
			   int rowsCount=testDataSheet.getLastRowNum();
			   for(int index=1;index<=rowsCount;index++)
			   {
			    Row testDataSheetOfRow=testDataSheet.getRow(index);
			    Cell testDataSheetOfRowOfCell=testDataSheetOfRow.getCell(0);
			    String userNameTestData=testDataSheetOfRowOfCell.getStringCellValue();
			   
			    By userNameProperty=By.id("txtUsername");
			WebElement userName=driver.findElement(userNameProperty);
			userName.sendKeys(userNameTestData);


			Cell testDataSheetOfRow11=testDataSheetOfRow.getCell(1);
			String passwordTestData=testDataSheetOfRow11.getStringCellValue();

			By paaswordProperty=By.id("txtPassword");
			WebElement password=driver.findElement(paaswordProperty);
			password.sendKeys(passwordTestData);

			By loginButtonProperty=By.id("btnLogin");
			WebElement loginButton=driver.findElement(loginButtonProperty);
			loginButton.click();


			String  Expected_OrangeHRMApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
			System.out.println("The OrangeHRM Application Expected URL Address Is :- "+Expected_OrangeHRMApplicationUrlAddress);

			String Actual_OrangeHRMApplicationUrlAddress=driver.getCurrentUrl();
			System.out.println("The OrangeHRM Application Actual Url Address Is :- "+Actual_OrangeHRMApplicationUrlAddress);

			if(Actual_OrangeHRMApplicationUrlAddress.contains(Expected_OrangeHRMApplicationUrlAddress))
			{
			System.out.println(" Succesfully Navigate To OrangeHRM Application Homepage - PASS");

			Cell testDataSheetOfRowOfcell=testDataSheetOfRow.createCell(2);
			testDataSheetOfRowOfcell.setCellValue(" Succesfully Navigate To OrangeHRM Application Homepage - PASS");


			By welcomeAdminProperty=By.linkText("Welcome Admin");
			WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
			welcomeAdmin.click();
			
			
			By logoutProperty=By.linkText("Logout");
			WebElement logout=driver.findElement(logoutProperty);
			logout.click();
			System.out.println();
			}
			else
			{
			System.out.println("Failed To Navigate To OrangeHRM Application Homepage - FAIL");
			Cell testDataSheetOfRowOfcell=testDataSheetOfRow.createCell(2);
			testDataSheetOfRowOfcell.setCellValue("Failed To Navigate To OrangeHRM Application Homepage - FAIL");

			System.out.println();
			}

           FileOutputStream testResultFile = new FileOutputStream("C:\\\\OrangeHRMApplication\\\\OrangeHRMApplication\\\\src\\\\com\\\\OrangeHRMLoginTestDataFiles\\\\OrangeHrmLoginValidation.xlsx+");
		   workBook.write(testResultFile);
			    
		driver.close();
			   }
    	}
      }


		
    	
