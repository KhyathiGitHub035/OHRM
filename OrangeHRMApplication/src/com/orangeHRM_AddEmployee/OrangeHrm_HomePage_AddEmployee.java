package com.orangeHRM_AddEmployee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrm_HomePage_AddEmployee extends BaseTest
{
	String applictionURlAddress = ("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");

	String expectedFirstnameTestData;

	String expectedMiddleNameTestData;

	String expcetedLastNameTestData;

	String expectedEmployeeIdTestValue;



	public void orangeHRMLogin() throws InterruptedException {

		String userNameTestData = "KhyathiReddy";

		By userNameProperty = By.id("txtUsername");

		WebElement userName = driver.findElement(userNameProperty);

		userName.sendKeys(userNameTestData);


		String passwordTestData = "Khyathi@035";

		By passwordProperty = By.id("txtPassword");

		WebElement password = driver.findElement(passwordProperty);

		password.sendKeys(passwordTestData);


		By loginButtonProperty = By.className("button");

		WebElement loginButton = driver.findElement(loginButtonProperty);

		loginButton.click();

	}



	public void orangeHRM_HomePage_Validtion() {

		String expected_OrangeHRMApplicationHomePageText = "Admin";

		System.out.println(" The Expected TEXT of OrangeHRM Application Home Page is :- "+ expected_OrangeHRMApplicationHomePageText);



		By welComeAdminProperty = By.partialLinkText("Welcome");

		WebElement welComeAdmin = driver.findElement(welComeAdminProperty);

		String actual_welComeAdminText = welComeAdmin.getText();

		System.out.println(" The Actual Text of the OrangeHRM Application HomePage is :- " + actual_welComeAdminText);



		if (actual_welComeAdminText.contains(expected_OrangeHRMApplicationHomePageText)) {

			System.out.println("Succesully Naviagted to the orangeHrm Home Page:- PASS");

		} else {

			System.out.println("Failed to  Naviagt to the orangeHrm Home Page:- Fail");

		}



	}



	public void organgeHRM_AddEmployee() {

		By pimProperty = By.id("menu_pim_viewPimModule");

		WebElement pim = driver.findElement(pimProperty);



		Actions mouseHoverOperation = new Actions(driver);

		mouseHoverOperation.moveToElement(pim).build().perform();



		By addEmployeeProperty = By.id("menu_pim_addEmployee");

		WebElement addEmployee = driver.findElement(addEmployeeProperty);

		addEmployee.click();


		expectedFirstnameTestData = "khyathi";

		By expectedFirstNameProperty = By.id("firstName");

		WebElement expectedfirstName = driver.findElement(expectedFirstNameProperty);

		expectedfirstName.sendKeys(expectedFirstnameTestData);


		expectedMiddleNameTestData = "kalyan";

		By expectedMiddleNameProperty = By.id("middleName");

		WebElement expectedMiddleName = driver.findElement(expectedMiddleNameProperty);

		expectedMiddleName.sendKeys(expectedMiddleNameTestData);


		expcetedLastNameTestData = "keerthi";

		By expcetedLastNameProperty = By.id("lastName");

		WebElement expcetedLastName = driver.findElement(expcetedLastNameProperty);

		expcetedLastName.sendKeys(expcetedLastNameTestData);


		By expectedEmployeeIdProperty = By.id("employeeId");

		WebElement expectedEmployeeId = driver.findElement(expectedEmployeeIdProperty);

		expectedEmployeeIdTestValue = expectedEmployeeId.getAttribute("value");


		By saveButtonProperty = By.id("btnSave");

		WebElement saveButton = driver.findElement(saveButtonProperty);

		saveButton.click();



	}



	public void orangeHRM_AddEmployee_Validation() {

		By actualfirstNameProperty = By.id("personal_txtEmpFirstName");

		WebElement actualfirstName = driver.findElement(actualfirstNameProperty);

		String actualfirstnametext = actualfirstName.getAttribute("value");

		System.out.println("The Text of firstname is" + " " + actualfirstnametext);



		if (actualfirstnametext.equals(expectedFirstnameTestData)) {

			System.out.println("The Text of First is Matched:-Pass");

		} else {

			System.out.println("The Text of Middle is not  Matched:-Fail");

		}


		By actualmiddleNameProperty = By.id("personal_txtEmpMiddleName");

		WebElement actualmiddleName = driver.findElement(actualmiddleNameProperty);

		String actualmiddlenametext = actualmiddleName.getAttribute("Value");

		System.out.println("The Text of MiddleName  is" + " " + actualmiddlenametext);



		if (actualmiddlenametext.equals(expectedMiddleNameTestData)) {

			System.out.println("The Text of Middle is Matched:-Pass");

		} else {

			System.out.println("The Text of Middle is Not Matched:-Fail");

		}


		By actuallastNameProperty = By.id("personal_txtEmpLastName");

		WebElement actuallastName = driver.findElement(actuallastNameProperty);

		String actuallastnametext = actuallastName.getAttribute("Value");

		System.out.println("The Text of Lastname is" + " " + actuallastnametext);



		if (actuallastnametext.equals(expcetedLastNameTestData)) {

			System.out.println("The Text of Lastname is Matched:-Pass");

		} else {

			System.out.println("The Text of Lastname is not Mathced :-Fail");

		}


		By actualEmployeeidProperty = By.name("personal[txtEmployeeId]");

		WebElement actualEmployeeid = driver.findElement(actualEmployeeidProperty);

		String actualEmployeeidValue = actualEmployeeid.getAttribute("Value");

		System.out.println("The value of Employee is" + " " + actualEmployeeidValue);



		if (actualEmployeeidValue.equals(expectedEmployeeIdTestValue)) {

			System.out.println("The value of Employee id is Matched:-Pass");

		} else {

			System.out.println("The value of Employee id is Not Matched:-Fail");

		}

	}



	public void orangeHrm_Logout() throws InterruptedException {

		By welcomeAdminProperty = By.linkText("Welcome Admin");

		WebElement welcomeAdmin = driver.findElement(welcomeAdminProperty);

		welcomeAdmin.click();

		Thread.sleep(2000);

		By logOutProperty = By.linkText("Logout");

		WebElement logOut = driver.findElement(logOutProperty);

		logOut.click();

	}



	public static void main(String[] args) throws InterruptedException {

		OrangeHrm_HomePage_AddEmployee addEmployee = new OrangeHrm_HomePage_AddEmployee();

		addEmployee.orangeHRMApplicationLaunch();

		addEmployee.orangeHRMLogin();

		addEmployee.orangeHRM_HomePage_Validtion();

		addEmployee.organgeHRM_AddEmployee();

		addEmployee.orangeHRM_AddEmployee_Validation();

		addEmployee.orangeHrm_Logout();

		addEmployee.orangeHRMApplicationclose();



	}


}
