package ALLPROGRAM;

public class parabooktask2 {
	
	String title;
	int ISBN ;
	String Author;

	
	parabooktask2(String t,  int is, String A){
		
		
		title = t;
		ISBN = is;
		Author = A;
		
		
	}
	
	void add() {
		
		if (title == null && Author == null || ISBN == 0) {
			
			System.out.println("Book data is removed");
		}
		else {
		System.out.println( " Book Author :" +title +",ISBN : "  + ISBN +", Author Name :" + Author);
	}
	}

		void remove() {
			
			title = null;
			ISBN = 0;
			Author = null;
			
			//if title is null and Author is null ("the book data is removed ");
		}

	
	
	
	public static void main(String[]args) {
		
		parabooktask2 b1 = new parabooktask2("House Divied ",1234, " Buck" );
		
		parabooktask2 b2 = new parabooktask2(" Captian Diary ",2345, " stewart " );
		
		parabooktask2 b3 = new parabooktask2(" China passage ", 3456, " John ");
		
	
		
	//	System.out.println("\n removing b1 book data");
		b1.remove();
		
		
		// after displaying b2 book data is removed
		b1.add();
		b2.add();
		b3.add();
		
		
	}
	

}
