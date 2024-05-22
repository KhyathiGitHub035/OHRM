package com.UserDefinedMethods;

public class MethodExample8 {
	
	protected void division()
	{
		int var1=20;
		int var2=5;
		int var3;
		
		var3=var1/var2;
		
		System.out.println("The value of the Variable var3 after Division Operation is:"+var3);
	}
	
	public static void main(String[] args) {
		
		MethodExample8 m8=new MethodExample8();
		m8.division();
		
		MethodExample7 m7=new MethodExample7();
		m7.multiplication();
	}

}
