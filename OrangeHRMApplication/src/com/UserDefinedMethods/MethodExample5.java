package com.UserDefinedMethods;

public class MethodExample5 
{
	public void addition()
	{
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var1+var2;
		
		System.out.println("The value of the Variable var3 after Addition Operation is:"+var3);
	}
	
	private void subtraction()
	{
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var1-var2;
		
		System.out.println("The value of the Variable var3 after Subtraction Operation is:"+var3);
	}
	
	public static void main(String[] args) {
		
		MethodExample5 m5=new MethodExample5();
		m5.addition();
		m5.subtraction();//Private Methods can be Accessed in the Same Class for any number of times
		
	}
}
