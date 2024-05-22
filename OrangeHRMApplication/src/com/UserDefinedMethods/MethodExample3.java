package com.UserDefinedMethods;

public class MethodExample3 {
	
	public void addition()
	{
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var1+var2;
		
		//System.out.println("Testing");
		
		System.out.println("The Value of the Variable var3 after Addition Operation is:"+var3);
	}
	public static void main(String[] args) {
		
		MethodExample3 m3=new MethodExample3();
		m3.addition();
		m3.addition();
	}

}
