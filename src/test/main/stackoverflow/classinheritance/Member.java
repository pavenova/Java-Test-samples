package test.main.stackoverflow.classinheritance;

public class Member {
	 private String email;

	  private String name;

	  public Member(String name, String email) {
	   this.name = name;
	   this.email = email;
	  }


	  public String getEmail() {
	   return email;
	  }

	  public String getName() {
	   return name;
	  }

	  public void changeEmail(String newEmail) {
		  this.email = newEmail;
		  
	  }
	  
	  public String changeEmailWithReturnOld(String newEmail) {
		  String oldMail = this.email;
		  changeEmail(newEmail);
		  return oldMail;
	  }

}
