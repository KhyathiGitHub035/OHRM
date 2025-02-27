package radioButtonTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.OrangeHRMApplicationTesting.BaseTest;

public class RadioButtonTestingAssignment extends BaseTesting {

	public void GettingRadioButtons() throws InterruptedException {
		
		By	radioButtonsGroup1Property=By.name("group1");

		List<WebElement> radioButtonGroup1=driver.findElements(radioButtonsGroup1Property);

		int countOfRadioButtonsGroup1=radioButtonGroup1.size();

		By radioButtonGroup2Property=By.name("group2");

	    List< WebElement> radioButtonsGroup2=driver.findElements(radioButtonGroup2Property);

		radioButtonGroup1.addAll(radioButtonsGroup2);
		countOfRadioButtonsGroup1=radioButtonGroup1.size();

		System.out.println(countOfRadioButtonsGroup1);
	
		for(int group1RadioButtonsArrayIndexClick=0;group1RadioButtonsArrayIndexClick<countOfRadioButtonsGroup1;group1RadioButtonsArrayIndexClick++)

		{

		radioButtonGroup1.get(group1RadioButtonsArrayIndexClick).click();

		  Thread.sleep(5000);

		System.out.println("Checking Status Of Buttons When  "+radioButtonGroup1.get(group1RadioButtonsArrayIndexClick).getAttribute("value")+"is Clicked" );


		for(int group1RadionButtonsArrayIndexStatus=0;group1RadionButtonsArrayIndexStatus<countOfRadioButtonsGroup1;group1RadionButtonsArrayIndexStatus++)

		{
		String group1RadioButtonName=radioButtonGroup1.get(group1RadionButtonsArrayIndexStatus).getAttribute("value");

		System.out.print(group1RadioButtonName+" - ");

		group1RadioButtonName=radioButtonGroup1.get(group1RadionButtonsArrayIndexStatus).getAttribute("checked");

		System.out.println(group1RadioButtonName);

		}

		System.out.println();

		}

		}

		public static void main(String[] args) throws InterruptedException {

			RadioButtonTestingAssignment radioButtons=new RadioButtonTestingAssignment();

			radioButtons.applicationLaunch();

			radioButtons.GettingRadioButtons();

			radioButtons.applicationClose();

		}


	}

