/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String playername = sc.nextLine();
		System.out.println("What is your title?");
		String playertitle = sc.nextLine();
		System.out.println("Do you want to be a wizard, warrior, or rogue?");
		String playerclass = sc.nextLine();

		if(playerclass.equals("Wizard") || playerclass.equals("wizard") ){
			System.out.println("You picked wizard");
		}
		else if(playerclass.equals("warrior") || playerclass.equals("Warrior")){
			System.out.println("You picked warrior");
		}
		else if(playerclass.equals("rogue") || playerclass.equals("Rogue")){
			System.out.println("You picked rogue");
		}
		else{
			System.out.println("You didn't pick any. You suck.");
		}
		System.out.println("");
		
		System.out.println("Now pick your skills.");
		System.out.println("You have 20 points to spend total on 4 skills. 10 points max per skill.");
		System.out.println("");
		//Str start
		System.out.println("Strength: 1-10");
		int pstr = sc.nextInt();
		if(pstr>10){
			System.out.println("You can only do ten points, try again");
			System.out.println("Strength: 1-10");
			pstr = sc.nextInt();
		}
		//points left start if > 20
		int pntlft = (20-pstr);
		if(pntlft<0){
		System.out.println("You ran out of points");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("You are "+playername+", your title is "+playertitle);
		System.out.println("You are a "+playerclass+" with the following stats:");
		System.out.println("Strength: "+pstr);
		System.out.println("Dexterity: "+0);
		System.out.println("Intelligence: "+0);
		System.out.println("Charisma: "+0);
		}
		System.out.println("You have "+pntlft+" points left");
		System.out.println("");

		//dex start
		System.out.println("Dexterity: 1-10");
		int pdex = sc.nextInt();
		if(pdex>10){
			System.out.println("You can only do ten points, try again");
			System.out.println("Dexterity: 1-10");
			pdex = sc.nextInt();
		}
		if(pntlft<0){
		System.out.println("You ran out of points");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("You are "+playername+", your title is "+playertitle);
		System.out.println("You are a "+playerclass+" with the following stats:");
		System.out.println("Strength: "+pstr);
		System.out.println("Dexterity: "+pdex);
		System.out.println("Intelligence: "+0);
		System.out.println("Charisma: "+0);
		}

		pntlft = (pntlft-pdex);
		System.out.println("You have "+pntlft+" points left");
		System.out.println("");
		//int start
		System.out.println("Intellignece: 1-10");
		int pint = sc.nextInt();
		if(pint>10){
			System.out.println("You can only do ten points, try again");
			System.out.println("Intellignece: 1-10");
			pint = sc.nextInt();
		}
		pntlft = (pntlft-pint);
		if(pntlft<0){
		System.out.println("You ran out of points");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("You are "+playername+", your title is "+playertitle);
		System.out.println("You are a "+playerclass+" with the following stats:");
		System.out.println("Strength: "+pstr);
		System.out.println("Dexterity: "+pdex);
		System.out.println("Intelligence: "+pint);
		System.out.println("Charisma: "+0);
		}
		System.out.println("You have "+pntlft+" points left");
		System.out.println("");
		//char start
		System.out.println("Charmisma: 1-10");
		int pchar = sc.nextInt();
		if(pchar>10){
			System.out.println("You can only do ten points, try again");
			System.out.println("Charmisma: 1-10");
			pchar = sc.nextInt();
		}
		if(pntlft<0){
		System.out.println("You ran out of points");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("You are "+playername+", your title is "+playertitle);
		System.out.println("You are a "+playerclass+" with the following stats:");
		System.out.println("Strength: "+pstr);
		System.out.println("Dexterity: "+pdex);
		System.out.println("Intelligence: "+pint);
		System.out.println("Charisma: "+pchar);
		}
		System.out.println("");
		// int totalPoints = (pstr+pchar+pint+pdex);
		// if(totalPoints>20){
		// 	System.out.println("You went over the 20 points.");
		// 	int totalDebt = ((pchar+pstr+pint+pdex)-totalPoints);
		// 	int pay = (totalDebt/4);
		// 	pstr = pstr-pay;
		// 	pdex = pdex-pay;
		// 	pint = pint-pay;
		// 	pchar = pchar-pay;

		// 	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// 	System.out.println("You are "+playername+", your title is "+playertitle);
		// 	System.out.println("You are a "+playerclass+" with the following stats:");
		// 	System.out.println("Strength: "+(pstr-pay));
		// 	System.out.println("Dexterity: "+(pdex-pay));
		// 	System.out.println("Intelligence: "+(pint-pay));
		// 	System.out.println("Charisma: "+(pchar-pay));
			
		// }

		
		else{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("You are "+playername+", your title is "+playertitle);
		System.out.println("You are a "+playerclass+" with the following stats:");
		System.out.println("Strength: "+pstr);
		System.out.println("Dexterity: "+pdex);
		System.out.println("Intelligence: "+pint);
		System.out.println("Charisma: "+pchar);
		}


	}
}
