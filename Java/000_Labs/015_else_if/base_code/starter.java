/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int randnum = (int)(Math.random()*1000);

		System.out.print("Please guess a number 0 through 1000: ");
		int guess = sc.nextInt();

		if(guess > randnum){
			System.out.println("The number is lower");
		}

		else if(guess < randnum){
			System.out.println("The number is higher");
		}

		else {
			System.out.println("Correct!");
		}

		System.out.println("The number was: "+randnum);
	}
}
