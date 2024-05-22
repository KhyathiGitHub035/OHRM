package com.DecisionMakingStatements;

public class SwitchExample {
	
	public static void main(String[] args) {


		/*
		Initilization

		switch(Expression)
		{
		 case 1:
		    statement / statements ;
		    break; - its a keyword which terminates the Program Execution

		case 2:
		    statement / statements ;
		    break;

		-----
		-----
		-----
		-----

		default;
		statement / statements;

		}
		*/


		int weekDay=8;

		switch(weekDay)
		{

		case 1:
		System.out.println(" MonDay ");
		break;

		// its a KeyWord - which immediately Terminates the Program Execution right away
		       //     and will not look at the Rest of the statements of the Program

		case 2:
		System.out.println(" TuesDay ");
		break;

		case 3:
		System.out.println(" WednesDay ");
		System.out.println(" Its a smater way of checking for a particular Match Case ");
		break;

		case 4:
		System.out.println(" ThursDay ");
		break;

		case 5:
		System.out.println(" FriDay ");
		break;

		case 6:
		System.out.println(" SaturDay ");
		break;

		case 7:
		System.out.println(" SunDay ");
		break;

		default:
		System.out.println(" Expression NOT matching with any of the given Cases ");


		}


		}


}
