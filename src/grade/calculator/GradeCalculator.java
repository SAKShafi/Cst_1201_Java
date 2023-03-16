package grade.calculator;

import java.util.Scanner;

public class GradeCalculator {

	public static void main ( String[]args ){
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print( "Enter your score: 1: " );
		
		float score1 = scan.nextFloat();
		System.out.print( "Enter your score: 2: " );
		
		float score2 = scan.nextFloat();
        System.out.print( "Enter your score: 3: " );
        
        float score3 = scan.nextFloat();
		
		System.out.print( "Enter your score: 4: " );
		
		float score4 = scan.nextFloat();
		
		float avgScore = (score1 + score2 + score3 + score4 ) /4 ;
		
		char grade = getGrade(avgScore);
		
		
		 if (grade !=0) {
		
		
		       System.out.println(" your grade is:"+ grade );
				
		}		
		
		
	}

	public static char getGrade(float score) {
		
		char grade = 0;
	
		if (score > 90.0 && score <= 100) {
			grade = ('A');
		} else if (score > 80.0 && score < 90 ) {
			grade = ('B');
		} else if ( score > 70.0 && score < 80) {
			grade = ('C');
		} else if ( score > 60.0 && score < 70) {
			grade = ('D');
		} else if ( score >= 0 && score <60 ) {
			grade = ('F');
		}else 
			System.out.println("invalid score must be 1 to 100");
		
		
		return grade;
		
		
		
		
	}

	


}
