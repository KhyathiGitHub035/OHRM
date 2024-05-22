package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

		driver.get(applicationUrlAddress);

		// Expected Title should be - OrangeHRM
		// Expected Url Address shold have - orangehrm-4.2.0.1

		// Verification & Validation of UserName

		/*
		<input name="txtUsername" id="txtUsername" type="text">


		Element Properties
		Element Properties always contains Attributes and its Corresponding values

		 < - tag
		 input - tag name

		name - attribute / Locator
		txtUsername - value / selector

		id - attribute / locator
		txtUsername - value / selctor

		type - attribute
		text - value
		*/

		// Identification of the Element will done based on the Locator and its corresponding selector
		// Locator and selector of the Element should be found from the properties of the element by inspecting the element

		// 1. driver.findElement(By.id("txtUsername")).sendKeys("srini");

		/* 2.
		WebElement userName=driver.findElement(By.id("txtUsername")); // WebElement is identified with the Property and assigned to a variable
		userName.sendKeys("Testing" ); // an operation is performed on the Identified WebElement
		*/

		/* 3.
		By userNameProperty=By.id("txtUsername"); // Property of an element assigned to a variable
		WebElement userName=driver.findElement(userNameProperty); // Identify the element in the Current WebPage
		userName.sendKeys("WebDriver"); // Operation on the Identified WebElement
		*/


		String userNameTestData="KhyathiReddy"; 
		 
		By userNameProperty=By.id("txtUsername"); 
		WebElement userName=driver.findElement(userNameProperty);
		userName.sendKeys(userNameTestData);
		// Operation on the Identified WebElement

		// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

		String passwordTestData="Khyathi@035";
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);

		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();

		// Validate the Home Page of OrangeHRM Application
		// Expected Title should be - OrangeHRM
		// Expected Url Address shold have - orangehrm-4.2.0.1


		// Automate WelCome Admin

		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

		By welComeAdminProperty=By.linkText("Welcome Admin");
		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);

		welComeAdmin.click();

		// Synchronization
		Thread.sleep(10000); // its a wait of Java Language


		// Automate LogOut

		// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

		By logOutProperty=By.linkText("Logout");
		WebElement logOut=driver.findElement(logOutProperty);
		logOut.click();


		// Validate the LogIn Page of OrangeHRM Application
		// Expected Title should be - OrangeHRM
		// Expected Url Address shold have - orangehrm-4.2.0.1


		// Close the Application


		}


}
