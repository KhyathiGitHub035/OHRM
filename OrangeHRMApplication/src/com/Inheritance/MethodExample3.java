package com.Inheritance;

public class MethodExample3 extends MethodExample2 {
	
	protected void division()
	{
		int var1=20;
		int var2=5;
		int var3;
		
		var3=var1/var2;
		
		System.out.println("The value of the variable var3 after Division Operation is:"+var3);
	}

	public static void main(String[]args)
	{
		System.out.println("***********Division Method of MethodExample3********");
		MethodExample3 m3=new MethodExample3();
		m3.division();
		
		System.out.println();
		System.out.println("***********Subtraction Method of MethodExample2********");
		m3.subtraction();
		
		System.out.println();
		System.out.println("***********Subtraction Method of MethodExample2********");
		//m3.mu
		//Multiplication method cannot be accessed in the current class through entended is because it is a private method
	
	     System.out.println();
	     System.out.println("**********Addition Method with Parameters of MethodExample2********");
	      m3.addition(20, 60);
	      
	      System.out.println();
	      
	      System.out.println("**********Addition Method with Parameters of MethodExample1********");
	      m3.addition();
	      
	
	}
}
