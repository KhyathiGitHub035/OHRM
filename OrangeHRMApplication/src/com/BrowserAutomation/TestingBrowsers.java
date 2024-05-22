package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingBrowsers {
	
	public static void main(String[] args)
	{
	// Automating Chrome Browser
	System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");

	// PM         PA
	ChromeDriver chrome = new ChromeDriver();

	// Class      object


	// Automating Edge Browser
	System.setProperty("webdriver.edge.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\msedgedriver.exe");
	EdgeDriver edge = new EdgeDriver();

	// Automating FireFox Browser
	//System.setProperty("webdriver.gecko.driver", "./browserDriverFiles/geckodriver.exe");
	//FirefoxDriver firefox = new FirefoxDriver();


	}


}
