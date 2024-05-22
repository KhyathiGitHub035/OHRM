package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingYourLists {
	
	WebDriver driver;
	String applicationUrlAddress="www.amazon.in";


	public void applicationLaunch()
	{

	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);
	}


	public void applicationClose()
	{
	driver.close();
	}

	public void wishList_Click()
	{
		//<span class="nav-text">Your Wish List</span>
	By wishListProperty=By.className("nav-text");
	WebElement wishList=driver.findElement(wishListProperty);
	wishList.click();

	}

	public static void main(String[] args) {

		TestingYourLists testingLink = new TestingYourLists();

	testingLink.applicationLaunch();
	testingLink.wishList_Click();
	}



}
