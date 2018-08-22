package test.main.stackoverflow.arraysize;

import java.util.ArrayList;

public class CustomArrayList {
	private ArrayList<String> data;
	private int capacity;
	
	/*
	public CustomArrayList() {
		//default constructor still exist, but capaciy- int default value is zero
		//if you will create new CustomArrayList(), than it will have no capacity (zero) 
	}*/
	
	public CustomArrayList(int capacity) {
		this.data = new ArrayList<>();
		this.capacity = capacity;
	}
	
	public void add(String itm) {
		if(data.size() < capacity) {
			data.add(itm);
		}
	}
}
