package ALLPROGRAM;

abstract class Shape {
	

	abstract double area() ;

	abstract double perimeter() ;
	

}

class Rectangle  extends Shape{
	
	private double length;
	private double width;
	
	Rectangle(double l, double w){
		
		this.length = l;
		this.width = w;
	}
	@Override
	 double area() {
		
		return length*width;
	}
		@ Override
		
		 double perimeter() {
			
			return 2*(length+width);
		}
		
		
	}
	
class Circle extends Shape{
	
	private double pi;
	private double r;
	
	Circle(double pi,double r){
		
		this.pi = pi;
		this.r = r;
	}
	
	@Override
	double area() {
		return pi*r*r;
		
		
	}
	
	@Override
	double perimeter() {
		
		return 2*pi*r;
	}
}

class Triangle extends Shape{
	
	double a;
	double b;
	double h;
	
	Triangle(double a, double b,double h){
		
		this.a = a;
		this.b = b;
		this.h = h;
	}
	
	@Override 
	double area() {
		
		return a*b*h;
	}
	
	@Override
	
	double perimeter() {
		return a+b+h;
	}
	
}
public class Inheritancetask4{
	
	public static void main(String[]args) {
		
		Rectangle r1 = new Rectangle(20 , 10);
		
		double area =r1.area();
		double perimeter =r1.perimeter();
		
		System.out.println("AREA OF RECTANGLE :"+area);
		System.out.println("PERIMETER OF RECTANGLE :"+perimeter);
		
		System.out.println();
		
		Circle c1 = new Circle(3.14,5);
		double area1=c1.area();
		double perimeter1 =c1.perimeter();
		System.out.println("AREA OF CIRCLE :"+area1);
		System.out.println("PERIMETER OF CIRCLR :"+perimeter1);
		
		System.out.println();
		
		Triangle t1 = new Triangle(10,20,30);
		double area2 =t1.area();
		double perimeter2 = t1.perimeter();
		
		System.out.println("AREA OF TRIANGLE :"+area2);
		System.out.println("PERIMETER OF TRIANGLE : " +perimeter2);
		
	
	}
	
	
}
		
			
			
		
		


