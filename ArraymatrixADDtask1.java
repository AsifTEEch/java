package ALLPROGRAM;

import java.util.Scanner;

public class ArraymatrixADDtask1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		
		int row = sc.nextInt();
		
		System.out.println("Enter the number of column ");
		
		int col = sc.nextInt();
		
		int[][]a = new int[row][col];
		int [][]b = new int [row][col];
		
		int [][]c = new int [row ][col];
		
		
		System.out.println("getting element from user for first matrix");
		
		for(int i =0;i<row;i++) {
			
			for(int j =0; j<col;j++) {
				
				
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("getting elements from user for second matrix");
		for(int i =0;i<row;i++) {
			
			for(int j =0;j<col;j++) {
				
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<row;i++) {
			
			for(int j =0;j<col; j++) {
				
				c[i][j]=a[i][j]+ b[i][j];
				
				
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
		
	}