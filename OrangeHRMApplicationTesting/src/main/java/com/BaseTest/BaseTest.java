package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Utility.Log;

public class BaseTest {
	
	 public static WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

	@BeforeMethod
	public void orangeHRMApplicationLaunch()
	{

	System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplicationTesting\\browserDriverFiles\\chromedriver.exe");
	
    driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	Log.info(" ************ OrangeHRM Application Launched Successfully ************");

	}


	@AfterMethod
	public  void orangeHRMApplicationClose()
	{
	driver.close();

	Log.info(" **************** OrangeHRM Application Closed Successfully *********");
	}

}
