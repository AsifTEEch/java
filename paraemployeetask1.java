package ALLPROGRAM;

public class paraemployeetask1 {
	
	int id;
	String name ;
	String department;
	int salary;
	
	paraemployeetask1(int i,String n, String d,int s){
		
		id = i ;
	name  = n;
		department = d;
	    salary = s;
	    
	}
	
	void display() {
		
		System.out.println(id +" " + name+" "+ department+ " " + salary);
	}
	
	public static void main(String[]args) {
		
		System.out.println("id  name , department, salary");
		
		paraemployeetask1 e1 = new paraemployeetask1(1, "asif", "software developer", 50000);
		
		paraemployeetask1 e2 = new paraemployeetask1(2,"mani", "cad developer", 35000);
		
		
		paraemployeetask1 e3 = new paraemployeetask1(3, "umar","buisness associate",40000 ) ;
		
		paraemployeetask1 e4 = new paraemployeetask1(4, "illliyas","automobile", 25000);
	
	    
	
	e1.display();
	e2.display();
	
	e3.display();
	
	e4.display();
	    
	
		
	}
	
	

	

}
