package ALLPROGRAM;

public class Diamondstar {

	public static void main(String[] args) {
	
		        int i, sp, j;

		        // Upper part of the diamond
		        for (i = 1; i <= 7; i++) {
		            // Print leading spaces
		            for (sp = 1; sp <= 7 - i; sp++) {
		                System.out.print(" ");
		            }
		            // Print stars
		            for (j = 1; j <= (2 * i - 1); j++) {
		                System.out.print("*");
		            }
		            // Move to the next line
		            System.out.println();
		        }

		        // Lower part of the diamond
		        for (i = 6; i >= 1; i--) {
		            // Print leading spaces
		            for (sp = 1; sp <= 7 - i; sp++) {
		                System.out.print(" ");
		            }
		            // Print stars
		            for (j = 1; j <= (2 * i - 1); j++) {
		                System.out.print("*");
		            }
		            // Move to the next line
		            System.out.println();
		        }
		    }
}
