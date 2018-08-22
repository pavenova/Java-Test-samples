package test.main.stackoverflow.sanctuary;

import java.util.Scanner;

public class SanctuaryMainClassWhateverName {

	public static void main(String[] args) {
		final int COUNT = 2;

		Scanner sc = new Scanner(System.in);

		// parametrized constructor section
		// load animals with parametrized constructor
		AnimalParametrizedConstructor[] paramAnimals = new AnimalParametrizedConstructor[COUNT];

		for (int i = 0; i < COUNT; i++) {
			System.out.println("What a name?");
			String name = sc.nextLine();
			System.out.println("What a description?");
			String desc = sc.nextLine();

			AnimalParametrizedConstructor newAnimal = new AnimalParametrizedConstructor(name, desc);
			paramAnimals[i] = newAnimal;
		}

		// and print them- because we defined toString, we have access to fields without
		// getter
		for (int i = 0; i < paramAnimals.length; i++) {
			System.out.println("animal no. " + i + ": " + paramAnimals[i].toString());
		}

		// animals with getter and setter section
		AnimalGettersSetters[] animalsGS = new AnimalGettersSetters[COUNT];

		for (int i = 0; i < COUNT; i++) {
			AnimalGettersSetters newGS = new AnimalGettersSetters();
			// load
			System.out.println("What a name?");
			newGS.setName(sc.nextLine()); // we have setters to private fields!
			System.out.println("What a description?");
			newGS.setDesc(sc.nextLine()); // we have setters to private fields!

			animalsGS[i] = newGS;
		}

		// print using gettes
		for (int i = 0; i < COUNT; i++) {
			System.out.println(
					"animal no." + i + ": name: " + animalsGS[i].getName() + ", desc: " + animalsGS[i].getDesc());
		}

		// NEVER FORGET !
		sc.close();

	}

}
