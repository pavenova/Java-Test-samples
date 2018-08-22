package test.main.stackoverflow.arraysize;

public class CustomArray {
	private String[] data;
	private int counter;
	
	public CustomArray(int capacity) {
		this.counter = 0;
		this.data = new String[capacity];
	}
	
	//for avoiding creating uninitialized instance
	private CustomArray() {
	}
	
	public void addString(String item) {
		//check if initialized and space
		if(data != null && counter < data.length) {
			data[counter] = item;
			counter++;
		}
	}
}
