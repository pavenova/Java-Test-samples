package test.main.stackoverflow.loantab;

public class t_Info_Loan_Class {
	 private String[] t_Info_Loan;

	   t_Info_Loan_Class() {
	       t_Info_Loan = new String[40];
	   }

	    public void add(String s, int j) {
	        t_Info_Loan[j] = s;
	    }

		public String[] getT_Info_Loan() {
			return t_Info_Loan;
		}
	    
	    
}
