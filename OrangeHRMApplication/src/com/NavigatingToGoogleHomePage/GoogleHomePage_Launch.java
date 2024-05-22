package com.NavigatingToGoogleHomePage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleHomePage_Launch {
	
	public static void main(String[] args) {

		// Automating a Browser(Chrome)
		                        //webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");

		 ChromeDriver chromeBrowser = new ChromeDriver();

		// Automating FireFox Browser
		//System.setProperty("webdriver.gecko.driver", "./browserDriverFiles/geckodriver.exe");
		//FirefoxDriver chromeBrowser = new FirefoxDriver(); // Name of the Object can be anything

		// navigating to Google Application Home Page

		chromeBrowser.get("http://google.com"); // the Object(chromeBrowser) always points to the current Browser

		//chromeBrowser.navigate().to("http://livetech.in");

		chromeBrowser.navigate().to("http://bing.com");

		// chromeBrowser.close(); // Will close the Browser if it has only single TAB opened
		chromeBrowser.quit(); // Will close the Browser along with all the Multiple Tab's opened
		// quit() method can be used to close a Browser with Single Tab opened of Multiple tab's opened

		}


}
