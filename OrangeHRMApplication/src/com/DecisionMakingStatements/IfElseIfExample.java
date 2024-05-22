package com.DecisionMakingStatements;

public class IfElseIfExample {

	public static void main(String[] args) {
					/*

			if(condition)
			{
			  // True Block
			  // statement / statements
			   }
			   else
			        if(condition)
			           {
			                 // True Block
			            // statement / statements
			       }
			       else
			          {
			             // false Block
			             // statement / statements
			           }
			   

			*/

			          int var1=90;
			          int var2=100;
			          int var3=180;
			         
			          if(var1>var2 && var1>var3)
			          {
			          System.out.println(" The value of the variable var1 is greater than the value of the variables var2 and var3  ");
			          }
			          else
			          if(var2>var3)
			          {
			System.out.println(" The value of the variable var2 is greater than the value of the variables var1 and var3 ");
			          }
			          else
			          {
			          System.out.println("The value of the variable var3 is greater than the value of the variables var1 and var2");
			          }
			         
		

		
		
		

	}

}
