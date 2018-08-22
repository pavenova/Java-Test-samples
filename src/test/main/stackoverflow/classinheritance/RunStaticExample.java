package test.main.stackoverflow.classinheritance;

public class RunStaticExample {

	public static void justFoo() {
		Teacher teacher1 = new Teacher("foo", "foo@foo.foo", "whateverFoo");
		teacher1.changeEmail("someNewFoo@foo.foo"); // parent method
		teacher1.changeEmailWithReturnOld("someNewFoo@foo.foo"); // Child method
	}

}
