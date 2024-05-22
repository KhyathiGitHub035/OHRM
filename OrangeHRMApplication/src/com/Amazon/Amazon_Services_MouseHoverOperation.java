package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Services_MouseHoverOperation {
	
	WebDriver driver;
	String applicationUrlAddress="https://amazon.in";


	public void applicationLaunch()
	{

	System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
	
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize(); 
	}


	public void applicationClose()
	{
	driver.close();
	}


	public void mouseHoverOperation_wishList()
	{

	//<span id="nav-link-accountList-nav-line-1" class="nav-line-1 nav-progressive-content">Hello, sign in</span>
		By hello_SignInProperty=By.id("nav-link-accountList-nav-line-1");
	    WebElement hello_SignIn=driver.findElement(hello_SignInProperty);

	
	    Actions mouseHoverOperation = new Actions(driver);
	    mouseHoverOperation.moveToElement(hello_SignIn).build().perform();

	}

	public static void main(String[] args) {

		Amazon_Services_MouseHoverOperation mouseOperation = new Amazon_Services_MouseHoverOperation();
		
	   mouseOperation.applicationLaunch();
	   mouseOperation.mouseHoverOperation_wishList(); 
	   mouseOperation.applicationClose();
	}


}
