/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int number = sc.nextInt();
		System.out.println("Here are the next 5 numbers:");
		System.out.println(number+1);
		System.out.println(number+2);
		System.out.println(number+3);
		System.out.println(number+4);
		System.out.println(number+5);


		
		System.out.println("Here are the next 5 multiples:");
		System.out.println(number*1);
		System.out.println(number*2);
		System.out.println(number*3);
		System.out.println(number*4);
		System.out.println(number*5);

		System.out.println("Here is the number divided by 100:");
		System.out.println(number/100);

		
		System.out.println("Here is the number divided by 10:");
		System.out.println(number/10);
		

	}
}
