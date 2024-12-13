package ALLPROGRAM;

public class patternrighttask1 {

	public static void main(String[] args) {
		
		int i,s,j;
		
		for(i=1;i<=5;i++) {
			
			
			for(s=5-i;s>0;s--) {
				
				System.out.print(" ");
			}
			
			
			for(j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
	

