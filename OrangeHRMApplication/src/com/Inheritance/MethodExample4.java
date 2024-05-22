package com.Inheritance;

public class MethodExample4 {
	
	public void subtraction()
	{
	int var1=20;
	int var2=30;
	int var3;

	var3=var1-var2;

	System.out.println(" The value of the Variable var3 after Subtraction Operation is :- "+var3);
	}


	public void addition(int var1,int var2)
	{

	int var3;

	var3=var1+var2;

	System.out.println(" The value of the Variable var3 after Addition Operation is :- "+var3);
	}
	
	private void multiplication()
	{
	int var1=20;
	int var2=30;
	int var3;

	var3=var1*var2;

	System.out.println(" The value of the Variable var3 after Multiplication Operation is :- "+var3);
	}
	
	public static void main(String[] args) {
		
		MethodExample4 m4=new MethodExample4();
		m4.multiplication();
	}

	

	}



	
	


