package com.UserDefinedMethods;

public class MethodExample9 {
	
	//Global variables
	int var1=50;
	int var2=10;
	
	public void addition()//User-Defined Method Without Parameters/Arguments
	{
		
		//Local/Instance Variables
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var1+var2;
		System.out.println("The value of the Variable var3 after Addition Operation is:"+var3);
		
	}
	
	public void addition(int var1,int var2)//User-Defined Method with Parameters/Arguments
	{
		//The Method when called-should be provided with the values
		//This Method will not have any local declaration nor will take the value from the Global Declaration
		//The values stored be passed only when the Method is called to perform the Operation 
		
		int var3;
		var3=var1+var2;
		System.out.println("The value of the Variable var3 after Addition Operation is"+var3);
	}
	
	public void subtraction()
	{
		int var3;
		var3=var1-var2;
		
		//The Current User Defined Method doesn't have the declaration of variables
		//     var1 and var2(Local Variables)-these variables var1 and var2 will look
		//        for is there any variables of similar type declared outside of all the 
		//           Methods(Global declaration)-if it finds the similar variables then the 
		//              variables will take the values of Globally declared variables
		
		System.out.println("The value of the Variable var3 after Subtraction Operation is:"+var3);
	}
	
	public static void main(String[] args) {
		
		MethodExample9 m9=new MethodExample9();
		m9.addition();
		m9.subtraction();
		System.out.println();
		
		m9.addition(100, 70);
	}

}
