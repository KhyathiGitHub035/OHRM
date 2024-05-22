package com.OrangeHRMApplicationWebPagesTest;

import java.io.IOException;
import org.testng.annotations.Test;

import com.OrangeHRMApplicationWebPages.LogInPage;

public class LogInPageTest extends LogInPage

{

	@Test(priority=1,description="Validating OrangeHRM Application LogIn Page LogIn Panel Text")
	public void orangeHRMApplication_LogInPage_LogInPanelValidationTest()
	{
		LogInPageTest loginpage=new LogInPageTest();
		loginpage.orangeHRMApplication_LogInPage_LogInPanelValidation();
	}
	
	
	@Test(priority=2,description="Validating OrangeHRM Application LogIn Page Logo")
	public void orangeHRMApplication_LogInPageLogoValidationTest()
	{
		LogInPageTest loginpage=new LogInPageTest();
		loginpage.orangeHRMApplication_LogInPageLogoValidation();
	}
	

	@Test(priority=3,description="Validating OrangeHRM Application LogIn Test")
	public void logInValidationTest() throws IOException
	{
		LogInPageTest loginpage=new LogInPageTest();
	    loginpage.logInValidationTest();	
	}
	
}
