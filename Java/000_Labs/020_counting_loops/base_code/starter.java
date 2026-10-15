/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = sc.nextLine();
		System.out.println("How many times would you like me to print your name?");
		int number = sc.nextInt();
		int x = 0;

		while(true){
			//  System.out.println(name);
			//  x = x + 1;
			if(x >= number){
				break;
			}
			System.out.println(name);
			 x = (x + 1);
		}
	}
}
