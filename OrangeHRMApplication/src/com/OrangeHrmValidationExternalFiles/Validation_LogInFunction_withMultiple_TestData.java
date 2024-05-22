package com.OrangeHrmValidationExternalFiles;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;



import org.apache.commons.io.FileUtils;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.server.handler.GetAlertText;

public class Validation_LogInFunction_withMultiple_TestData {
	
		public static void main(String[] args) throws IOException {

			WebDriver driver;

			String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
			
             System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get(applicationUrlAddress);

			FileInputStream orangeHrmLoginTestDatafile=new FileInputStream("C:\\OrangeHRMApplication\\OrangeHRMApplication\\src\\com\\OrangeHRMLoginTestDataFiles\\OrangeHRM_LogInTestDataFile.xlsx");

			XSSFWorkbook oragneHrmLoginTestDataWorkBook=new XSSFWorkbook(orangeHrmLoginTestDatafile);

			XSSFSheet  orangeHrmLoginTestDataSheet=oragneHrmLoginTestDataWorkBook.getSheet("LogInTestData");

			int rowcount=orangeHrmLoginTestDataSheet.getLastRowNum();

			for(int arrayIndex=1;arrayIndex<rowcount;arrayIndex++) {

				
			    Row Row=orangeHrmLoginTestDataSheet.getRow(1);

			     Cell rowOfcell=Row.getCell(0);

			     String expected_OrangeHrmLoginPanelText=rowOfcell.getStringCellValue();

			     Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

			     rowOfcell=Row.createCell(0);

			     rowOfcell.setCellValue(expected_OrangeHrmLoginPanelText);

			    
			     System.out.println(" Expected OrangeHrm Login Page text is -"+expected_OrangeHrmLoginPanelText);

			     
			    By orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id("logInPanelHeading");

				WebElement orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelTextProperty);

				String OrangeHRMApplicationLogInPageLogInPanelText=orangeHRMApplicationLogInPageLogInPanel.getText();

				

				System.out.println(" Actual Orangehrm Login Page text is - "+OrangeHRMApplicationLogInPageLogInPanelText);

				Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

				Cell actual_OrangeHrmLoginPageTextActualCell=Row.createCell(2);

			   	actual_OrangeHrmLoginPageTextActualCell.setCellValue(OrangeHRMApplicationLogInPageLogInPanelText);


				if(OrangeHRMApplicationLogInPageLogInPanelText.equals(expected_OrangeHrmLoginPanelText))

				{

					System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - TEXT Found - PASS ");

					Cell result_OfLoginPageText=Row.createCell(3);

					result_OfLoginPageText.setCellValue(" Successfully Navigated to the OrangeHRM Application LogIN Page - TEXT Found - PASS ");
		

				}

				else

				{

				System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");

				Cell result_OfLoginPageText=Row.createCell(3);

				result_OfLoginPageText.setCellValue(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");


				}

				Row=orangeHrmLoginTestDataSheet.getRow(1);

				Cell orangeHrmLoginPageTitle=Row.getCell(4);

				
				String expected_OrangeHrmLoginPageTitle=orangeHrmLoginPageTitle.getStringCellValue();

				Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

				orangeHrmLoginPageTitle=Row.createCell(4);

				orangeHrmLoginPageTitle.setCellValue(expected_OrangeHrmLoginPageTitle);

				System.out.println(" Expected OrangeHrm Login Page title is - "+expected_OrangeHrmLoginPageTitle);


			    String	orangeHrmLoginPagetitle=driver.getTitle();

				Cell actual_OrangeHrmLoginPageTitle=Row.createCell(5);

				actual_OrangeHrmLoginPageTitle.setCellValue(orangeHrmLoginPagetitle);

				System.out.println(" Actual OrangeHrm Login Page title is -"+orangeHrmLoginPagetitle);

			
				if(orangeHrmLoginPagetitle.equals(expected_OrangeHrmLoginPageTitle))

				{

					System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");

					Cell result_OfLoginPageTitle=Row.createCell(6);

					result_OfLoginPageTitle.setCellValue(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS");

				}

				else

				{

					System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");

					Cell result_OfLoginPageTitle=Row.createCell(6);

					result_OfLoginPageTitle.setCellValue(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");

				}

				
				String expected_OrangeHRMApplicationLogInPageUrlAddress="orangehrm-4.2.0.1";

				System.out.println(" The Expected URL address of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageUrlAddress);



				String actual_OrangeHRMApplicationLogInPageUrlAddress=driver.getCurrentUrl();

				System.out.println(" The Actual URL address of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageUrlAddress);



				if(actual_OrangeHRMApplicationLogInPageUrlAddress.contains(expected_OrangeHRMApplicationLogInPageUrlAddress)){

						System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");

				}
				else
				{

						System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");

					}

				System.out.println();

				Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

				Cell orangeHrmLogin_UserName=Row.getCell(7);

				String userNameTestData=orangeHrmLogin_UserName.getStringCellValue();
				
				Cell orangeHrmLogin_Password=Row.getCell(8);

				String passwordTestData=orangeHrmLogin_Password.getStringCellValue();
	

			    By userNameProperty=By.id("txtUsername"); 

				WebElement userName=driver.findElement(userNameProperty); 

				userName.sendKeys(userNameTestData);


				// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

				By passwordProperty=By.name("txtPassword");

				WebElement password=driver.findElement(passwordProperty);

				password.sendKeys(passwordTestData);


				// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">


				By logInButtonProperty=By.className("button");

				WebElement logInButton=driver.findElement(logInButtonProperty);

				logInButton.click();
				

				Row=orangeHrmLoginTestDataSheet.getRow(1);

				Cell welcomeAdmin_HomePage=Row.getCell(9);

				String expected_WelecomeAdmin_Text=welcomeAdmin_HomePage.getStringCellValue();

				Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

				Cell expected_HomePageWelcomeText=Row.createCell(9);

				expected_HomePageWelcomeText.setCellValue(expected_WelecomeAdmin_Text);
	

				try {
		

				By welComeAdminProperty=By.partialLinkText("Welcome");

				WebElement welComeAdmin=driver.findElement(welComeAdminProperty);

				String actual_HomePageText=welComeAdmin.getText();

				System.out.println("Actual OrangeHrm Home Page Text - "+actual_HomePageText);

			 	Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

				Cell actual_HomePageWelcomeText=Row.createCell(10);

				actual_HomePageWelcomeText.setCellValue(actual_HomePageText);

				System.out.println("Expected  Home Page text is - "+expected_WelecomeAdmin_Text);

				if(actual_HomePageText.contains(expected_WelecomeAdmin_Text)){

					System.out.println(" Successfully Navigated to the OrangeHRM Application Home Page - PASS ");

					Cell result_OfHomePageTextValidation=Row.createCell(11);

					result_OfHomePageTextValidation.setCellValue(" Succussfully  Navigate to the OrangeHRM Application Home Page - TEXT Found - PASS ");
	

			}
				else
			{

					System.out.println(" Failed to Navigate to the OrangeHRM Application Home Page - FAIL ");

					Cell result_OfHomePageTextValidation=Row.createCell(11);

					result_OfHomePageTextValidation.setCellValue("Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");

				}


				welComeAdmin.click();

				 Thread.sleep(5000); 

				 By logOutProperty=By.linkText("Logout");

				 WebElement logOut= driver.findElement(logOutProperty);

				 logOut.click();

				}
				catch (Exception e) {

				    String actual_HomePageText="Login Page";

					Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

					Cell actual_HomePageWelcomeText=Row.createCell(10);

					actual_HomePageWelcomeText.setCellValue(actual_HomePageText);

				}

				try {
		
				Row=orangeHrmLoginTestDataSheet.getRow(1);

				rowOfcell=Row.getCell(1);

			   String  expected_OrangeHrmLoginPanelTextInvalid=rowOfcell.getStringCellValue();


			     System.out.println(" Expected OrangeHrm Login Page text is -"+expected_OrangeHrmLoginPanelTextInvalid);

			     Row=orangeHrmLoginTestDataSheet.getRow(arrayIndex);

				rowOfcell=Row.createCell(1);

				rowOfcell.setCellValue(expected_OrangeHrmLoginPanelTextInvalid);


			     //<span id="spanMessage">Invalid credentials</span>

			By orangeHrmLoginPageTextProperty=By.id("spanMessage");

			WebElement  orangeHrmLoginPageText=driver.findElement(orangeHrmLoginPageTextProperty);

		    String	actual_orangehrmLoginPage=orangeHrmLoginPageText.getText();

		    

		    System.out.println(" Actual Orangehrm Login Page text is - "+actual_orangehrmLoginPage);

			 if(expected_OrangeHrmLoginPanelTextInvalid.equals(actual_orangehrmLoginPage)) {

			    	
			  System.out.println(" Failed to Navigate to the OrangeHRM Application Home Page - TEXT Not Found - FAIL ");

			  Cell result_OfHomePageTextValidation=Row.createCell(11);

			  result_OfHomePageTextValidation.setCellValue("Failed to Navigate to the OrangeHRM Application Home Page -TEXT Not Found - FAIL ");

			    

			  File orangehrmApplicationInvalidCredianial_ScreenShort =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			  FileUtils.copyFile(orangehrmApplicationInvalidCredianial_ScreenShort,new File("./ApplicationScreenShots/OrangeHRM"+userNameTestData+" "+passwordTestData+".png"));

			  }
			 else {

			    	 System.out.println(" Successfully Navigated to the OrangeHRM Application Home Page -TEXT  Found - PASS ");

					 Cell result_OfHomePageTextValidation=Row.createCell(11);

					 result_OfHomePageTextValidation.setCellValue(" Successfully  Navigate to the OrangeHRM Application Home Page - TEXT Found - PASS ");	 

			     }

				 }

			     catch (Exception e) {

					

				}

				FileOutputStream  orangeHrmLogiFunctionTestResults=new FileOutputStream("C:\\OrangeHRMApplication\\OrangeHRMApplication\\src\\com\\OrangeHRMLoginTestDataFiles\\OrangeHRM_LogInTestDataFile.xlsx");

				oragneHrmLoginTestDataWorkBook.write(orangeHrmLogiFunctionTestResults);
				

			}

			driver.close();


		}



	}