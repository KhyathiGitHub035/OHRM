package com.VariableExample;

public class VariableEx {
	public static void main(String[] args) {

		byte byteVariable=15;

		byteVariable=60;

		// JavaPrimitiveType Description JavaDataRange
//		    byte             8 bits     -128 to 127


		/*
		System.out.print(" The value of the variable byteVariable is : ");
		System.out.println(byteVariable);
		*/


//		      OR

		// + - concatination ( which is used to combine the Statements )
		System.out.println(" The value of the variable byteVariable is : " + "byteVariable" );
		System.out.println(); // will just leave an empty space in the console
		System.out.print(" The value of the variable byteVariable is : " + byteVariable );


		// a value should be assigned to a variable
		// a variable name can be any name of our choice
		// a variable should be assigned with a value
		// a variable name should be defined with a dataType
		// a variable is a temp memory location
		// a variable once declared with a dataType , if at all the same variable name is used again
//		       in the same program for another time then it need not be declared with a dataType
		//  a variable is capable of storing/saving a single value at a time

		// variable must and should be declared with a dataType -- not mandatory to assign the value

		System.out.println();

		// short byteVariable=85;  // * variable names should be always be unique name

		System.out.println(byteVariable);


		short shortVariable=75;
		System.out.println(" The value of the Variable shortVariable is :- "+ shortVariable);
		System.out.println();

		// JavaPrimitiveType Description JavaDataRange
//		    short              16 bits -32768 to 32767

		int intVariable=50;
		System.out.println(" The value of the Variable intVariable is :- "+ intVariable);
		System.out.println();

		// JavaPrimitiveType Description       JavaDataRange
		// int                 32 bits     -2147483648 to 2147483647


		long longVariable=90;
		System.out.println(" The value of the Variable longVariable is :- "+ longVariable);
		System.out.println();


		// JavaPrimitiveType Description       JavaDataRange
//		     long 64 bits     -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

		float floatVariable1=65;
		System.out.println(" The value of the Variable floatVariable1 is :- "+ floatVariable1);
		System.out.println();


		float floatVariable2=65.12f;
		System.out.println(" The value of the Variable floatVariable2 is :- "+ floatVariable2);
		System.out.println();


		float floatVariable3=65.1234256789f;
		System.out.println(" The value of the Variable floatVariable3 is :- "+ floatVariable3);
		System.out.println();

		// it will give 5digits after the decimal point

		double doubeVariable1=65.123456789;
		System.out.println(" The value of the Variable doubeVariable1 is :- "+ doubeVariable1);
		System.out.println();

		double doubeVariable2=65.123456789123456789;
		System.out.println(" The value of the Variable doubeVariable2 is :- "+ doubeVariable2);
		System.out.println();

		// it will give 14digits after the decimal point

		double ASCIIVariable='a'; // it give a numeric number of the Alphabet
		System.out.println(" The value of the Variable ASCIIVariable is :- "+ ASCIIVariable);
		System.out.println();



		char charVariable='a';
		System.out.println(" The value of the Variable charVariable is :- "+ charVariable);
		System.out.println();

		boolean booleanbVariable=true;
		booleanbVariable=false;
		System.out.println(" The value of the Variable booleanbVariable is :- "+ booleanbVariable);
		System.out.println();

		String stringVariable="Selenium";
		System.out.println(" The value of the Variable stringVariable is :- "+ stringVariable);
		System.out.println();


		String stringTextVaibale=" Testing Web Application ";
		System.out.println(" The value of the Variable stringTextVaibale is :- "+ stringTextVaibale);
		System.out.println();

		System.out.println(stringTextVaibale);

		}


}
