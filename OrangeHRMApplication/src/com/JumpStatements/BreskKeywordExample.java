package com.JumpStatements;

public class BreskKeywordExample {
	
	public static void main(String[] args) {

		for(int i=1;i<=5;i++)
		{
		if(i==3)
		{
		System.out.println(i+" "+" LiveTech ");
		break; // break keyword immediately terminates the program execution right away
		      // * though the for loop can iterate for another 2 times - but still the
		      //     program will immediately stops its execution when the given is satisfied
		}
		System.out.println(i+" "+" WebDriver ");
		}

		}




}
