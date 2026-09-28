/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please input the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Please input the second number: ");
		int num2 = sc.nextInt();
		System.out.print("Please input the third number: ");
		int num3 = sc.nextInt();

		if((num1 > num2) && (num1 > num3)){
			System.out.println("Largest number is "+num1);
		}
		if((num2 > num1) && (num2 > num3)){
			System.out.println("Largest number is "+num2);
		}
		if((num3 > num1) && (num3 > num2)){
			System.out.println("Largest number is "+num3);
		}


		if((num1 < num2) && (num1 < num3)){
			System.out.println("Smallest number is "+num1);
		}
		if((num2 < num1) && (num2 < num3)){
			System.out.println("Smallest number is "+num2);
		}
		if((num3 < num1) && (num3 < num2)){
			System.out.println("Smallest number is "+num3);
		}

	}
}
