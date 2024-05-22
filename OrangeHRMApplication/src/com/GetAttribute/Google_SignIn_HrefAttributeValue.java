package com.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_SignIn_HrefAttributeValue {
	
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "./browserDriverFiles/geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();


		String applicationUrlAddress="http://google.com";

		driver.get(applicationUrlAddress);

		/*

		<a class="gb_Da gb_nd gb_Pd gb_ne" aria-label="Sign in"
		href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ" target="_top">
		<span class="gb_Ld">Sign in</span></a>

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

		By signInProperty=By.linkText("Sign in");
		WebElement signIn=driver.findElement(signInProperty);

		// getting the attribute VALUE of "href" of Sign In WebElement

		String sigInHrefAttributeValue=signIn.getAttribute("href");
		System.out.println(" The SignIn WebElement Href attribute value is :- "+sigInHrefAttributeValue);

		String signInClassAttributeValue=signIn.getAttribute("class");
		System.out.println(" The SignIn WebElement Class attribute value is :- "+signInClassAttributeValue);

		// aria-label

		String signInAriaLabelAttributeValue=signIn.getAttribute("aria-label");
		System.out.println(" The SignIn WebElement signInAriaLabelAttributeValue attribute value is :- "+signInAriaLabelAttributeValue);

		System.out.println();

		// getting the Text of the Sign In WebElement
		String signInWebElementText=signIn.getText();
		System.out.println(" The Text of the WebELement SignIn is :-  "+signInWebElementText);

		// Performing Click operation on the WebElement SignIn
		signIn.click();

		driver.quit();


		}


}
