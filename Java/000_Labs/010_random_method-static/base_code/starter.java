/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int random1 = (int)(Math.random()*10);
		int random2 = (int)(Math.random()*(100-1)+1);
		double random3 = Math.random()+2.5;
		double random4 = Math.random()*(589-14)+14;
		
		System.out.println("Random number between 0 and 9: "+random1);
		System.out.println("Random number between 1 and 100: "+random2);
		System.out.println("Random number between 2.5 and 3.5: "+random3);
		System.out.println("Random number between 14 and 589: "+random4);


	}
}
