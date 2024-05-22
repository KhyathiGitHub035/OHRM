package com.GetTitle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_GetTitle_HomePage {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
		ChromeDriver chromeBrowser = new ChromeDriver();

		//System.setProperty("webdriver.gecko.driver", "./browserDriverFiles/geckodriver.exe");
		//FirefoxDriver chromeBrowser = new FirefoxDriver(); // Name of the Object can be anything


		chromeBrowser.get("http://amazon.in");

		String amazonHomePageTitle=chromeBrowser.getTitle();

		System.out.println(" The title of the Amazon Application Home Page is :- "+amazonHomePageTitle);

		chromeBrowser.quit();


		}


}
