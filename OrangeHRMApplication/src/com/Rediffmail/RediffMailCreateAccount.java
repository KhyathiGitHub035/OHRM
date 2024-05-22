package com.Rediffmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RediffMailCreateAccount extends BaseTest
{
	@Test
	public void createAccount()
	{
		//<u>Create a new account</u>
		//<a href="//register.rediff.com/register/register.php?FormName=user_details" 
		//title="Create new Rediffmail account"><u>Create a new account</u></a>
		
		 By createAccountProperty=By.xpath("//a[@title=\'Create new Rediffmail account\']");
	
		 WebElement createAccount=driver.findElement(createAccountProperty);
	
		 createAccount.click();
		 
		 
		 //<input type="text" onblur="fieldTrack(this);" name="name01bc4df3" value="" style="width:185px;" maxlength="61">
		 
		By firstNameProperty=By.name("name01bc4df3");
	    WebElement	firstName=driver.findElement(firstNameProperty);
	    firstName.sendKeys("Khyathi Reddy");
	
	}

}
