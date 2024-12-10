package ALLPROGRAM;

class Person{
	
private String name;
private int age;

Person(String name , int age){
	
	this.name = name;
	this.age = age;
}
	
	public  void display() {
		
System.out.println("name is : " + name +"\n age is : "+ age);	
	
}
}

class Employee extends Person{
	
	
	
	Employee(String name,int age){
		
		super(name,age);
	}
	
	
		
			
			
		
	}
	


public class inheritancetask5 {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee("ASIF ",24);
		e1.display();
		
		Employee e2 = new Employee("mani",21);
		e2.display();
		
		
	}

}
