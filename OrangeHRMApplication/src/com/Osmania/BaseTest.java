package com.Osmania;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	String applicationUrlAddress="https://www.osmania.ac.in/";

	public void applicationLaunch()
	{

	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
	
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

	}


	public void applicationClose()
	{
	driver.close();
	}

}
