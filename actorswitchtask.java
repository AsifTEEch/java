package ALLPROGRAM;
import java.util.*;

public class actorswitchtask {
	
	

	

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Choose a hero\nVijay\nRajini\nKamal");
			String hero =scan.nextLine();
			
			
			switch(hero) {
			case "Vijay":
				System.out.println("Ghill\nLeo\nMersal\nSura\nBeast");
				System.out.println("Enter your favorite movie");
				System.out.println();
				String movie =scan.nextLine();
				switch(movie) {
				case "Ghill":
				case "Leo":
				case "Mersal":	
					System.out.println(movie+"was a blockbuster movie");
					break;
				case "Sura":
				case "Beast":
					System.out.println(movie+"was a flop ");
					break;
					default: 
						System.out.println("Enter the valid movie");
				break;}
			break;
			case "Kamal":
				System.out.println("Indian\nVikram\nVishwaroopam\nIndian2.0\nAnbesivam");
				System.out.println("Enter your favorite movie");
				System.out.println();
				String favoriteMovie =scan.nextLine();
				switch(favoriteMovie) {
				case "Indian":
				case "Vikram":
				case "Vishwaroopam":	
					System.out.println(favoriteMovie+" was a blockbuster movie");
					break;
				case "Indian2.0":
				case "Anbesivam":
					System.out.println(favoriteMovie+" was a flop ");
					break;
				default: 
					System.out.println("Enter the valid movie");
			}
			break;
			case "Rajini":
				System.out.println("Endhiran\nBasha\nMuthu\nEndhiran2.0\nKala");
				System.out.println("Enter your favorite movie");
				System.out.println();
				String LikedMovie =scan.nextLine();
			switch(LikedMovie){
			case "Endhiran":
			case "Basha":	
			case "Muthu":	
				System.out.println(LikedMovie+"  was a blockbuster movie");
				break;
			case "Endhiran2.0":	
			case "Kala":
				System.out.println(LikedMovie+"  was a blockbuster movie");
				break;
			default: 
				System.out.println("Enter the valid movie");
			}
				break;
			}	
			
			}
				
			

		}

