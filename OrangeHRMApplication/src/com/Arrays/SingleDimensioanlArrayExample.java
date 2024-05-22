package com.Arrays;

public class SingleDimensioanlArrayExample {

	public static void main(String[] args) {

		/*
		int array1;

		array1=10;
		// System.out.println(array1);

		array1=20;
		System.out.println(array1);

		* Variable is capable of storing only one value at a time
		*

		*/

		// * The need is to stored both 10 and 20 into one single location - is possible only with arrays


		int array1[] = new int[5];

		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 'A'; // ASCII value will be stored into the array1 of 3rd index
		array1[4] = 100;
		/*
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		*/

		for(int arrayIndex=0;arrayIndex<=4;arrayIndex++)
		{
		System.out.println(array1[arrayIndex]);
		}


		}

}
