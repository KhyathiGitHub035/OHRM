package com.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBLock_LinksTesting_CapturingScreenShots {
	
	WebDriver driver;
	
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\OrangeHRMApplication\\OrangeHRMApplication\\browserDriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
	}
	
	public void applicationClose()
	{
		driver.quit();
	}
	
	public void capturingScreenShots() throws IOException
	{
		By tsrtcHomePageHeaderBlockProperty=By.className("menu-wrap");
		WebElement tsrtcHomePageHeaderBlock=driver.findElement(tsrtcHomePageHeaderBlockProperty);
	 
		//Header Block Element Common Property is a-tag
		By tsrtcHomePageHeaderBlockLinksProperty=By.tagName("a");
		// going the the Header Block and identifying the elements of the Header Block
		List<WebElement>tsrtcHomePageHeaderBlockLinks=tsrtcHomePageHeaderBlock.findElements(tsrtcHomePageHeaderBlockLinksProperty);
	   
		int tsrtcHeaderBlockLinksCount=tsrtcHomePageHeaderBlockLinks.size();
		System.out.println(tsrtcHeaderBlockLinksCount);
		
		//Displaying Names of the Header Block
		for(int arrayIndex=0;arrayIndex<tsrtcHeaderBlockLinksCount;arrayIndex++)
		{
			String tsrtcHomePageHeaderBlockLinksName=tsrtcHomePageHeaderBlockLinks.get(arrayIndex).getText();
		    System.out.println(arrayIndex+"-"+tsrtcHomePageHeaderBlockLinksName);
		
		    String expected_LinkUrlAddress=tsrtcHomePageHeaderBlockLinks.get(arrayIndex).getAttribute("href");
		    System.out.println("The Expected link Url Address is:"+expected_LinkUrlAddress);
		
		    tsrtcHomePageHeaderBlockLinks.get(arrayIndex).click();
		    
		    String actual_WebPageTitle=driver.getTitle();
		    System.out.println("The Title of the Navigated WebPage is:"+actual_WebPageTitle);
		
		    String actual_WebPageCurrentUrlAddress=driver.getCurrentUrl();
		    System.out.println(" The Current Url Address of the Navigated WebPage is:-  "+actual_WebPageCurrentUrlAddress);

		    if(actual_WebPageCurrentUrlAddress.equals(expected_LinkUrlAddress))
		    {
		    System.out.println(" Successfully Navigated to The Links Related Url Address WebPage - PASS");
		    }
		    else
		    {
		    System.out.println(" Failed to Navigate to The Links Related Url Address WebPage - FAIL");
		    }

		    File linkScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(linkScreenShot, new File("./ApplicationScreenShots/"+tsrtcHomePageHeaderBlockLinksName+".png"));


		      driver.navigate().back();

		      tsrtcHomePageHeaderBlockProperty=By.className("menu-wrap");
		    tsrtcHomePageHeaderBlock=driver.findElement(tsrtcHomePageHeaderBlockProperty);

		    tsrtcHomePageHeaderBlockLinksProperty=By.tagName("a");
		    // going the the Header Block and identifying the elements of the Header Block
		    tsrtcHomePageHeaderBlockLinks=tsrtcHomePageHeaderBlock.findElements(tsrtcHomePageHeaderBlockLinksProperty);

		    System.out.println();
		    }

		    }
		    public static void main(String[] args ) throws IOException{

		    TSRTC_HeaderBLock_LinksTesting_CapturingScreenShots screenShot = new TSRTC_HeaderBLock_LinksTesting_CapturingScreenShots();
		    screenShot.applicationLaunch();
		    screenShot.capturingScreenShots();
		    screenShot.applicationClose();


		    }
	

}
