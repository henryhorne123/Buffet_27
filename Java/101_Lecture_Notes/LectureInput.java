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
        System.out.println(menu1+itemCost1);
        System.out.println(menu2+itemCost2);
        System.out.println(menu3+itemCost3);
        System.out.println();
        System.out.println(name1);
        
        String name1Answer = sc.nextLine();

        System.out.println();

        System.out.println("How many Riley Kokot's");
        int item1Number = sc.nextInt();
        
        System.out.println("How many Goh Yoshisomethingelse's");
        int item3Number = sc.nextInt();

        System.out.println("How many Henry Horne's");
        int item2Number = sc.nextInt();
        
    
        double item1TotalCost = (item1Number*itemCost1);  
        double item2TotalCost = (item2Number*itemCost2);
        double item3TotalCost = (item3Number*itemCost3);

        System.out.println("Total:");
        System.out.println(item1TotalCost);
        System.out.println(item2TotalCost);
        System.out.println(item3TotalCost);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        double subTotal = (item1TotalCost+item2TotalCost+item3TotalCost);
        System.out.println("Sub Total:"+subTotal);

        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("What percent would you like to tip?");
        int tip = sc.nextInt();
        double tipPercent = (tip*0.1);
        double tipTotal = (tipPercent*subTotal);
        double totalFinal = (tipTotal+subTotal);
        System.out.println("Tip:"+tipTotal);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Total:"+totalFinal);
        










        










	}
}
