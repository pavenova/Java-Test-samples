package test.main.stackoverflow.datetime;

import java.time.LocalDate; 
public class DateTimeTests {

	public static void addLocalDate() {
		LocalDate somedate = LocalDate.now();
		System.out.println(somedate.toString());
		somedate= somedate.plusDays(32l);
		System.out.println(somedate.toString());
	}
}
