package test.main.stackoverflow.sanctuary;

public class AnimalParametrizedConstructor {
	private String name;
	private String desc;
	
	
	public AnimalParametrizedConstructor(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
	
	//when no getters, that is the only way how to access to calss fields
	@Override
	public String toString() {
		return "name: " + this.name + ", description: " + this.desc;
	}
	
}
