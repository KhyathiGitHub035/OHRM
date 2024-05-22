package com.MouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ValueLabs_Services_MouseHoverOperation {
	
	WebDriver driver;
	String applicationUrlAddress="https://www.valuelabs.com/";
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(applicationUrlAddress);
        driver.manage().window().maximize();//maximize the Browser
	}
	
	public void applicationClose()
	{
		driver.close();
	}
	
	public void mouseHoverOperation_Services()
	{
		
		// <a class="nav-link dropdown-toggle" href="#" data-bs-toggle="static"> Services  </a>
		By servicesProperty=By.linkText("Services");
		WebElement services=driver.findElement(servicesProperty);
		
		//Creating an Object for the Actions class to work with Mouse Operation
		
		Actions mouseHoverOperation=new Actions(driver);
		mouseHoverOperation.moveToElement(services).build().perform();
	}
	
	
	public static void main(String[] args) {
		
		ValueLabs_Services_MouseHoverOperation mouseOperation=new ValueLabs_Services_MouseHoverOperation();
		
		mouseOperation.applicationLaunch();
		mouseOperation.mouseHoverOperation_Services();
		//Actions class Object will now perform an Operation to move to an WebElement on the Current Build-to moveTo a WebElement Services
	    mouseOperation.applicationClose();
	
	}

}
