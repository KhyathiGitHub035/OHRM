package oHRM_LoginFunctionality;

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

public class OrangeHRMApplicationLoginFunctionalityTest extends BaseTest
{
	
	XSSFWorkbook oHRMWorkBook;
	XSSFSheet oHRMTestDataSheet;
	Row row1;
	Cell rowOfCell;

	@Test(priority=1,description="OrangeHRM Application Login Test Validation")
	public void orangeHRMApplicationLoginFunctionalityTest() throws IOException, InterruptedException
	{
		FileInputStream oHRMTestDataFile=new FileInputStream("C:\\OrangeHRMApplication\\WebTesting\\src\\oHRM_ExcelFiles\\OrangeHRM_LogInTestDataFile.xlsx");
		
		oHRMWorkBook=new XSSFWorkbook(oHRMTestDataFile);
		
		oHRMTestDataSheet=oHRMWorkBook.getSheet("LogInTestData");
		
		row1=oHRMTestDataSheet.getRow(1);
		
		rowOfCell= row1.getCell(0);
		
		String Expected_LogInPageText=rowOfCell.getStringCellValue();
		System.out.println("The OrangeHRM Application Expected LogIn Page LogIn Panel Text is:"+Expected_LogInPageText);
		
		//id=<div id="logInPanelHeading">LOGIN Panel</div>
		
				By orangeHRMApplicationLogInPageLogInPanelProperty=By.id("logInPanelHeading");
				WebElement orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelProperty);
				
				
				String actual_LogInPageText=orangeHRMApplicationLogInPageLogInPanel.getText();
				System.out.println("The OrangeHRM Application Actual LogIn Page LogIn Panel Text is:"+actual_LogInPageText);
				
				Cell actual_Text=row1.createCell(2);
				actual_Text.setCellValue(actual_LogInPageText);
		
		if(actual_LogInPageText.equals(Expected_LogInPageText))
		{
			 Cell logInPanelTestResult=row1.createCell(3);
			 
			System.out.println("Successfully Navigated To OrangeHRM Application LogIn Page-TEXT Found-PASS");
			
			logInPanelTestResult.setCellValue("PASS");
			
		}
		else
		{
			Cell logInPanelTestResult=row1.createCell(3);
		
			System.out.println("Failed to Navigate To OrangeHRM Application LogIn Page-TEXT Not Found-FAIL");
			
			logInPanelTestResult.setCellValue("FAIL");
			
		}
		
	    Cell expected_OrangeHRMApplicationTitle=row1.getCell(4);
		String expected_OrangeHRMApplicationLogInPageTitle=expected_OrangeHRMApplicationTitle.getStringCellValue();
		
		 System.out.println("The Expected Title of the OrangeHRM Application LogIn Page is:"+expected_OrangeHRMApplicationLogInPageTitle);
		
		 String actual_OrangeHRMApplicationTitle=driver.getTitle();
		 System.out.println("The Actual Title of OrangeHRM Application LogIn Page Title is: "+actual_OrangeHRMApplicationTitle);
		 
		 Cell actual_Title=row1.createCell(5);
		 actual_Title.setCellValue(actual_OrangeHRMApplicationTitle);
		 
		 if(actual_OrangeHRMApplicationTitle.equalsIgnoreCase(expected_OrangeHRMApplicationLogInPageTitle))
		 {
			Cell titleTestResult=row1.createCell(6);
			
			 System.out.println("OrangeHRM Title Matched-PASS");
			 
			 titleTestResult.setCellValue("PASS");
		 }
		 
		 else
		 {
			 Cell titleTestResult=row1.createCell(6);
			 
			 System.out.println("OrangeHRM Title NOT Matched-FAIL");
			 
			 titleTestResult.setCellValue("FAIL");
		 }
		 System.out.println();
		 
		 int rowCount=oHRMTestDataSheet.getLastRowNum();
		 
		 for(int rowIndex=1;rowIndex<=rowCount;rowIndex++)
		 { 
		  	oHRMTestDataSheet.getRow(rowIndex);
			 
			 Cell userNameDataCell=row1.getCell(7);
			 String userNameTestData=userNameDataCell.getStringCellValue();
			 	
			 Cell passwordDataCell=row1.getCell(8);
			 String passwordTestData=passwordDataCell.getStringCellValue(); 
			
			//<input name="txtUsername" id="txtUsername" type="text" fdprocessedid="xhgk9d">
			
			By userNameProperty=By.id("txtUsername");
		    WebElement userName=driver.findElement(userNameProperty);
		    userName.sendKeys(userNameTestData);
		    
		    //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password" fdprocessedid="sapxs">
		    
		     By passwordProperty=By.id("txtPassword");
		     WebElement password= driver.findElement(passwordProperty);
		     password.sendKeys(passwordTestData);
		     
		     //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN" fdprocessedid="g3xdzi">
		    
		     By logInButtonProperty=By.id("btnLogin");
		     WebElement logInButton=driver.findElement(logInButtonProperty);
		     logInButton.click();
		   
		    try {

				By welcomeAdminProperty = By.linkText("Welcome Admin");
				WebElement welcomeAdmin = driver.findElement(welcomeAdminProperty);

				String actualwelcomeAdminText = welcomeAdmin.getText();
				
				String expectedwelcomeAdminText = row1.getCell(9).getStringCellValue();

				row1.createCell(10).setCellValue(actualwelcomeAdminText);

				Cell homePageTestResult = row1.createCell(11);

				if (actualwelcomeAdminText.contains(expectedwelcomeAdminText)) {

					System.out.println("Successfully Navigated to orangeHrm Home Page:-Pass");

					homePageTestResult.setCellValue("Pass");

				}

				if (welcomeAdmin.isDisplayed()) {

                 	welcomeAdmin.click();
					Thread.sleep(1000);

					By logOutProperty = By.linkText("Logout");

					WebElement logOut = driver.findElement(logOutProperty);

					logOut.click();

				}

			} 
		    catch (Exception e)
		    {


				By invalidCredentialsProperty = By.id("spanMessage");

				WebElement invalidCredentials = driver.findElement(invalidCredentialsProperty);

				String actualinvalidCredentials = invalidCredentials.getText();

				Cell homePageTestResult = row1.createCell(11);

				String expecteddataOfLoginInvalid = row1.getCell(1).getStringCellValue();

				if (actualinvalidCredentials.equalsIgnoreCase(expecteddataOfLoginInvalid))
				{

					System.out.println("Failed To login Because of invalid Credentials:-Fail");

					homePageTestResult.setCellValue("Fail");

				}
			}
		 }
				
		
		 
		FileOutputStream oHRMTestResultFile=new FileOutputStream("C:\\OrangeHRMApplication\\WebTesting\\src\\oHRM_ExcelFiles\\OrangeHRM_LogInTestResultFile.xlsx");
        oHRMWorkBook.write(oHRMTestResultFile);
	
	}	
	
}


