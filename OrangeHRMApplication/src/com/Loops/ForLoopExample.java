package com.Loops;

public class ForLoopExample {
	
	public static void main(String[] args) {

		/*
		System.out.println(" Selenium ");
		System.out.println(" Selenium ");
		System.out.println(" Selenium ");
		System.out.println(" Selenium ");
		*/

		/*
		for(int a=1;a<2;) // this will take us to Infinite loop - because the given condition is always TRUE
		{
		// TRUE Block

		System.out.println(" Selenium ");
		}
		*/


		System.out.println(" Testing the for loop 1st Time");
		for(int a=1;a<2;a++)
		{
		// TRUE Block

		System.out.println(" Selenium ");
		}

		System.out.println();

		System.out.println(" Testing the for loop 2nd Time");

		for(int a=1;a<=2;a++)
		{
		// TRUE Block

		System.out.println(" Selenium ");
		}

		System.out.println();
		System.out.println(" Testing the for loop 3nd Time");



		for(int i=0;i<6;i++)
		{
		/*
		System.out.println(" Selenium WebDriver ");
		System.out.println(i+1);
		*/

		System.out.println(" Selenium WebDriver " + " i+1 "); // outPut -  Selenium WebDriver  i+1

		// System.out.println(" Selenium WebDriver " + i+1); // OutPut - Selenium WebDriver 01

		// System.out.println(" Selenium WebDriver " + (i+1)); //  Selenium WebDriver 1

		// System.out.println(" Selenium WebDriver " + i++);
		// OutPut
		// Selenium WebDriver 0
		//Selenium WebDriver 2
		// Selenium WebDriver 4



		}



		System.out.println();
		System.out.println(" Testing the for loop 4th Time");

		for(int a=1;a<=2;a++)
		{
		// TRUE Block

		System.out.println(" Selenium ");
		}

		System.out.println();

		for(int a=1;a<=2;a=a+1)
		{
		// TRUE Block

		System.out.println(" Selenium ");
		}

		System.out.println();
		System.out.println(" Testing the for loop 5th Time");

		for(int a=1;a<=2;a=a+1)
		{
		// TRUE Block

		System.out.println(a+ " Selenium ");
		}

		System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$$$ ");



		for(int i=0;i<6;i=i+1)
		{

		System.out.println(" Selenium WebDriver " + i++);


		}



		/*
		  i=0; 0<6- true = selenium WebDriver -- i=i+1 -->i=0+1 = 1



		*/
		System.out.println();
		System.out.println(" ########################## ");
		System.out.println();
		for(int hi=5;hi<=9;hi=hi+2)
		{
		System.out.println(hi+" Testing ");
		}


		System.out.println(" %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% ");

		for(int p=0;p<=3;p++)
		{
		System.out.println(" LiveTech ");
		}

		System.out.println();
		for(int p=0;p>=-3;p--)
		{
		System.out.println(p+" & "+" LiveTech ");
		}

		System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");

		//for(int i=1;i<=3;i=1+i)
		for(int i=1;i<=3;i=i+1)
		{
		System.out.println(i);
		//System.out.println(" Ameerpet ");
		//System.out.println(i);
		}


		}

}


