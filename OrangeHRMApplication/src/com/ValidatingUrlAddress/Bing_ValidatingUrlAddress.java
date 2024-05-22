package com.ValidatingUrlAddress;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_ValidatingUrlAddress {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
		ChromeDriver chromeBrowser = new ChromeDriver();

		// chromeBrowser.get("http://bing.com");

		// String applicationUrlAddress="http://bing.com";

		String applicationUrlAddress="http://bing.com";

		chromeBrowser.get(applicationUrlAddress);
		// Identifying the title of the WebPage

		String expected_BingHomePageTitle="Bing"; // Should be
		System.out.println(" The Expected Title of the Bing Home Page is :- "+expected_BingHomePageTitle);


		String actual_BingHomePageTitle=chromeBrowser.getTitle();
		System.out.println(" The Actual Title of the Bing Home Page is :- "+actual_BingHomePageTitle);

		if(actual_BingHomePageTitle.equals(expected_BingHomePageTitle))
		{
		System.out.println("The Bing Home page Title Matched - PASS ");
		}
		else
		{
		System.out.println("The Bing Home page Title NOT Matched - FAIL ");
		}

		// Get the Url Address of the WebPage

		System.out.println(" The User/TestEngineer Given Url address is :-  "+applicationUrlAddress);


		String expected_BingHomePageUrlAddress="bing.com"; // should have
		System.out.println(" The Expected Url Address of the Bing Home page is :- "+expected_BingHomePageUrlAddress);


		String actual_BingHomePageCurrentUrlAddress=chromeBrowser.getCurrentUrl();
		System.out.println(" The Actual Current Url Address of the Bing Home page after the application is launched is :- "+actual_BingHomePageCurrentUrlAddress);


		if(actual_BingHomePageCurrentUrlAddress.contains(expected_BingHomePageUrlAddress))
		{
		System.out.println(" Expected URL Address Found - PASS");
		}
		else
		{
		System.out.println(" Expected URL Address NOT Found - FAIL");
		}

		chromeBrowser.quit();



		}


}
