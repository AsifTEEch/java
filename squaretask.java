package ALLPROGRAM;
import java.util.Scanner;

public class squaretask {
	


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        // Get user input
	        System.out.println("Enter a number: ");
	        int num = scan.nextInt();

	        // Calculate the square root
	        int sqrt = (int) Math.sqrt(num);

	        // Check if the square of the square root equals the number
	        if (sqrt * sqrt == num) {
	            System.out.println(num + " is a perfect square.");
	        } else {
	            System.out.println(num + " is not a perfect square.");
	        }

	        scan.close(); // Close the scanner
	    
	}

}
