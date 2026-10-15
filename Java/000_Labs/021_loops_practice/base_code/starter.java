/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int random1 = (int)(Math.random()*(1000-1)+1);
		while(true){
			System.out.println("Guess a number 1-1000");
			int guess1 = sc.nextInt();
			if(guess1==random1){
				System.out.println("You got it");
				break;

				
			}
			// System.out.println("Guess a number 1-1000");
			// int guess1 = sc.nextInt();

			if(guess1 > random1){
				System.out.println("Nope the number is lower");
			}
			else if (guess1 < random1){
				System.out.println("Nope the number is higher");
			}
			else{
				System.out.println("You got it");
			}

		}



		
	}
}
