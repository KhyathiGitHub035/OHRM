package com.OHRMApplicationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	 WebDriver driver;

		String applictionURlAddress = ("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");

		

		@BeforeTest
		public void orangeHRMApplicationLaunch()

		{

			System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.get(applictionURlAddress);

			driver.manage().window().maximize();

		

		}

		

		@AfterTest
		public void orangeHRMApplicationclose()

		{

			driver.close();

		}



}
