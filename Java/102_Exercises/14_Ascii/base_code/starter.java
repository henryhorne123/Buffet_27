/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Museum.");
		System.out.println("Which exhibit would you like to visit?");
		System.out.println("1. Sports");
		System.out.println("2. Foods");
		System.out.println("3. People");
		String choiceOne = sc.nextLine();
		//Choice One
		if(choiceOne.equals("Sports") || choiceOne.equals("sports")){
			System.out.println("Which piece from People would you like to view?");
			System.out.println("1. Giants");
			System.out.println("2. 49ers");
			String selection1 = sc.nextLine();
			// Selection one
			if(selection1.equals("Giants") || selection1.equals("giants")){
				System.out.println("        ____");
				System.out.println("      .'    '.");
				System.out.println("     /'-....-'|");
				System.out.println("     |        |");
				System.out.println("     \\.-''''-./");
				System.out.println("	  '.____.'");
			}
			// Selection two
			if(selection1.equals("49ers") || selection1.equals("49ers.")){
				System.out.println("$$49$$");
			}
		
		}
		//Choice tres
		else if(choiceOne.equals("Foods") || choiceOne.equals("foods")){
			System.out.println("Which piece from Words would you like to view?");
			System.out.println("1. Sandwich ");
			System.out.println("2. Noodle");
			String selection1 = sc.nextLine();
			//Selection one
			if(selection1.equals("Sandwich") || selection1.equals("sandwich")){
				System.out.println("  ,--./,-.");
 				System.out.println(" / #      \\");
				System.out.println("|          |");
				System.out.println(" \\        / ");
 				System.out.println("  `._,._,'");
			}
			// Selection two
			else if(selection1.equals("Noodle") || selection1.equals("noodle")){
				System.out.println("||");
				System.out.println("||");
				System.out.println("||");		
				System.out.println("||");
				System.out.println("||");
				System.out.println("||");
				System.out.println("||");
				System.out.println("||");
				System.out.println("||");
				System.out.println("||");
				System.out.println("||");
				System.out.println("||");
				System.out.println("||");
				System.out.println("||");
				System.out.println("||");
				System.out.println("||");
				
			}
		
		}

		//Choice three
		else if(choiceOne.equals("People") || choiceOne.equals("people")){
			System.out.println("Which piece from People would you like to view?");
			System.out.println("1. Kokot");
			System.out.println("2. Sadman");
			String selection1 = sc.nextLine();
			//Selection one
			if(selection1.equals("Kokot") || selection1.equals("kokot")){
				System.out.println("..");
				System.out.println(" _");
			}
			// Selection two
			if(selection1.equals("Sadman") || selection1.equals("sadman")){
				System.out.println(":{");
			}
		
		}

		else{
			System.out.println("Thank you for visiting. Get out of my museum");
			
		}
		
	}
}
