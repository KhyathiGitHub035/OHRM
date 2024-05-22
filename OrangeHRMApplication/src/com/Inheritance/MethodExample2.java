package com.Inheritance;

public class MethodExample2 extends MethodExample1 {
	//Extends- java uses extends KeyWord to work with Inheritance
	//Acquiring the properties of one class into another class is called inheritance
	
	public void subtraction()
	{
		int var1=20;
		int var2=30;
		int var3;
		var3=var1-var2;
		
		System.out.println("The value of the variable var3 after Subtraction Operation is:"+var3);
	}
	
	public void addition(int var1,int var2)
	{
		int var3;
		var3=var1+var2;
		System.out.println("The value of the Variable var3 after Addition Operation is:"+var3);
		
	}
	private void multiplication()
	{
		int var1=20;
		int var2=30;
		int var3;
		var3=var1*var2;
		System.out.println("The value of the Variable var3 after Multiplication Operation is:"+var3);
	}

	
	public static void main(String[] args) {
		
		System.out.println("***********Subtraction Method of MethodExample2********");
		MethodExample2 m2=new MethodExample2();
		m2.subtraction();
		System.out.println("***********Addition Method of MethodExample1********");
	    m2.addition();
	    System.out.println("***********Multiplication Method of MethodExample2********");
	    m2.multiplication();
	    System.out.println("***********Addition Method of MethodExample2********");
	    m2.addition(22, 20);
	
	
	}
}
