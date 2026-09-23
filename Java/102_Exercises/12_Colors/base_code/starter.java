/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

        int red1 = (int)(Math.random()*(255));
        int green1 = (int)(Math.random()*(255));
        int blue1 = (int)(Math.random()*(255));

        int darkred1 = (int)(Math.random()*(128));
        int darkgreen1 = (int)(Math.random()*(128));
        int darkblue1 = (int)(Math.random()*(128));

        int lightred1 = (int)(Math.random()*(255-128)+128);
        int lightgreen1 = (int)(Math.random()*(255-128)+128);
        int lightblue1 = (int)(Math.random()*(255-128)+128);
        
        int weirdred1 = (int)(Math.random()*(255-180)+140);
        int weirdgreen1 = (int)(Math.random()*(255-138)+128);
        int weirdblue1 = (int)(Math.random()*(255-90)+40);


        System.out.println("Random Color");
        getColor(red1, green1, blue1);

        System.out.println("Complimentary colors");
        getColor(red1, green1, blue1);
        getColor(255-red1, 255-green1, 255-blue1);

        System.out.println("Triatitic Colors");
        getColor(red1, green1, blue1);
        getColor(blue1, red1, green1);
        getColor(green1, blue1, red1);

        System.out.println("Dark Color");
        getColor(darkred1, darkgreen1, darkblue1);

        System.out.println("Light Color");
        getColor(lightred1, lightgreen1, lightblue1);

        System.out.println("Bluer Color");
        getColor(darkred1, darkgreen1, lightblue1);

        System.out.println("Custom Color");
        getColor(weirdred1, weirdgreen1, weirdblue1);
		

		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
