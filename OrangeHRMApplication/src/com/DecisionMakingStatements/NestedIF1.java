package com.DecisionMakingStatements;

public class NestedIF1 {
	
	public static void main(String[] args)
	{

	/*

	if(condition)  // Outer condition
	{
	   // TRUE Block
	     // statement / statements
	     
	     // Immediately followed my another Condition
	     
	       if(condition) // Inner Condition
	       {
	          // TRUE Block
	           // statement / statements
	        }
	}        

	*/


	int var1=60;
	int var2=30;
	int var3=60;

	if(var1>var2) // Outer if Block
	{
	System.out.println(" Testing ");

	if(var2<var3) // Inner If Block
	{
	System.out.println(" LiveTech ");
	}

	}

}

}
