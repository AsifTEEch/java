package ALLPROGRAM;
import java.util.Scanner;


public class mulipletwotask {
	
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        // Get user input
	        System.out.println("Enter a number: ");
	        int num = scan.nextInt();

	        // Check if the number is a multiple of 2
	        if (num % 2 == 0) {
	            System.out.println(num + " is a multiple of 2.");
	        } else {
	            System.out.println(num + " is not a multiple of 2.");
	        }

	        scan.close(); // Close the scanner
	    
	}

}
