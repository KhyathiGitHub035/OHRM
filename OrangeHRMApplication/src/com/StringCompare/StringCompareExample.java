package com.StringCompare;

public class StringCompareExample {
	
	public static void main(String[] args) {

		String var1="LiveTech";
		String var2="LiveTech";

		//System.out.println(var1);
		//System.out.println(var2);


		if(var1.equals(var2))
		{
		System.out.println(" var1 variable value is EQUAL to var2 variable value ");
		}
		else
		{
		System.out.println(" var1 variable value is NOT EQUAL to var2 variable value");
		}


		System.out.println();

		String var3="LiveTech";
		String var4="LiveTech";

		if(var3.equals(var4))
		{
		System.out.println(" var3 variable value is EQUAL to var4 variable value ");
		}
		else
		{
		System.out.println(" var3 variable value is NOT EQUAL to var4 variable value");
		}

		System.out.println();

		String var5="LiveTech";
		String var6="LiveTech ";

		if(var5.equals(var6))
		{
		System.out.println(" var5 variable value is EQUAL to var6 variable value ");
		}
		else
		{
		System.out.println(" var5 variable value is NOT EQUAL to var6 variable value");
		}


		System.out.println();

		// * Equals method checks the Strings values for the Exact match case of the Alphabets
		//   Upper Case and Lower case of the characters of the String should be Similar

		String var7="LiveTech";
		String var8="Livetech";

		if(var7.equals(var8))
		{
		System.out.println(" var7 variable value is EQUAL to var8 variable value ");
		}
		else
		{
		System.out.println(" var7 variable value is NOT EQUAL to var8 variable value");
		}


		System.out.println();

		String var9="LiveTech";
		String var10="Livetech";

		if(var10.equalsIgnoreCase(var9))
		{
		System.out.println(" var9 variable value is EQUAL to var10 variable value ");
		}
		else
		{
		System.out.println(" var9 variable value is NOT EQUAL to var10 variable value");
		}

		System.out.println();

		String var11="LiveTech";
		String var12="Live tech";

		if(var12.equalsIgnoreCase(var11))
		{
		System.out.println(" var11 variable value is EQUAL to var12 variable value ");
		}
		else
		{
		System.out.println(" var11 variable value is NOT EQUAL to var12 variable value");
		}

		System.out.println();


		String var13="LiveTech";
		String var14="livetech";

		if(var13.equalsIgnoreCase(var14))
		{
		System.out.println(" var13 variable value is EQUAL to var14 variable value ");
		}
		else
		{
		System.out.println(" var13 variable value is NOT EQUAL to var14 variable value");
		}

		System.out.println();

		String var15="LiveTech";
		String var16="Tech";

		if(var15.contains(var16)) // checking for an existence of ONE String in an another String
		{
		System.out.println(" var15 variable value is Existing in var16 variable value ");
		}
		else
		{
		System.out.println(" var15 variable value is NOT Existing in to var16 variable value");
		}


		System.out.println();

		String var17="Testing";

		// System.out.println(var17);
		var17.length();

		System.out.println(var17.length());

		int var17Length=var17.length();
		System.out.println(" The length of the variable var17Length is :- "+var17Length);

		System.out.println();

		String var18="LiveTech";
		String var19="LivetechTesting";

		int var18Length=var18.length();
		int var19Length=var19.length();

		if(var18Length>var19Length)
		{
		System.out.println(" var18 variable value has Less number of characters than var19 variable value ");
		}
		else
		{
		System.out.println(" var19 variable value has More number of characters than var18 variable value ");
		}


		}


}
