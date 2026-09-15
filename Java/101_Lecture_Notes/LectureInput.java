/*
    Lecture note example - Input!!
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String menuHeading1 = new String("Welcome to the restaurant.");
        String menuHeading2 = new String("Menu:");
        String menu1 = new String("1. Riley Kokot - $");
        double itemCost1 = (10.00);
        String menu2 = new String("2. Henry Horne - $");
        double itemCost2 = (102.11);
        String menu3 = new String("3. Goh Yoshisomethingelse - $");
        double itemCost3 = (2381.81);
        String name1 = new String("Whats the name for your order?");
        

        System.out.println(menuHeading2);
        System.out.println(menu1+cost1);
        System.out.println(menu2+cost2);
        System.out.println(menu3+cost3);
        System.out.println();
        System.out.println(name1);
        
        String name1Answer = sc.nextLine();

        System.out.println();

        System.out.println("How many Riley Kokot's");
        double item1Number = sc.nextDouble();
        
        System.out.println("How many Goh Yoshisomethingelse's");
        double item3Number = sc.nextLine();

        System.out.println("How many Henry Horne's");
        double item2Number = sc.nextLine();
        
        double item1TotalCost = (item1Number*itemCost1);  
        double item2TotalCost = (item2Number*itemCost2);
        double item3TotalCost = (item3Number*itemCost3);

        System.out.println("Total:");
        System.out.println(item1TotalCost);
        System.out.println(item2TotalCost);
        System.out.println(item3TotalCost);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        










	}
}
