package test.main.stackoverflow.classinheritance;

public class Student extends Member{
	private int attendance;

	public Student(String name, String email) {
		super(name, email);
		this.attendance = 0;
	}

	public int getAttendance() {
		return attendance;
	}

	public void markAttendance(int attendance) {
		this.attendance += attendance;
	}

	public void print() {
		System.out.println(super.getName() + " (" + attendance + ")");
	}

}
