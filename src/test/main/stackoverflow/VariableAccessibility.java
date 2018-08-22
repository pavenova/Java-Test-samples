package test.main.stackoverflow;

public class VariableAccessibility {
	public static int STATICVARIABLE = 1;
	public static final int STATICVARIABLECONSTANT = 1;
	
	
	int protectedVariable = 1; //protected is default
	public int publicVariable = 1;
	private int privateVariable = 1;
	
	public int getPrivateVariable() {
		return privateVariable;
	}
	public void setPrivateVariable(int privateVariable) {
		this.privateVariable = privateVariable;
	}
}
