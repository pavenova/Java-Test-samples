package test.main.java8;

import java.util.ArrayList;
import java.util.Comparator;

import test.main.java8.beans.Developer;

public class LambdasExample {
	public static void compareByDefault() {
		ArrayList<Developer> data = Java8Utils.getDeveloperArrayList();
		printData(data);

		System.out.println("comapre default");
		System.out.println("comaparing to -1 item");

		for (int i = 1; i < data.size(); i++) {
			System.out.println(data.get(i).compareTo(data.get(i - 1)));
		}
	}

	public static void compareByAge() {
		ArrayList<Developer> data = Java8Utils.getDeveloperArrayList();
		printData(data);

		compareByAgeClassic(data);
		compareByAgeLambda(data);
	}

	public static void compareByName() {
		ArrayList<Developer> data = Java8Utils.getDeveloperArrayList();
		printData(data);

		compareByNameClassic(data);
		compareByNameLambda(data);
	}

	private static void printData(ArrayList<Developer> data) {
		Java8Utils.printData(data);
	}

	private static void compareByAgeClassic(ArrayList<Developer> data) {
		System.out.println("compare by age classic");
		System.out.println("comaparing to -1 item");

		for (int i = 1; i < data.size(); i++) {
			System.out.println(AgeComparator.compare(data.get(i), data.get(i - 1)));
		}
	}

	private static void compareByNameClassic(ArrayList<Developer> data) {
		System.out.println("compare by name classic");
		System.out.println("comaparing to -1 item");

		for (int i = 1; i < data.size(); i++) {
			System.out.println(NameComparator.compare(data.get(i), data.get(i - 1)));
		}
	}

	private static void compareByAgeLambda(ArrayList<Developer> data) {
		System.out.println("compare by age lambda");
		System.out.println("comaparing to -1 item");

		for (int i = 1; i < data.size(); i++) {
			System.out.println(LambdaAgeComparator.compare(data.get(i), data.get(i - 1)));
		}

	}

	private static void compareByNameLambda(ArrayList<Developer> data) {
		System.out.println("compare by name lambda");
		System.out.println("comaparing to -1 item");

		for (int i = 1; i < data.size(); i++) {
			System.out.println(LambdaNameComparator.compare(data.get(i), data.get(i - 1)));
		}
	}

	// classic comparator variant
	public static final Comparator<Developer> AgeComparator = new Comparator<Developer>() {
		@Override
		public int compare(Developer o1, Developer o2) {
			// will works because positive integer
			return o1.getAge() - o2.getAge();
		}
	};

	public static final Comparator<Developer> NameComparator = new Comparator<Developer>() {
		@Override
		public int compare(Developer o1, Developer o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};

	// lambda variant
	public static final Comparator<Developer> LambdaNameComparator = (Developer o1, Developer o2) -> o1.getName()
			.compareTo(o2.getName());

	public static final Comparator<Developer> LambdaAgeComparator = (Developer o1, Developer o2) -> o1.getAge()
			- o2.getAge();

}
