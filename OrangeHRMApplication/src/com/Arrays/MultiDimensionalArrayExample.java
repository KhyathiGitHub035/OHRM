package com.Arrays;

public class MultiDimensionalArrayExample {
	
	public static void main(String[] args) {

		String array1[][] = new String[2][2];

		array1[0][0] ="Vishnu";
		array1[0][1] ="Manual Testing";

		array1[1][0] ="Srini";
		array1[1][1] ="Automation";

		/*
		System.out.println(array1[1][0]);
		System.out.println(array1[0][1]);
		System.out.println(array1[1][1]);
		*/

		for(int rowIndex=0;rowIndex<2;rowIndex++) // To goto every Row
		{
		for(int rowOfCellIndex=0;rowOfCellIndex<2;rowOfCellIndex++) // goes to Every Row of its corresponding Cells
		{
		System.out.println(array1[rowIndex][rowOfCellIndex]);
		}
		}


		System.out.println();

		for(int rowIndex=0;rowIndex<2;rowIndex++) // To goto every Row
		{
		for(int rowOfCellIndex=0;rowOfCellIndex<2;rowOfCellIndex++) // // goes to Every Row of its corresponding Cells
		{
		System.out.print(array1[rowIndex][rowOfCellIndex]+"  ");
		}
		System.out.println();
		}

		}


}
