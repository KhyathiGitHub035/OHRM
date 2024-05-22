package com.UserDefinedMethods;

public class MethodExample10 {
	
	public void addition()//Method without Parameters and the Variables are assigned with hardCoded
	{
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var1+var2;
		System.out.println("The value of the Variable var3 after Addition Operation is"+var3);
	}
	
	public void addition(int var1,int var2)//Method with Parameters
	{
		int var3;
		var3=var1+var2;
		System.out.println("The value of the Variable var3 after Addition Operation is:"+var3);
	}
	
	//Method OverLoading:
	//If a class has multiple Methods with same name but different in parameters,it is known as Method OverLoading
	
	public void addition(int var1,int var2,int var3)
	{
		var3=var1+var2+var3;
		System.out.println("The value of the variable var3 after Addition Operation is:"+var3);
	}
	
	public void addition(int var1,int var2,double var3)
	{
		double var4;
		var4=var1+var2+var3;
		System.out.println("The value of the Variable var4 after Addition Operation is:"+var4);
	
		var3=var1+var2+var3;
		System.out.println("The value of the Variable var3 after Addition Operation is:"+var3);
	}
	
     public void addition(int var1,double var2,float var3)
     {
	    double var4;
	     var4=var1+var2+var3;
	     System.out.println("The value of the Variable var4 after Addition Operation of Different DataType values is:"+var4);
	     }

      public static void main(String[] args) {
		
    	  MethodExample10 m10=new MethodExample10();
    	  System.out.println();
    	  m10.addition(20, 50.222, 30.333f);
	}


}
