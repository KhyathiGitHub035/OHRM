package com.RadioButtonsTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestingRadioButtons extends BaseTest {
	
	public void radioButtons() throws InterruptedException
	{

	By group1RadioButtonsProperty=By.name("group1");
	List<WebElement>group1RadioButtons=driver.findElements(group1RadioButtonsProperty);

	int group1RadioButtonsSize=group1RadioButtons.size();

	System.out.println("Number of radio buttons in group1 is:"+group1RadioButtons.size());
	
	By group2RadioButtonsProperty=By.name("group2");
	List<WebElement>group2RadioButtons=driver.findElements(group2RadioButtonsProperty);

	int group2RadioButtonsSize=group2RadioButtons.size();

	System.out.println("Number of radio buttons in group2 is:"+group2RadioButtons.size());
	
	
	for(int radiobuttons2arrayIndexClick=0;radiobuttons2arrayIndexClick<group1RadioButtonsSize;radiobuttons2arrayIndexClick++)
	{
		group2RadioButtons.get(radiobuttons2arrayIndexClick).click();
		Thread.sleep(5000);
		for(int group2radioButtonsArrayIndexStatus=0;group2radioButtonsArrayIndexStatus<group1RadioButtonsSize;group2radioButtonsArrayIndexStatus++)
		{
			String group2radioButtonName=group2RadioButtons.get(group2radioButtonsArrayIndexStatus).getAttribute("value");
			System.out.println(group2radioButtonName+"-");
			
			group2radioButtonName=group1RadioButtons.get(group2radioButtonsArrayIndexStatus).getAttribute("checked");
			System.out.println(group2radioButtonName);
		}
		System.out.println();
	}
		
	}

	public static void main(String[] args) throws InterruptedException
	{

	TestingRadioButtons radio = new TestingRadioButtons();
	radio.applicationLaunch();
	radio.radioButtons();
	radio.applicationClose();
	
	}


}
