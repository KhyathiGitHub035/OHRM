package com.Rediffmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
	
	WebDriver driver;
	String applicationUrlAddress="https://mail.rediff.com/cgi-bin/login.cgi";


	@BeforeTest
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
				
	}
	
	/*@AfterTest
	public void applicationClose()
	{
		driver.close();
	}
*/
}
