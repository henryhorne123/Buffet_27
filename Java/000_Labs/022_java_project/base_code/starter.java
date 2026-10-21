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
		System.out.println("You have 100 dollars to wager on slots!");
		
		while(true){

			if(money1 <= 0){
			System.out.println("You are out of money");
			break;

		}

		System.out.println("Do you want to play the game [Y/y,Y/yes||N/n,N/no]");
		String cont = sc.nextLine();

	if(cont.equalsIgnoreCase("no") || (cont.equalsIgnoreCase("n"))) {
		System.out.println("you chose not to play");
		break;
   }
		if((cont.equalsIgnoreCase("yes")) || (cont.equalsIgnoreCase("y"))) {

			System.out.println("How much would you like to wager?");
		int wager = sc.nextInt();
		sc.nextLine();

		if(wager>money1){
			System.out.println("You don't have that much money left");
			break;
		}
		System.out.println("Spinning the slots");
		int slot1 = (int)(Math.random()*(10)+1);

		int slot2 = (int)(Math.random()*(10)+1);

		int slot3 = (int)(Math.random()*(10)+1);
		System.out.println(slot1);
		System.out.println(slot2);
		System.out.println(slot3);
		// money1 = (money1-wager);
		// System.out.println("");
		// System.out.println("Your new balance is "+money1);
		if((slot1==slot2) && (slot1==slot3)) {
			System.out.println("You hit the jackpot, your wager is tripled");
			wager = wager*3;
			money1 = money1 + wager;
		}

		else if((slot1==slot2) || (slot1==slot3) || (slot2==slot3)) {
			System.out.println("You got a match, your wager is doubles");
			wager = wager*2;
			money1 = money1 + wager;
		}
		
		else{
			money1 = (money1-wager);
	 		System.out.println("");
		}
		System.out.println("Your new balance is "+money1);
		}
	

	}
   

}
}
