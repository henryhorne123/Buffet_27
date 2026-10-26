/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("Please input a width");
		int width = sc.nextInt();
		System.out.println("Please input a height");
		int height = sc.nextInt();

		

	while(y<height){
		System.out.println("");
		y++;
	
		while(x<width){
			System.out.print("*");
			x++;
	
		}
		x = 0;


	}
	System.out.println("");

		System.out.println("Please input an integer");
		int num1 = sc.nextInt();
		x=0;
		y=0;
		String star = new String("*");

	while(y<num1){
		System.out.println("");
		y++;
	
		while(x<1){
	
			System.out.print(star);
			star = (star + "*");
			x++;
	
		}
		x = 0;


	}

		System.out.println("Please input another integer");
		int num2 = sc.nextInt();
		x=0;
		y = 0;
		int i = 0;
		String star1 = new String("*");

		while (y <= num2) {
            int j = 1;

			 while (i <= num2-1) {
                System.out.println("");
                i++;
           }
		
            while (j <= num2) {
                System.out.print("*");
                j++;
            }

			 while (i <= y) {
                System.out.println("");
                i++;
            }
            

            System.out.println(" ");
            y++;
        }
        
        System.out.println();

	// while(y<num2-1){
	// 	System.out.println("");
	// 	y++;
	
	// 	while(x<num2){
	// 		System.out.print("");
	// 		x++;
	// }
	// x = 0;
	// 	while(x<num2){
	// 		System.out.print(star1);
	// 		star1 = (star + "*");
	// 	}
		
		
	// 	x = 0;


	
	// }
	}
}
