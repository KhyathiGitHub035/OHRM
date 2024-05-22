package com.OrangeHRMApplicationWebPages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class LogInPage extends BaseTest
{
	
	 FileInputStream orangeHRMApplicationTestDataFile;
	 XSSFWorkbook workBook;
	 XSSFSheet orangeHRMApplicationSheet;
	 Row orangeHRMRow;
	 Cell userNameTestDataCell;
	 String userNameTestData;
	 Cell passwordTestDataCell;
	 String passwordTestData;
	
	public LogInPage()
	{
		PageFactory.initElements(driver, this);
	}

	//This is an Object Repository Class
	
	//1.Information of the WebElement - based on the Property-Stored and assigned to a Variable
	
	//id="logInPanelHeading"
	
	@FindBy(id="logInPanelHeading")
	WebElement logInPanel;
	
	//2.Business Logic(User Defined Method)-An Operation that need to be performed on the WebElement
	
	public void orangeHRMApplication_LogInPage_LogInPanelValidation()
	{
		String expected_OrangeHRMApplicationLogInPage_LogInPanelText="LOGIN Panel";
	    Log.info("The Expected OrangeHRM Application LogIn Page Text is:"+expected_OrangeHRMApplicationLogInPage_LogInPanelText);
	    
	    String actual_OrangeHRMApplicationLogInPageLogInPanelText=logInPanel.getText();
	    Log.info("The Actual OrangeHRM Application LogIn Page Text is:"+actual_OrangeHRMApplicationLogInPageLogInPanelText);
		
	    if(actual_OrangeHRMApplicationLogInPageLogInPanelText.equals(expected_OrangeHRMApplicationLogInPage_LogInPanelText))
	    {
	    	Log.info("Successfully Navigated to OrangeHRM Application LogIn Page-PASS");
	    }
	    else
	    {
	    	Log.info("Failed to Navigate to OrangeHRM Application LogIn Page-FAIL");
	    }
		
	}
	
	// /html/body/div[1]/div/div[2]/div/img - LoGo Property
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/img")
	WebElement orangeHRMApplicationLogInPageLogo;

	public void orangeHRMApplication_LogInPageLogoValidation()
	{
		
	boolean flag=orangeHRMApplicationLogInPageLogo.isDisplayed();
	
	if(flag)
	{
	Log.info("OrangeHRM Application LogIn Page Contains LOGO - PASS");
	}
	else
	{
	Log.info("OrangeHRM Application LogIn Page DOEST NOT Contains LOGO - FAIL");
	}
	}
	
	//id="txtUsername"
	
	@FindBy(id="txtUsername")
	WebElement UserName;

	//name="txtPassword"
	
	@FindBy(name="txtPassword")
	WebElement Password;
	
	// name="Submit"

	@FindBy(name="Submit")
	WebElement logInButton;
	
	// id="welcome"
	
	 @FindBy(id="welcome")
	 WebElement welcomeAdmin;
	 
	 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	 
	 @FindBy(linkText ="Logout")
	 WebElement logOut;
	 
	
	public void logInValidation() throws IOException, InterruptedException
	{
		
		orangeHRMApplicationTestDataFile=new FileInputStream("C:\\OrangeHRMApplication\\OrangeHRMApplicationTesting\\src\\main\\java\\com\\OrangeHRMApplicationTestDataFIles\\OrangeHRM_LogInTestDataFile.xlsx");
		
		workBook=new XSSFWorkbook(orangeHRMApplicationTestDataFile);
		
		orangeHRMApplicationSheet=workBook.getSheet("LogInTestData");
		
		orangeHRMRow=orangeHRMApplicationSheet.getRow(1);
		
		int rowsCount=orangeHRMApplicationSheet.getLastRowNum();
		
		for(int rowIndex=1;rowIndex<=rowsCount;rowIndex++)
			
		{
			orangeHRMApplicationSheet.getRow(rowIndex);
			
			userNameTestDataCell=orangeHRMRow.getCell(7);
			userNameTestData=userNameTestDataCell.getStringCellValue();
			UserName.sendKeys(userNameTestData);
			
			Log.info(userNameTestData);
		   
			passwordTestDataCell=orangeHRMRow.getCell(8);
			passwordTestData=passwordTestDataCell.getStringCellValue();
		    Password.sendKeys(passwordTestData);
		    
		    Log.info(passwordTestData);
		    
		    logInButton.click();
		    
		    try
		    {
		    	
		    if(welcomeAdmin.isDisplayed())
		    	{
		    welcomeAdmin.click();
		    		    
		    logOut.click();
		    	
		        }
		    
		    }
		    catch(Exception e)
		    {
		    	Log.info("INVALID CREDENTIALS");
		    }	    
		   
		}
		
	}


}
