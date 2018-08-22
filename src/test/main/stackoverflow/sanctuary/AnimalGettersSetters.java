package test.main.stackoverflow.sanctuary;

public class AnimalGettersSetters {
	private String name;
	private String desc;
	
	AnimalGettersSetters(){
		//this is implicit constructor in java, you dont need to define it
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
