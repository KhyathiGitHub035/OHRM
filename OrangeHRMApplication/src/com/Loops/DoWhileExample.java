package com.Loops;

public class DoWhileExample {
	
	public static void main(String[] args) {

		/*

		Syntax:-
		   
		    Initilization;
		   
		    do
		    {
		    statement / statements;
		    increment / decrement;
		   
		    }while(condition);
		 

		*/


		int var=6;

		do
		{

		System.out.println(var+" "+" Testing ");
		var++;
		}while(var<=9);

		System.out.println();
		System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ ");
		System.out.println();


		int var1=7;

		do
		{
		System.out.println(var1);
		var1=var1+2;
		}while(var1>=10);


		System.out.println();
		System.out.println(" The value of the variable var1 is :- "+var1);
		System.out.println();


		do
		{
		System.out.println(" WebDriver ");
		var1++;
		}while(var1<=6);


		System.out.println(" %%%%%%%%%%%%%%%%%%%%%% ");

		int var2=-5;

		do
		{
		System.out.println( " Selenium ");
		var2=var2-2;
		}while(var2>=-13);

		}


}
