package ALLPROGRAM;

public class Arraytask3 {

	public static void main(String[] args) {
		int avg[]= {10,20,30,40};
		
		int sum = 0;
		
		for(int num : avg) {
			
			sum += num;
		}
		
		
		
		int total = sum/avg.length;
		
		System.out.println("Average value is :"+ total);
		
			
			
		}
	}


