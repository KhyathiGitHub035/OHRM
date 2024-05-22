package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		   /*
		   
		    Syntax:-
		   
		    List<dataType>ArrayListName = new ArrayList<>();
		       
		    */

		List<Object>arrayList1 = new ArrayList<>();

		// arrayList1[] = 10;

		arrayList1.add(100);
		arrayList1.add("WebDriver");
		arrayList1.add('B');
		arrayList1.add(10.12345);
		arrayList1.add("Hello102");


		/*
		System.out.println(arrayList1.get(0));
		System.out.println(arrayList1.get(1));
		System.out.println(arrayList1.get(2));
		System.out.println(arrayList1.get(3));
		System.out.println(arrayList1.get(4));
		*/


		// for(int arrayIndex=0;arrayIndex<=6;arrayIndex++)
		for(int arrayIndex=0;arrayIndex<arrayList1.size();arrayIndex++)
		{
		System.out.println(arrayList1.get(arrayIndex));
		}

		System.out.println();
		System.out.println(" *********** For Each loop ********");
		System.out.println();

		/*
		Syntax: - for each loop
		for(dataType arrayIndex: arrayName)
		{
		   statement / statements;
		}

		*/

		for(Object arrayIndex: arrayList1)
		{
		System.out.println(arrayIndex);
		}
		}
}
