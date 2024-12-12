package ALLPROGRAM;

public class Arraytask4 {

	public static void main(String[] args) {
		int[] original = {10,20,30,40};
		
		int[] copy = new int[original.length];
		
		for(int i=0;i<original.length;i++) {
			
			copy [i] = original[i];
		}
		System.out.println("Copied Array :");
		for(int num:copy) {

			System.out.println(num);
	}
		
		


}

}