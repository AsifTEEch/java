package ALLPROGRAM;
import java.util.Scanner;

public class MATRIX2DTASK2SUB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the NO of rows");
		
		int row = sc.nextInt();
		
		System.out.println("Enter the no of column");
		
		int col = sc.nextInt();
		
		int a[][] = new int[row][col];
		
		int b[][] = new int [row][col];
		
		int c[][] = new int [row][col];
		
		System.out.println("ENTER THE NO OF ELEMENT FOR FIRST MATRIX  ");
		
		for(int i = 0; i<row; i++) {
			
			for(int j = 0 ; j<col; j++) {
				
				a[i][j] = sc.nextInt();
			}
		}
		
	System.out.println("ENTER THE NO OF ELEMENTS FOR SECOND MATRIX ");	
for(int i = 0; i<row; i++) {
			
			for(int j = 0 ; j<col; j++) {
				
				b[i][j] = sc.nextInt();
			}
			
}

for(int i = 0; i<row; i++) {
	
	for(int j = 0 ; j<col; j++) {
		
		c [i] [j] = a[i][j]-b[i][j];
		
		System.out.print(c[i][j] + " ");
		

	}
	
	System.out.println();
}

				
	}			
	}
		

