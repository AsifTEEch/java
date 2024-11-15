package ALLPROGRAM;

public class methodparametertask {
	
	 void sum(int a, int b) {
		
		System.out.println("The add of two numbers : "+ (a+b) );
		System.out.println("The sub of two numbeers : " + (a-b));
		System.out.println("The multiple of two numbers : "+ ( a*b));
		System.out.println("The Div of two numbers : "+ ( a/b));
	}
	
	public static void main (String[]args) {
		
		methodparametertask obj = new methodparametertask();
		obj.sum(20,10);
		
		
	}

}
