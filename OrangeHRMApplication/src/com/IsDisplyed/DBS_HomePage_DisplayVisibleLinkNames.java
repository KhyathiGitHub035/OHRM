package com.IsDisplyed;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DBS_HomePage_DisplayVisibleLinkNames {
	
	WebDriver driver;
	String applicationUrlAddress="https://www.dbs.com/in/index/default.page#wm";
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);


	}
	
	public void applicationClose()
	{
		driver.close();
	}
	
	public void dbs_HomePage_displayLinkNames()
	{
		By linksProperty=By.tagName("a");
		List<WebElement>homePageLinks=driver.findElements(linksProperty);
		
		System.out.println("The Number of links on the DBS Bank Home Page is:"+linksProperty);
		for(int arrayIndex=0;arrayIndex<homePageLinks.size();arrayIndex++)
		{
			if(homePageLinks.get(arrayIndex).isDisplayed())
			{
				String homePageLinksName=homePageLinks.get(arrayIndex).getText();
				System.out.println(homePageLinksName);
			}
			
		}
	}
	public static void main(String[] args)
	{
      DBS_HomePage_DisplayVisibleLinkNames homepage=new DBS_HomePage_DisplayVisibleLinkNames();
      
      homepage.applicationLaunch();
      homepage.dbs_HomePage_displayLinkNames();
      homepage.applicationClose();

	}

}
