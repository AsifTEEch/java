package ALLPROGRAM;

import java.util.Scanner;

public class ArraymatrixMultitask3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i , j ;
		
		System.out.println("eneter te number of rows");
		int row = sc.nextInt();
		System.out.println("enter the number of columns");
		int col = sc.nextInt();
		
		int a [][]= new int[row][col];
		int b[][]= new int[row][col];
		int c [][]= new int[row][col];
		
		
		System.out.print("eneter the element for first matrix");
		for(i=0;i<row;i++) {
			
			for(j=0;j<col;j++) {
				
				a[i][j]=sc.nextInt();
				
				
			}
			
			System.out.println();
		}
		System.out.print("eneter the element for second matrix");

for(i=0;i<row;i++) {
			
			for(j=0;j<col;j++) {
								b[i][j]=sc.nextInt();
				
		
		
	}
System.out.println();
}

//System.out.print("eneter the element for second matrix");
for(i=0;i<row;i++) {
	
	for(j=0;j<col;j++) {
		
		c[i][j]=a[i][j]*b[i][j];
		
		System.out.print(c[i][j]+ " ");
		

}
	System.out.println();
}

}
}