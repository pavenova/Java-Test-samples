package test.main.stackoverflow.classinheritance;

public class Teacher extends Member {

	private String qualifications;

	public Teacher(String name, String email, String qualifications) {
		super(name, email);
		this.qualifications = qualifications;
	}

	public String getQualifications() {
		return qualifications;
	}

	public String toString() {

		StringBuffer details = new StringBuffer();
		details.append(super.getName());
		details.append(' ');

		if (qualifications != null && qualifications.trim().length() > 0) {
			details.append("(" + qualifications + ")");
			details.append(' ');
		}

		details.append(super.getEmail());
		return details.toString();
	}
	
	public String changeTheMailWithReturnOld(String newMail) {
		return super.changeEmailWithReturnOld(newMail); //super means super class, parent
	}

}
