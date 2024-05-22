package com.Valuelabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingSoftwareDevelopment {

	WebDriver driver;
	String applicationUrlAddress="https://www.valuelabs.com/";

	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
	}
	public void applicationClose()
	{
		driver.close();
	}
	
	public void softwareDevelopment_Click()
	{
		// <a href="https://www.valuelabs.com/services/custom-software-development/">Software Development</a>
	    
		By softwareDevelomentProperty=By.linkText("Software Development");
		WebElement softwareDeveloment=driver.findElement(softwareDevelomentProperty);
		softwareDeveloment.click();

	}
	
	public static void main(String[] args) {
		
		TestingSoftwareDevelopment testingLink=new TestingSoftwareDevelopment();
		testingLink.applicationLaunch();
		testingLink.softwareDevelopment_Click();
		//testingLink.applicationClose();
	}
}
