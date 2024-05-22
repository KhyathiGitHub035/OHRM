package com.UserDefinedMethods;

public class MethodExample7 {
	
	protected void multiplication()
	{
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var1*var2;
		
		System.out.println("The value of the Variable var3 after Multiplicatiob Operation is:"+var3);
	}
	
	public static void main(String[] args) {
		
		MethodExample7 m7=new MethodExample7();
		m7.multiplication();
	}

}
