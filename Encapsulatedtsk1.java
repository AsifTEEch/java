package ALLPROGRAM;

class Encapsulated{
	
	private String Name ;
	
	private int Age;
	
	private long Rollno;
	
	
	public String getName() {
	return Name;
	}
	public void  setName(String Name) {
	
	this.Name = Name;
}
	
	public int getAge() {
		
		return Age;
	}

	public void setAge(int Age) {
		
		this.Age = Age;
	}
	
	
	public long getRollno() {
		
		return Rollno;
	}
	
	public void setRollno(long Rollno) {
		
		this.Rollno = Rollno;
	}
	
}
public class Encapsulatedtsk1 {

	public static void main(String[] args) {
		
		Encapsulated e1 = new Encapsulated();
		
		e1.setName("ASIF");
		e1.setAge(24);
		e1.setRollno(725363636);
		
		System.out.println("name is :" +e1.getName()+ "\nAGE IS : " + e1.getAge()+ "\nroll no : " + e1.getRollno());

	}

}

