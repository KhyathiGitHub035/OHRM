package com.Loops;

public class NestedForLoopExample {
	
	public static void main(String[] args) {

		System.out.println(" ######## Nested For Loop Example2 ################# ");
		System.out.println();

		for(int i=1;i<=3;i++) // Outer Loop
		{
		for(int j=1;j<=2;j++)// Inner Loop
		{
		System.out.println(" Testing ");
		}

		}

		System.out.println();
		System.out.println(" ######## Nested For Loop Example2 ################# ");
		System.out.println();


		for(int i=1;i<=3;i++) // Outer Loop
		{
		for(int j=1;j<=2;j++)// Inner Loop
		{
		System.out.println(i);
		}

		}

		System.out.println();
		System.out.println(" ######## Nested For Loop Example3 ################# ");
		System.out.println();


		for(int i=1;i<=3;i++) // Outer Loop
		{
		for(int j=1;j<=2;j++)// Inner Loop
		{
		System.out.println(j);
		}

		}


		System.out.println();
		System.out.println(" ######## Nested For Loop Example4 ################# ");
		System.out.println();


		for(int i=1;i<=3;i++) // Outer Loop
		{
		for(int j=1;j<=2;j++)// Inner Loop
		{
		System.out.println(i+j);
		}

		}


		System.out.println();
		System.out.println(" ######## Nested For Loop Example5 ################# ");
		System.out.println();


		for(int i=1;i<=3;i++) // Outer Loop
		{
		for(int j=1;j<=2;j++)// Inner Loop
		{
		System.out.println(" * ");
		}

		}

		System.out.println();
		System.out.println(" ######## Nested For Loop Example6 ################# ");
		System.out.println();


		for(int i=1;i<=3;i++) // Outer Loop
		{
		for(int j=1;j<=2;j++)// Inner Loop
		{
		System.out.println(" * ");
		}
		System.out.println();

		}

		System.out.println();
		System.out.println(" ######## Nested For Loop Example7 ################# ");
		System.out.println();


		for(int i=1;i<=3;i++) // Outer Loop
		{
		for(int j=1;j<=2;j++)// Inner Loop
		{
		System.out.print(" * ");
		}
		System.out.println();

		}

		System.out.println();
		System.out.println(" ######## Nested For Loop Example8 ################# ");
		System.out.println();

		for(int i=5;i>=0;i--)
		{
		for(int j=i;j>=0;j--)
		{
		System.out.print(j +"  ");      
		}
		System.out.println();
		}

		System.out.println();
		System.out.println(" ######## Nested For Loop Example9 ################# ");
		System.out.println();

		for(int i=5;i>=0;i--)
		{
		for(int j=i;j>0;j--)
		{
		System.out.print(j + i+" ");      
		}
		System.out.println();
		}

		System.out.println();
		System.out.println(" ######## Nested For Loop Example10 ################# ");
		System.out.println();

		for(int i=5;i>=1;i--)
		{
		for(int j=1;j<i;j++)
		{
		System.out.print(i +"  ");      
		}
		System.out.println();
		}

	}

}
