package com.Loops;

public class WhileExample {
	
	public static void main(String[] args) {

		/*

		Syntax:

		initilization;

		while(condition)
		{
		   // TRUE block
		    Statement / Statements;
		    Increment / Decrement;


		*/


		int var=2;

		while(var<=5)
		{
		// TRUE Block
		System.out.println(var+" - "+" LiveTech ");

		var++;
		}

		System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$$$ ");

		var=6;

		while(var<=9)
		{
		System.out.println(" Selenium ");

		var=var+2;
		}

		System.out.println(" The current variable var value is :- "+var );

		System.out.println(" ########################### ");

		while(var<=15)
		{
		System.out.println(var+" - "+" Testing ");
		var=var+3;
		}

		System.out.println(" &&&&&&&&&&&&&&&&&&&&&&&&&&&& ");

		int var1=3;

		while(var1>=-2)
		{
		System.out.println(var1+" "+" WebDriver ");
		var1--;
		}

		System.out.println();
		System.out.println(" The value of the variable var1 is :-"+var1);

		while(var1>=-9)
		{
		System.out.println(" TestNG ");

		var1=var1-2;
		}

		}


}
