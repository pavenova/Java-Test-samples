package test.main.stackoverflow.arraysplit;

public class Arraysplit {
	public static final String NAME1 = "Julian Papadopulos";
	public static final String NAME2 = "John von Bahnhof";
	
	public static final char SPLITCHAR = ' ';

	public static void splitNamesBySpaceIndex() {
		// name1
		int firstSpace = NAME1.indexOf(" ");
		int lastSpace = NAME1.lastIndexOf(" ");
		
		String firstName = NAME1.substring(0, firstSpace);
		String lastName = NAME1.substring(lastSpace + 1);
		System.out.println("lastname: \'" + lastName + "\', firstname: \'" + firstName + "\'");
		
		lastName = NAME1.substring(lastSpace);
		System.out.println("lastname: \'" + lastName + "\', firstname: \'" + firstName + "\'");
	}

	public static void getLastNameBySplitIndex() {

	}

}
