/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Random;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money1 = 100;
		System.out.println("Do you want to play the game");
		String cont = sc.nextLine();

		if((cont.equalsIgnoreCase("yes")) || (cont.equalsIgnoreCase("y"))) {
		while(true){
			if(money1 == 0){
			System.out.println("You are out of money");
			break;

		}
		
		System.out.println("How much would you like to wager?");
		int wager = sc.nextInt();
		System.out.println("Spinning the slots");
		int slot1 = (int)(Math.random()*(11)+1);

		int slot2 = (int)(Math.random()*(11)+1);

		int slot3 = (int)(Math.random()*(11)+1);
		System.out.println(slot1);
		System.out.println(slot2);
		System.out.println(slot3);
		// money1 = (money1-wager);
		// System.out.println("");
		// System.out.println("Your new balance is "+money1);
		if((slot1==slot2) && (slot1==slot3)) {
			System.out.println("You hit the jackpot, your wager is tripled");
			money1 = money1*3;
		}

		else if((slot1==slot2) || (slot1==slot3) || (slot2==slot3)) {
			System.out.println("You got a match, your wager is doubles");
			money1 = money1*2;
		}
		
		    money1 = (money1-wager);
	 		System.out.println("");
	 		System.out.println("Your new balance is "+money1);

	}
   }


   if(cont.equalsIgnoreCase("no") || (cont.equalsIgnoreCase("n"))) {
	System.out.println("you chose not to play");
   }
}
}
