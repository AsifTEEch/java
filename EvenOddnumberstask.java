package ALLPROGRAM;

public class EvenOddnumberstask {

	    public static void main(String[] args) 
	    {
	        System.out.println("Even Numbers:");
	        for (int i = 1; i <= 10; i++) {               // Loop from 1 to 10
	            if (i % 2 == 0) {                       // Check if the number is even
	                System.out.println(i);
	            }
	        }

	        System.out.println("Odd Numbers:");
	        for (int i = 1; i <= 10; i++) {               // Loop from 1 to 10
	            if (i % 2 != 0) {                      // Check if the number is odd
	                System.out.println(i);
	            }
	        }
	    }
	

}
