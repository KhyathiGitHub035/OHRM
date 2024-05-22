package oHRM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class oHRM extends BaseTest {
	
	XSSFWorkbook workbook;

	XSSFSheet LoginTestDatasheet;



	public void orangeHrm_LoginPageValidation() throws IOException {

		FileInputStream LoginTestData = new FileInputStream("C:\\OrangeHRMApplication\\WebTesting\\src\\oHRM_ExcelFiles\\OrangeHRM_LogInTestDataFile.xlsx");

		workbook = new XSSFWorkbook(LoginTestData);

		LoginTestDatasheet = workbook.getSheet("LogInTestData");



		Row LoginTestDataRow = LoginTestDatasheet.getRow(1);

		Cell LoginPageTextRowOfCell = LoginTestDataRow.getCell(0);



		String expectedLoginPanelText = LoginPageTextRowOfCell.getStringCellValue();

		System.out.println("The Expected Login Panel Text is:-" + " " + expectedLoginPanelText);



		// Finding the Element of LOGINPANELText To do The Validation

		// <div id="logInPanelHeading">LOGIN Panel</div>

		By actualLoginPanelProperty = By.id("logInPanelHeading");

		WebElement actualLoginPanel = driver.findElement(actualLoginPanelProperty);

		String actualLoginPanelTextData = actualLoginPanel.getText();

		System.out.println("The Actual Login Panel Text is:-" + " " + actualLoginPanelTextData);



		// Creating a Cell to send the actualLogin panel

		Cell actualLoginPanelTextDataLoginPageTextcell = LoginTestDataRow.createCell(2);

		actualLoginPanelTextDataLoginPageTextcell.setCellValue(actualLoginPanelTextData);



		// creating a cell to send the TestResult of LoginPanel

		Cell LoginPanelValidationTestResult = LoginTestDataRow.createCell(3);



		if (actualLoginPanelTextData.equals(expectedLoginPanelText)) {

			System.out.println("Successfully Navigated OrangeHRM Application Login Page Text Matched :-PASS");

			LoginPanelValidationTestResult.setCellValue("Pass");

		} else {

			System.out.println("Failed to Navigate OrangeHRM Application Login Page Text Not Matched :-Fail");

			LoginPanelValidationTestResult.setCellValue("Fail");

		}

		

		System.out.println();



		Cell LoginPageTitleRowOFCell = LoginTestDataRow.getCell(4);

		String expectedLoginPageTitle = LoginPageTitleRowOFCell.getStringCellValue();

		System.out.println("The Expected Login Page Title" + " " + expectedLoginPageTitle);



		String Actual_LogInPageTitle = driver.getTitle();

		System.out.println("The Acutal Login page Title"+" "+Actual_LogInPageTitle);

		Cell actualLoginPageTitleValue = LoginTestDataRow.getCell(5);

		actualLoginPageTitleValue.setCellValue(Actual_LogInPageTitle);

		Cell LoginPageTitleResult = LoginTestDataRow.getCell(6);



		if (Actual_LogInPageTitle.equalsIgnoreCase(expectedLoginPageTitle)) {

			System.out.println("Successfully Navigated OrangeHRM Application Title Matched :-PASS");

			LoginPageTitleResult.setCellValue("Pass");

		} else {

			System.out.println("Faild to Navigated OrangeHRM Application Title Not Matched :-Fail");

			LoginPageTitleResult.setCellValue("Fail");

		}

		System.out.println();

	}



	public void orangHRM_LoginValidation() throws IOException {

		int rowsCount = LoginTestDatasheet.getLastRowNum();

		for (int rowIndex = 1; rowIndex <= rowsCount; rowIndex++) {

			Row row = LoginTestDatasheet.getRow(rowIndex);



			if (!row.getCell(7).toString().isEmpty()) {

				Cell userNameCell = row.getCell(7);



				String userNameTextData = userNameCell.getStringCellValue();



				System.out.println(userNameTextData);



				Cell passwordCell = row.getCell(8);



				String passwordTestData = passwordCell.getStringCellValue();



				System.out.println(passwordTestData);



				// To send Found user name and password to their Respective fields



				By userNameProperty = By.id("txtUsername");



				WebElement userName = driver.findElement(userNameProperty);



				userName.clear();



				userName.sendKeys(userNameTextData);



				By passwordProperty = By.name("txtPassword");



				WebElement password = driver.findElement(passwordProperty);



				password.clear();



				password.sendKeys(passwordTestData);



				// Finding the Element to Click on Login

				By logInButtonProperty = By.className("button");



				WebElement logIn = driver.findElement(logInButtonProperty);



				logIn.click();



				try {



					By welcomeAdminProperty = By.linkText("Welcome Admin");



					WebElement welcomeAdmin = driver.findElement(welcomeAdminProperty);

					String actualwelcomeAdminText = welcomeAdmin.getText();

					// Verifying the home page of OrangeHrm

					Row row1 = LoginTestDatasheet.getRow(1);

					String expectedwelcomeAdminText = row1.getCell(9).getStringCellValue();

					row1.createCell(10).setCellValue(actualwelcomeAdminText);

					Cell homePageTestResult = row.createCell(11);

					if (actualwelcomeAdminText.contains(expectedwelcomeAdminText)) {

						System.out.println("Successfully Navigated to orangeHrm Home Page:-Pass");

						homePageTestResult.setCellValue("Pass");

					}



					if (welcomeAdmin.isDisplayed()) {



						// Verify of home page of OrangeHrm



						welcomeAdmin.click();



						Thread.sleep(1000);



						By logOutProperty = By.linkText("Logout");



						WebElement logOut = driver.findElement(logOutProperty);



						logOut.click();



					}



				} catch (Exception e) {

					Row row1 = LoginTestDatasheet.getRow(1);

					By invalidCredentialsProperty = By.id("spanMessage");

					WebElement invalidCredentials = driver.findElement(invalidCredentialsProperty);

					String actualinvalidCredentials = invalidCredentials.getText();

					Cell homePageTestResult = row.createCell(11);



					String expecteddataOfLoginInvalid = row1.getCell(1).getStringCellValue();



					if (actualinvalidCredentials.equalsIgnoreCase(expecteddataOfLoginInvalid)) {

						System.out.println("Failed To login Because of invalid Credentials:-Fail");

						homePageTestResult.setCellValue("Fail");



					}

					



				}

				System.out.println();



			}



		}



		FileOutputStream testResultFile = new FileOutputStream("C:\\OrangeHRMApplication\\WebTesting\\src\\oHRM_ExcelFiles\\OrangeHRM_LogInTestResultFile.xlsx");

		workbook.write(testResultFile);



	}



	public static void main(String[] args) throws IOException {

		oHRM loginValidation = new oHRM();

		loginValidation.orangeHRMApplicationLaunch();

		loginValidation.orangeHrm_LoginPageValidation();

		loginValidation.orangHRM_LoginValidation();

		loginValidation.orangeHRMApplicationclose();



	}



}
