package com.orangeHRM_AddEmployee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	 WebDriver driver;

		String applictionURlAddress = ("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");

		

		public void orangeHRMApplicationLaunch()

		{

			System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.get(applictionURlAddress);

			driver.manage().window().maximize();

		

		}

		

		public void orangeHRMApplicationclose()

		{

			driver.close();

		}

}
