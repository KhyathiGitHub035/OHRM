package com.GetUrl;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_GetUrlAddress {
	
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
		ChromeDriver chromeBrowser = new ChromeDriver();

		// chromeBrowser.get("http://bing.com");

		// String applicationUrlAddress="http://bing.com";

		String applicationUrlAddress="http://bing.com";

		chromeBrowser.get(applicationUrlAddress);
		// Identifying the title of the WebPage

		String bingHomePageTitle=chromeBrowser.getTitle();
		System.out.println(" The Title of the Bing Home Page is :- "+bingHomePageTitle);

		// Get the Url Address of the WebPage

		System.out.println(" The User/TestEngineer Given Url address is :-  "+applicationUrlAddress);

		String bingHomePageCurrentUrlAddress=chromeBrowser.getCurrentUrl();
		System.out.println(" The Current Url Address of the Bing Home page after the application is launched is :- "+bingHomePageCurrentUrlAddress);

		chromeBrowser.quit();



	}

}
