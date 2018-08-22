package test.main.stackoverflow.loantab;

public class TestLoan {
	
	public static void fooLoans() {
		t_Info_Loan_Class[] t_Info_Loan_Tab = new t_Info_Loan_Class[40];

		   for (int i = 0; i < 2; i++)
		      t_Info_Loan_Tab[i] = new t_Info_Loan_Class();

		   for(int j = 0; j < 40; j++)
		       t_Info_Loan_Tab[0].add("S", j);
		   for(int j = 0; j < 40; j++)
		       t_Info_Loan_Tab[1].add("D", j);

		   for(int i = 0; i < 2; i++) {
		      for(int j = 0; j < 40; j++)
		         System.out.print(t_Info_Loan_Tab[i].getT_Info_Loan()[j] + " ");
		      System.out.println();
		   }
		
		
	}

}
