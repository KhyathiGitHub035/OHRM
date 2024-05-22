package com.OHRM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {
	
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	
	FileInputStream logInTestDataFile;
	XSSFWorkbook workBook;
	XSSFSheet logInTestDataSheet;
	Row logInTestDataRow;
	Cell logInUserNameRowOfCell;
	Cell logInPasswordRowOfCell;
	
	FileOutputStream testResultFile;
	
	WebElement welComeAdmin;
	
	public void orangeHRMApplicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
	}
	
	public void orangeHRMApplicationValidation_LogInPage()
	{
		//Expected Title should be-OrangeHRM
		
		String expected_OrangeHRMApplicationLogInPageTitle="OrangeHRM";
		System.out.println("The Expected Title of the OrangeHRM Application LogIn Page is:"+expected_OrangeHRMApplicationLogInPageTitle);
	
		String actual_OrangeHRMApplicationLogInPageTitle=driver.getTitle();
		System.out.println("The Actual Title of the OrangeHRM Application LogIn Page is:"+actual_OrangeHRMApplicationLogInPageTitle);
		
		if(actual_OrangeHRMApplicationLogInPageTitle.equals(expected_OrangeHRMApplicationLogInPageTitle))
		{
			System.out.println("Successfully Navigated to OrangeHRM Application LogIn page-PASS");
		}
		else
		{
			System.out.println("Failed to Navigate to OrangeHRM Application LogIn Page-FAIL");
		}
		
		System.out.println();
		
		//Expected Url Address should have-orangehrm-4.2.0.1
		
		String expected_OrangeHRMApplicationLogInPageURLAddress="orangehrm-4.2.0.1";
		System.out.println("The Expected  Url Address of OrangeHRM Application LogIn Page is:"+expected_OrangeHRMApplicationLogInPageURLAddress);
		
		String actual_OrangeHRMApplicationLogInPageURLAddress="orangehrm-4.2.0.1";
		System.out.println("The Actual Url Address of OrangeHRM Application LogIn Page is:"+actual_OrangeHRMApplicationLogInPageURLAddress);
	
		if(actual_OrangeHRMApplicationLogInPageURLAddress.contains(expected_OrangeHRMApplicationLogInPageURLAddress))
		{
			System.out.println("Successfully Navigated to the OrangeHRM Application LogIn Page-PASS");
		}
		else
		{
			System.out.println("Failed to Navigate to the OrangeHRM Application Login Page-FAIL");
		}
		System.out.println();
		
		//Expected LogIn page Text-LOGIN Panel
		
		String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
		System.out.println("The Expected TEXT of the OrangeHRM Application LogIn Page is"+expected_OrangeHRMApplicationLogInPageText);
	
		//id="logInPanelHeading"
		By orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id("logInPanelHeading");
		WebElement orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelTextProperty);
			
		String actual_OrangeHRMApplicationLogInPageText=orangeHRMApplicationLogInPageLogInPanel.getText();
		System.out.println("The Actual TEXT of the OrangeHRM Application LogIn Page is:"+actual_OrangeHRMApplicationLogInPageText);		
	
		if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
		{
			System.out.println("Successfully Navigated to the OrangeHRM Application LogIn Page-TEXT Found-PASS");
		}
		else
		{
			System.out.println("Failed to Navigate to the OrangeHRM Application LogIn Page-TEXT NOT Found");
		}
	
	}
	
	public void orangeHRMApplicationClose()
	{
		driver.close();
	}
	
	public void orangeHRMApplicationLogInTest() throws IOException
	{
		
		//Getting the Test Data from the External File
		
		logInTestDataFile=new FileInputStream("C:\\\\OrangeHRMApplication\\\\OrangeHRMApplication\\\\src\\\\com\\\\OrangeHRMLoginTestDataFiles\\\\OrangeHRMLoginDetails.xlsx");
		workBook=new XSSFWorkbook(logInTestDataFile);
		logInTestDataSheet=workBook.getSheet("validation");
		
		logInTestDataRow=logInTestDataSheet.getRow(1);
		logInUserNameRowOfCell=logInTestDataRow.getCell(0);
		
		String userNameTestData=logInUserNameRowOfCell.getStringCellValue();
	
		By userNameProperty=By.id("txtUsername");
	    WebElement userName=driver.findElement(userNameProperty);
	    userName.sendKeys(userNameTestData);
	

	    // <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

	   logInPasswordRowOfCell=logInTestDataRow.getCell(1);
	   String passwordTestData=logInPasswordRowOfCell.getStringCellValue(); 
	
	   By passwordProperty=By.name("txtPassword");
	   WebElement password=driver.findElement(passwordProperty);
	   password.sendKeys(passwordTestData);
	
	   // <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

	   By logInButtonProperty=By.className("button");
	   WebElement logInButton= driver.findElement(logInButtonProperty);
	   logInButton.click();
	
	   System.out.println();
	   
	   // Expected Title should be - OrangeHRM

	   String expected_OrangeHRMApplicationHomePageTitle="OrangeHRM";
	   System.out.println("The Expected Title of the OrangeHRM Application Home Page is:"+expected_OrangeHRMApplicationHomePageTitle);
	
	   String actual_OrangeHRMApplicationHomePageTitle=driver.getTitle();
	   System.out.println("The Actual Title of the OrangeHRM Application Home Page is:"+actual_OrangeHRMApplicationHomePageTitle);
	
	   if(actual_OrangeHRMApplicationHomePageTitle.equals(expected_OrangeHRMApplicationHomePageTitle))
	   {
		   System.out.println("Successfully Navigated to the OrangeHRM Application Home Page is-PASS");
	   }
	   else
	   {
		   System.out.println("Failed to Navigate to the OrangeHRM Application Home Page-FAIL");
	   }
	
	}
	
	public void orangeHRMApplicationValidation_HomePage() throws IOException
	{
		// Validating HOME Page
		// expected Text should have - Admin
		
		String expected_OrangeHRMApplicationHomePageText="Admin";
        System.out.println("The Expected TEXT of the OrangeHRM Application Home Page is:"+expected_OrangeHRMApplicationHomePageText);

     // <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

     // By welComeAdminProperty=By.linkText("Welcome Admin");

       By welComeAdminProperty=By.partialLinkText("Welcome");
       welComeAdmin= driver.findElement(welComeAdminProperty);
       String actual_WelcomeAdminText=welComeAdmin.getText();
       System.out.println("The Actual Text of the OrangeHRM Application Home Page is:"+actual_WelcomeAdminText);  
		
       if(actual_WelcomeAdminText.contains(expected_OrangeHRMApplicationHomePageText))
       {
    	   System.out.println("Successfully Navigated to the OrangeHRM Application Home Page-PASS");
    	   Cell testResultCell=logInTestDataRow.createCell(2);
           testResultCell.setCellValue("Successfully Navigated to the OrangeHRM Application Home Page-PASS");
       }
       else
       {
    	   System.out.println("Failed to Navigate to the OrangeHRM Application Home Page-FAIL");
           Cell testResultCell=logInTestDataRow.createCell(2);
           testResultCell.setCellValue("Failed to Navigate to the OrangeHRM Application Home Page-FAIL"); 
       }
       
       testResultFile=new FileOutputStream("C:\\OrangeHRMApplication\\OrangeHRMApplication\\src\\com\\OrangeHRMLoginTestDataFiles\\OrangeHRMTestResult.xlsx");
       workBook.write(testResultFile);
       System.out.println();
		
	}
	
	public void orangeHRMApplication_LogOutTest() throws InterruptedException
	{
		welComeAdmin.click();
		Thread.sleep(5000);
		// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		/*
		By logOutProperty=By.linkText("Logout");
		OR
		*/
		By logOutProperty=By.partialLinkText("Logo");
        WebElement logOut=driver.findElement(logOutProperty);
		logOut.click();
		
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		LogInTest logIn=new LogInTest();
		logIn.orangeHRMApplicationLaunch();
		logIn.orangeHRMApplicationValidation_LogInPage();
		logIn.orangeHRMApplicationLogInTest();
		logIn.orangeHRMApplicationValidation_HomePage();
		logIn.orangeHRMApplication_LogOutTest();
		logIn.orangeHRMApplicationClose();
		

				
	}
	
	
	

}
