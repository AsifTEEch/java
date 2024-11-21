package ALLPROGRAM;
import java.util.Scanner;



	public class ACTRESS {
		public static void main(String[]args) {
			String Actors;
			Scanner obj = new Scanner(System.in);
			System.out.println("enter the name of the actoress: ");
			 Actors =obj.nextLine();
			switch(Actors){ 
			case "samantha":
				System.out.println("the actorees name is Samantha : ");
				
			System.out.println("please enter the coactor name : ");
			  String num=obj.nextLine();
			
				switch(num){
				case "vijay":
					System.out.println("THE MOVIE OF SAMANTHA AND VIJAY IS:  T H E R I");
					break;
				case "sk":
					System.out.println("THE MOVIES OF SAMANTHA AND SK IS: S E E M A R A J A");
					
					break;
				case "suriya":
					System.out.println("THE MOVIES OF SAMANTHA AND SURIYA IS : A N J A A N");
				
					break;

				default:
					System.out.println("please enter the corret name of the actress: ");}
				
				break;
			case"nayan":
				
				
				System.out.println("the actorees name is NAYANTHARA : ");
				System.out.println("the co actor name:");
				  String okok=obj.nextLine();
				
					switch(okok){
					case "vijay":
						System.out.println("THE MOVIES OF NAYANDHARA AND VIJAY IS : B I G I L");
						break;
					case"sk":
						System.out.println("THE MOVIES OF NAYUANDHARA AND VIJAY IS : V E L A I K A R A N ");
					
						break;
					case "suriya":
						System.out.println("THE MOVIES OF NAYANDHAR AND SURIYA IS : G A J I N I ");
						break;
		
					default:
						System.out.println(" please enter the correct COACTORS NAME:");}
				       break;
			
			case "thrisha":
				
				System.out.println("enter the name of the actoress : ");
			
				
				System.out.println("please enter the coactor name : ");
				 String ook=obj.nextLine(); 
				
					switch(ook){
					case "vijay":
						System.out.println("THE MOVIES OF THRISHA AND VIJAY IS : L E O");
						break;
					
					case"sk":
						System.out.println("THE MOVIES OF THRISHA AND VIJAY IS : G O A T");
					    break;
					case "suriya":
						System.out.println("THE MOVIES OF THRISHA AND SURIYA IS :  M O U N A M P E S U D H E ");
						break;
		
					default:
						System.out.println(" please enter the correct COACTORS NAME:");}
				       
		break;
		default:
			System.out.println("please enter the correct name of the actress:" );
			break;
			
				
			}
			
		}
		
	}	
	

