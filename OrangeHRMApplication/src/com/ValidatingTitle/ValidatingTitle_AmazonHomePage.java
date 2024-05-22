package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_AmazonHomePage {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
		ChromeDriver chromeBrowser = new ChromeDriver();

		chromeBrowser.get("http://amazon.in");

		String expected_amazonHomePageTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"; // should be
		System.out.println(" The Expected title of the Amazon Application Home Page is :- "+expected_amazonHomePageTitle);

		String actual_amazonHomePageTitle=chromeBrowser.getTitle();
		System.out.println(" The Actual title of the Amazon Application Home Page is :- "+actual_amazonHomePageTitle);

		if(actual_amazonHomePageTitle.equals(expected_amazonHomePageTitle))
		//if(actual_amazonHomePageTitle.equalsIgnoreCase(expected_amazonHomePageTitle))
		{
		System.out.println(" Title of the Amazon HomePage matched - PASS ");
		}
		else
		{
		System.out.println(" Title of the Amazon HomePage NOT matched - FAIL ");
		}

		chromeBrowser.quit();

		}


}
