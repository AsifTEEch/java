package ALLPROGRAM;
import java.util.Scanner;

public class palidromecheck {
	

	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        // Get user input
	        System.out.println("Enter a string: ");
	        String input = scan.nextLine();

	        // Reverse the string
	        String reversed = new StringBuilder(input).reverse().toString();

	        // Check if the original and reversed strings are the same
	        if (input.equals(reversed)) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }

	        scan.close(); // Close the scanner
	    
	}

}
