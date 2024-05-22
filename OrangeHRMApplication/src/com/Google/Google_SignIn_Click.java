package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn_Click {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		ChromeDriver chromeBrowser = new ChromeDriver();

		String applicationUrlAddress="http://google.com";

		chromeBrowser.get(applicationUrlAddress);

		/*

		a  aria-label="Sign in"
		 href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
		continue=https://www.google.com/&amp;ec=GAZAmgQ"
		 target="_top"><span >Sign in</span></a>


		  Locators
		  Selectors

		< - tag
		a - anchor Tag

		href -  attribute
		value - https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
		        continue=https://www.google.com/&amp;ec=GAZAmgQ



		 The Type of Element is a Link

		 locator  - linkText
		 selector - Sign in

		*/

		By signInButtonProperty=By.linkText("Sign in");
		WebElement signInButton=chromeBrowser.findElement(signInButtonProperty);

		signInButton.click();


		}


}
