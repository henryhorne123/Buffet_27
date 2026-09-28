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
		
		boolean bool2 =  number1 == number2;
		boolean different = number1 != number2;

		if(bool2 == true){
			System.out.println("Your numbers are equal");
		}

		if(bool2 == false){
			System.out.println("Your numbers are different");
		}
		




		



	}
}
