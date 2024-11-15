package ALLPROGRAM;

public class returntypetask {
	
	int add(int a, int b) {
		
		int sum = a + b;
		return sum;
	}
	
	
	
	public static  void main(String[] args) {
		
		returntypetask obj = new returntypetask();
		int result = obj.add(10, 20);
		System.out.println("the result of two numbers : " + result);
		
		
		
	}

}
