package ALLPROGRAM;

import java.util.Scanner;

public class threadtask2Average extends Thread{
	
	
	int a,b,c,d,e;
	int f;
	 threadtask2Average(){
	Scanner sc = new Scanner(System.in);
	
  System.out.println("ENETER THE 5 Subject marks : ");
  
  a = sc.nextInt();
  
  b = sc.nextInt();
  
  c = sc.nextInt();
  d  = sc.nextInt();
  e = sc.nextInt();
  
  f = a+b+c+d+e;
  
  
	 }
	 
	 public void run() {
		 
		 System.out.println("Average of 5 Subjects is : " + f/5);
	 }
	 
	 
	 public static void main (String[]args) {
		 
		 threadtask2Average t2  = new threadtask2Average();
		 
		 t2.start();
	 }
	
	
}