/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please input the first number: ");
		int number1 = sc.nextInt();

		System.out.print("Please input the second number: ");
		int number2 = sc.nextInt();
		
		boolean equal =  number1 == number2;
		boolean different = number1 != number2;

		if(number1 == number2){
			System.out.println("Your numbers are equal");
		}

		if(number1 != number2){
			System.out.println("Your numbers are different");
		}
		




		



	}
}
