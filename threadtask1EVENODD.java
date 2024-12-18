package ALLPROGRAM;

public class threadtask1EVENODD extends Thread {
	
	
	public void run() {
		
		for(int i=0;i<=20;i += 2) {
			
			System.out.println("even numbers : "+ i);
			
			
		}
	}
	

	
static  class oddnumbers extends Thread{
	
	
	public void run() {
		
		for(int i =1; i<=20;i += 2) {
			
			System.out.println("odd numbers : "+ i);
		}
	}
	
}

	public static void main(String[] args) {
		
		threadtask1EVENODD t1 = new threadtask1EVENODD();
		
		//Thread t2 = new Thread(t1);
		t1.start();
		
		oddnumbers t3 = new oddnumbers();
		
		//Thread t4 = new Thread(t3);
		
		t3. start();
		
		
		
		

	}

}

