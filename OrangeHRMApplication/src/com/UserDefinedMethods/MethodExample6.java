package com.UserDefinedMethods;

public class MethodExample6 {

	public static void main(String[] args) {
		
		MethodExample5 m5=new MethodExample5();
		m5.addition();
		
		/*
		Private Methods cannot be accessed in any Other class-may be belonging to the same
	   
	    Package or Class belonging to other different classes
	    
	    m5.s-not possible of calling the Method Subtraction-its a Private Method
	  */
	}

}
