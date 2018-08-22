package test.main.bigdecimals;

import java.math.BigDecimal;

public class MyBigDecimal {
	
	public static void floatVsBigDec() {
		floatExample();
		System.out.println("--");
		bigDecimalExample();
	}
	
	private static void floatExample() {
		System.out.println("in floats");
		float a = 0.1f;
		float b = 0.2f;
		
		float result = a+b;
		System.out.print(a + "+" + b + "=");
		System.out.printf("%.10f \n", result);
	}
	
	private static void bigDecimalExample() {
		System.out.println("in big decimals");
		 BigDecimal a = new java.math.BigDecimal("0.1");
		 BigDecimal b = new java.math.BigDecimal("0.2");
		
		 BigDecimal result = a.add(b);

		System.out.print(a + "+" + b + "=");
		System.out.printf("%.10f \n", result);
	}

}
