package ALLPROGRAM;

import java.util.Scanner;

public class ARMTASK {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int arm = 0, temp;
        System.out.println("Enter the Number: ");
        
        
        int num = scan.nextInt();
        
        temp = num;
        
        while (num > 0) {
            int rem = num % 10;  // Get the last digit
            arm = rem * rem * rem + arm;  // Add the cube of the digit to arm
            num = num / 10;  // Remove the last digit
        }
        
        
        if (temp == arm) {
            System.out.println(temp + " is an Armstrong Number");  // Check if the number is an Armstrong number
        } else {
            System.out.println(temp + " is not an Armstrong Number");
        }

        scan.close();  // Close the scanner to prevent resource leak
    }
}

