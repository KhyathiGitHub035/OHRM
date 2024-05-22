package com.DecisionMakingStatements;

public class IfElseExample {
	
	public static void main(String[] args) {



		/*


		if..else - Syntax

		if(condition)
		{
		This is a TRUE Block
		     if at all the condition is true - this current true block statement/statements will get executed
		}
		else
		{
		     This is a FALSE Block
		     if at all the given condition is false then the program immediately shifts from the
		         Condition to the "else block"
		         
		     This block can also a single statement or Group of statements    
		         
		}

		* if at all the given condition is not True then the program will immediately shift to the
		      end of the "}" of the True Block

		*/


		int var1=50;
		int var2=60;

		if(var1>var2)
		{

		// TRUE Block

		System.out.println(" The value of the variable var1 is greater than the value of the variable var2 ");


		}
		else
		{
		// False Block
		System.out.println(" The value of the variable var1 is less than the value of the variable var2 ");
		System.out.println("The value of the variable var2 is greater than the value of the variable var1  ");

		}
		}


}
