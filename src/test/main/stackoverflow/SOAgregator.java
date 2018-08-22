package test.main.stackoverflow;

import java.util.Date;

public class SOAgregator {
	@SuppressWarnings("deprecation")
	public static void dateStringTest() {
		//dd/mm/yyyy !!
		
		Date d= new Date("12/01/2018");
		System.out.println(d.toLocaleString());
		
		d= new Date("31/12/2017");
		System.out.println(d.toLocaleString());
		
		d= new Date("02/12/2017");
		System.out.println(d.toLocaleString());
		
		d= new Date("20/12/2017");
		System.out.println(d.toLocaleString());
		
		//12th Jul 2019
		d= new Date("31/12/2017");
		System.out.println(d.toLocaleString());
	
		//31st dec
		d= new Date("12/31/2017");
		System.out.println(d.toLocaleString());
	}

	public static void underFlowOverFlow() {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println("max before inc: " + max);
		max = max+ 1;
		System.out.println("max after inc: " + max);
		
		System.out.println();
		System.out.println("min before dec: " + min);
		min = min- 1;
		System.out.println("min after dec:  " + min);
		
		System.out.println();
		System.out.println("underflow = max int? " + (Integer.MAX_VALUE==(Integer.MIN_VALUE-1)));
		System.out.println("overflow = min int? " + (Integer.MIN_VALUE==(Integer.MAX_VALUE+1)));
	}

}
