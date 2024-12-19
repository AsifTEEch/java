package ALLPROGRAM;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class datefunctiontask1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the date formate");
		
		String str = sc.next();
		
		SimpleDateFormat sd = new SimpleDateFormat("d/M/yyyy");
		
		
		
		try {
			
			Date da = sd.parse(str);
			
			System.out.println("input date :"+sd.format(da));
			
			Calendar cl = Calendar.getInstance();
			
			//cl.setTime(da);
			
			System.out.println("add the no of days");
			
			int daysadd = sc.nextInt();
			
			System.out.println("add the no of month ");
			
			int monthadd = sc.nextInt();
			
			System.out.println("add the no of years to add");
			
			int yearsadd = sc.nextInt();
			
			cl.add(Calendar.DAY_OF_MONTH, daysadd);
			
			cl.add(Calendar.MONTH ,monthadd);
			
			cl.add(Calendar.YEAR, yearsadd);
			
			Date updatedate = cl.getTime();
					
			System.out.println("updatedate :"+ sd.format(updatedate));
		}
		
		catch(ParseException e){
			
			System.out.println("invalid date formate");
		}
		
		sc.close();

	}

}
