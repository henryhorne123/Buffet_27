/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers to create a range");
		System.out.println("Please input the first integer: ");
		int number1 = sc.nextInt();
		System.out.println("Please input the second, larger integer: ");
		int number2 = sc.nextInt();
		System.out.println();

		System.out.println("Your range is "+number1+" to "+number2);
		System.out.println();
		System.out.println("Here are 5 numbers within that range");
		int random1 = (int)(Math.random()*(number2-number1)+number1);
		int random2 = (int)(Math.random()*(number2-number1)+number1);
		int random3 = (int)(Math.random()*(number2-number1)+number1);
		int random4 = (int)(Math.random()*(number2-number1)+number1);
		int random5 = (int)(Math.random()*(number2-number1)+number1);
		System.out.println(random1+", "+random2+", "+random3+", "+random4+", "+random5);
		

	}
}
