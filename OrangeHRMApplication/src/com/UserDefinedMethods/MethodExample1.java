package com.UserDefinedMethods;

public class MethodExample1 {
	
	//User-Defined methods are created for RE-Usability purpose
	
	// User-Defined method-a method which is developed by the Programmers/Test Engineers
	
	public void srini()
	{
		System.out.println("This is a Srini User Defined Method");
	}
	
	//Pre-Defined Method
	public static void main(String[] args) {
		
		
		System.out.println("This is the Main Method of the JAVA Language");
		
		MethodExample1 m1=new MethodExample1();//Creating an Object for the Current Class
		System.out.println();
		
		m1.srini();//Using the Current Class-calling the User Defined Method to perform an Operation
		
		m1.srini();
		m1.srini();
	}

}
