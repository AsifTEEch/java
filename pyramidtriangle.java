package ALLPROGRAM;

public class pyramidtriangle {

	public static void main(String[] args) {
		
		
		        int i, sp, j;

		        for (i = 1; i <= 5; i++) {
		            // Print leading spaces
		            for (sp = 1; sp <= 5 - i; sp++) {
		                System.out.print(" ");
		            }

		            // Print stars (for the current row)
		            for (j = 1; j <= (2 * i - 1); j++) {
		                System.out.print("*");
		            }

		            // Move to the next line
		            System.out.println();
		        }
		    }
		}
	

