/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Do you want to be a wizard, warrior, or rogue?");
		String class = sc.nextLine();

		if(playerclass.equals("Wizard") || playerclass.equals("wizard") ){
			System.out.println("You picked wizard");
		}

		else if(playerclass.equals("warrior") || playerclass.equals("Warrior")){
			System.out.println("You picked warrior");
		}

		else if(playerclass.equals("rogue") || playerclass.equals("Rogue")){
			System.out.println("You picked rogue");
		}

		else{
			System.out.println("You didn't pick any. You suck.");
		}


	}

}

