package test.main.arrays;

import java.util.Arrays;

public class ArraysUtils {

	public static void outOfBoundArray() {
		int[] list1 = {};
		int[] list2 = new int[6];
		int[] list3 = null;

		try {
			System.out.println("unsized length: " + list3.length);

			for (int i = 0; i < 6; i++) {
				list1[i] = i + 1;
			}
		} catch (Exception e) {
			System.out.println(Arrays.toString(e.getStackTrace()));
		}

		System.out.println("-------------");
		System.out.println("sized length: " + list2.length);
		for (int i = 0; i < 6; i++) {
			list2[i] = i + 1;
		}
		System.out.println("Sized: " + Arrays.toString(list2));

		System.out.println("-------null ------");
		try {
			System.out.println("unsized length: " + list1.length);

			for (int i = 0; i < 6; i++) {
				list3[i] = i + 1;
			}
		} catch (Exception e) {
			System.out.println(Arrays.toString(e.getStackTrace()));
		}
	}

	public static void arrayDimensions() {
		int dimension = 3;

		String[][] customArray = new String[dimension][dimension];
		int counter = 0;

		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				counter++;
				customArray[i][j] = i + ":" + j + "(" + counter + ")";

				System.out.print(customArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void anotherArray() {
		int dimention = 3;
		int rows = dimention;
		int columns = dimention;
		
		int[][] tableArray = new int[rows][columns];
		int ctr = 0;

		System.out.println(" ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				ctr++;
				System.out.print((tableArray[i][j] = ctr) + " ");
			}

			System.out.println(" ");
		}
	}

}
