package test.main.stackoverflow;

import java.util.Scanner;

public class Mix {
	
	public static void scannerLoop() {
		 Scanner in = new Scanner(System.in);
	        int avgScore = 0;
	        int entry = 0;
	        int totalScore = 0;
	        do
	        {
	            System.out.print("Enter a score. -1 to quit: ");
	            int score= in.nextInt();
	            if(score == -1)
	            {
	                break;
	            }
	            else
	            {
	                totalScore +=score;
	                entry++;
	            }
	        }
	        while (in.hasNextInt());
	        if(entry ==0)
	        {
	            System.out.println("average score: "+ totalScore);
	        }
	        else
	        System.out.println("average score: "+ totalScore/entry);
	    }
	}
