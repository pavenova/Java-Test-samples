package test.main.java8.beans;


/**
 * Sample class
 * 
 * @author pavenova
 *
 */
public class Developer implements Comparable<Developer> {
	private int id;

	private String name;
	private int age;

	public Developer(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*negative integer, zero, or a positive integer 
		as this object is less than, 
		equal to, 
		or greater than the specified object
	*/
	@Override
	public int compareTo(Developer o) {
		return this.id - o.id;
	}

	@Override
	public String toString() {
		return "id: " + id + ", age: " + age + ", name: " + name;
	}

}