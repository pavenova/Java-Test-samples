package test.main.dateTime;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {
	
	public static void timeDateJava8Style(){
		//timestamp
		Instant ins = Instant.now();
		System.out.println(ins.toString());
		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.now();
		date2= date2.plusDays(1);
		
		System.out.println("today: " + date1.toString());
		System.out.println("plus some: " + date2.toString());
		
		
		LocalTime lTime = LocalTime.now();
		System.out.println("actual time : " + lTime.toString());
		lTime = lTime.plusHours(2);
		System.out.println("actual time plus some: " + lTime.toString());
	}

	public static void dateFormatPatterns() {
		String date1 = "2017-01-01 00:00:00:0";
		String date2 = "01-JAN-17";

		final String datePattern1 = "YYYY-dd-MM HH:mm:ss:S";
		final String datePattern2 = "dd-MMM-yy";

		SimpleDateFormat sdf1 = new SimpleDateFormat(datePattern1);
		SimpleDateFormat sdf2 = new SimpleDateFormat(datePattern2);

		try {
			System.out.println("date1: " + sdf1.parse(date1));
			System.out.println("date2: " + sdf2.parse(date2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void applyDateOffset() {

		// dd/mm/yy
		String originDate = "01/01/17"; // 1st Jan 2017

		// https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		String dateFormatPattern = "dd/MM/YY";

		// https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		SimpleDateFormat df = new SimpleDateFormat(dateFormatPattern);

		try {
			System.out.println("origin date:" + originDate);
			Date parsedDate = df.parse(originDate);
			System.out.println("parsed: " + parsedDate.toLocaleString());

			Calendar refDate = Calendar.getInstance();
			refDate.setTime(parsedDate);

			// how many of each part we want to add
			int monthOffsetAdd = 2;
			int daysOffsetAdd = 3;
			int yearOffsetAdd = 0;

			refDate = resetTimeParts(refDate);

			// offset
			refDate.add(Calendar.YEAR, yearOffsetAdd);
			refDate.add(Calendar.MONTH, monthOffsetAdd);
			// day of the month is 1-31 basically
			refDate.add(Calendar.DAY_OF_MONTH, daysOffsetAdd);

			System.out.println("offset applied: " + refDate.getTime().toLocaleString());

			// print in dateformat
			System.out.println("offset applied, dateformatter: " + df.format(refDate.getTime()));

		} catch (Exception e) {
			// unparsable format
			e.printStackTrace();
		}

	}

	public static Calendar resetTimeParts(Calendar in) {
		Calendar outcome = in;
		in.set(Calendar.HOUR_OF_DAY, 0);
		in.set(Calendar.MINUTE, 0);
		in.set(Calendar.SECOND, 0);
		in.set(Calendar.MILLISECOND, 0);

		return outcome;
	}

	public static void dateTimeUtilsExample() {
		dateFormatPatterns();
		applyDateOffset();
		timeDateJava8Style();
	}

	
}
