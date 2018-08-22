package test.main.java8;

import java.util.ArrayList;

import test.main.java8.beans.Developer;
//TODO http://www.mkyong.com/tutorials/java-8-tutorials/
public class Java8Utils {

	public static ArrayList<Developer> getDeveloperArrayList() {
		ArrayList<Developer> data = new ArrayList<>();

		data.add(new Developer(1, "Foo1 Foo", 10));
		data.add(new Developer(3, "Foo Foo1", 30));
		data.add(new Developer(2, "Foo2 Foo", 20));
		data.add(new Developer(2, "Foo3 Same", 20));
		
		return data;
	}

	public static void printData(ArrayList<Developer> data) {
		System.out.println("input data: ");

		printDataLambda(data);
	}

	@SuppressWarnings("unused")
	private static void printDataClassic(ArrayList<Developer> data) {
		for (int i = 0; i < data.size(); i++) {
			System.out.println("[" + i + "]: " + data.get(i).toString());
		}
	}

	private static void printDataLambda(ArrayList<Developer> data) {
		data.forEach((developer) -> System.out.println(developer));
		;
	}

	public static void java8LambdasExample() {
		LambdasExample.compareByDefault();
		System.out.println();
		LambdasExample.compareByAge();
		System.out.println();
		LambdasExample.compareByName();
	}

	public static void java8ForeachExamples() {
		ForeachExample.printStuff();
	}

}
