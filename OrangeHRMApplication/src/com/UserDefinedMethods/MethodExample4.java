package com.UserDefinedMethods;

public class MethodExample4 {
	
	public void subtraction()
	{
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var1-var2;
		
		System.out.println("The value of the Variable var3 after Subtraction Operation is:"+var3);
	}
	
	public static void main(String[] args) {
		
		MethodExample4 m4=new MethodExample4();
		m4.subtraction();
		
		MethodExample3 m3=new MethodExample3();
		m3.addition();
				
	}

}
