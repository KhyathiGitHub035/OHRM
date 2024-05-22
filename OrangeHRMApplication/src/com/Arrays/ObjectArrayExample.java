package com.Arrays;

public class ObjectArrayExample {

	public static void main(String[] args) {

		// dataType arrayName[] = new dataType[size]

		// Syntax

		// Object arrayName[] = new Object[size]
		// Object arrayName[][] = new Object[size][size]

		Object array1[] = new Object[4]; // The Size of the Array is Fixed
		//if an array is created as of Type "Object" - then it will be capable of storing any dataType values

		array1[0]=10;
		array1[1]='A';
		array1[2]="Testing";
		array1[3]= 23.123;

		/*
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		*/

		for(int arrayIndex=0;arrayIndex<=3;arrayIndex++)
		{
		System.out.println(array1[arrayIndex]);
		}

	}
}
