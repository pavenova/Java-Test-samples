package test.main.java8;

import java.util.ArrayList;
import java.util.List;

public class ForeachExample {
	//http://www.mkyong.com/java8/java-8-foreach-examples/
	
	public static void printStuff() {
		List<String> data = getData();
		
		printStandard(data);
		printLambda(data);
		printMethodReference(data);
		printStreamAndFilter(data);
		
	}

	private static List<String> getData() {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		return items;
	}
	
	private static void printStandard(List<String> items) {
		System.out.println("print standard way");
		for(String item : items){
			System.out.println(item);
		}
	}
	
	private static void printLambda(List<String> items){
		System.out.println("print lambda way");
		//lambda
		//Output : A,B,C,D,E
		items.forEach(item->System.out.println(item));
		
		/*
		//Output : C
		items.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});
		*/
	}
	
	private static void printMethodReference(List<String> items) {
		System.out.println("print method reff");
		//method reference
		//Output : A,B,C,D,E
		items.forEach(System.out::println);
	}
	
	private static void printStreamAndFilter(List<String> items) {
		System.out.println("print by stream adn filter");
		//Stream and filter
		//Output : B
		items.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
	}

}
