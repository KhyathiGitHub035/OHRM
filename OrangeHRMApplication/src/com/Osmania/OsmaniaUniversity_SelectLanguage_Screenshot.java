package com.Osmania;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class OsmaniaUniversity_SelectLanguage_Screenshot extends BaseTest{
	
	public void dropDownTesting() throws InterruptedException, IOException
	{
		
		// Select Languages Drop Down Property
	    //  id="gtranslate_selector"

		By selectLanguagesProperty=By.id("gtranslate_selector");
		WebElement selectLanguagesDropDown=driver.findElement(selectLanguagesProperty);
	    
		// finding the number of Optional Values in the DropDown

		// <option value="en|hi">Hindi</option>
		// <option value="en|fr">French</option>
		// <option value="en|nl">Dutch</option>
		
		By languagesProperty=By.tagName("option");
		List<WebElement>selectLanguages=selectLanguagesDropDown.findElements(languagesProperty);
		
		int selectLanguagesCount=selectLanguages.size();
		System.out.println("The Number of Languages in the Select Language DropDown are:"+selectLanguagesCount);
	
		for(int arrayIndex=0;arrayIndex<selectLanguagesCount;arrayIndex++)
		{
			String language=selectLanguages.get(arrayIndex).getText();
		    //System.out.println(language);
			
			
			selectLanguages.get(arrayIndex).click();
			
			Thread.sleep(5000);
			
			File languageScreenShots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(languageScreenShots, new File("./ApplicationScreenShots/OsmaniaUniversity.png"+language));
		
			System.out.println(language);
		
		}
	}
		

	public static void main(String[] args) throws InterruptedException, IOException {

		OsmaniaUniversity_SelectLanguage_Screenshot languages = new OsmaniaUniversity_SelectLanguage_Screenshot();
		languages.applicationLaunch();
		languages.dropDownTesting();
		

	}
	}

