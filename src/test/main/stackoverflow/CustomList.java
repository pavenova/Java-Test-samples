package test.main.stackoverflow;

import java.util.ArrayList;
import java.util.List;

public class CustomList{
	public static void listExample() {
		List<String> someList = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			someList.add(i + " item");
		}
		
		System.out.println();
		System.out.println(someList);
		
		for (int i = 0; i < someList.size(); i++) {
			System.out.println(i + " = " + someList.get(i));	
		}
		
		System.out.println(getFormatStringFromList(someList));
		System.out.println(getFormatStringFromListWitoutLastSeparator(someList));
	}
	
	public static String getFormatStringFromList(List<String> someList) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < someList.size(); i++) {
			sb.append(someList.get(i) + ";");	
		}
		
		return sb.toString();
	}
	
	public static String getFormatStringFromListWitoutLastSeparator(List<String> someList) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < someList.size(); i++) {
			sb.append(someList.get(i));
			if(i < someList.size() -1) {
				 sb.append(";");
			}
		}
		
		return sb.toString();
	}

}
