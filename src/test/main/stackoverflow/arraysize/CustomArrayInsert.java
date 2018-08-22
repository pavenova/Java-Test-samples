package test.main.stackoverflow.arraysize;

public class CustomArrayInsert {

	public static void fooWorkingArray() {
		CustomArray cArray = new CustomArray(40);

		for (int i = 0; i < 40; i++) {
			cArray.addString("foo");			
		}
	}
	
	
	public static void fooWorkingArrayList() {
		CustomArrayList cList = new CustomArrayList(40);
		for (int i = 0; i < 40; i++) {
			cList.add("foo");			
		}
	}
}
