package DayFinder;

import java.time.LocalDate;
import java.util.Scanner;

import org.testng.annotations.Test;

public class DayFinder {
	static Scanner sc = new Scanner(System.in);
	static int day = sc.nextInt();
	static int month = sc.nextInt();
	static int year = sc.nextInt();
	String DAY = "";
	
	@Test
	public static void dayDinder()
	{
		LocalDate ld = LocalDate.of(day, month, year);
		
		// DayOfMonth
		System.out.println("Day Of Month: "+ld.getDayOfMonth());
		System.out.println("Month Value: "+ld.getMonthValue());
		System.out.println("Length Of Month: "+ld.lengthOfMonth());
		System.out.println("Get Month: "+ld.getMonth());
		
		// DayOfYear
		System.out.println("Day Of Year: "+ld.getDayOfYear());
		System.out.println("Length Of Year: "+ld.lengthOfYear());
		System.out.println("Get Year: "+ld.getYear());
		
		// DayOfWeek
		System.out.println("Day Of Week: "+ld.getDayOfWeek());
			
		// Hash Value
		System.out.println("Hash Code: "+ld.hashCode());
		
		// Current Time
		System.out.println("Now Date: "+ld.now());
		
		System.out.println("To EPoch Day: "+ld.toEpochDay());
		
	}
}
