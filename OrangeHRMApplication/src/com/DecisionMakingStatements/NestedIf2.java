package com.DecisionMakingStatements;

public class NestedIf2 {

	public static void main(String[] args) {

		int var1=10;
		int var2=30;
		int var3=60;

		if(var1>var2) // Outer if Block
		{
		System.out.println(" Testing ");

		if(var2>var3) // Inner If Block
		{
		System.out.println(" LiveTech ");
		}

		System.out.println(" Selenium ");

		}

		System.out.println(" WebDriver "); // This statement is part of Main Method and not of the condition


		}

}
