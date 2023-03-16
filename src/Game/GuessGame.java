package Game;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	public static void main( String[]args){
		
		
		
		/*
		 * take number random 
		 * user input = scanner 
		 * 
		 * keep guess while loop 
		 *
		 * check conditon and clue 
		 * 
		 */
		
		
		Random rand = new Random();
		int secretNum = rand.nextInt(99) + 1 ;
		
		//System.out.println(secretNum);
		//2. user input 
		Scanner scan = new Scanner(System.in);
	    int count = 0;
		boolean shouldcoutinue = true;
		while (shouldcoutinue) {
			System.out.print("enter your guess:");
			int userNum = scan.nextInt();
			
			if (userNum==secretNum) {
			System.out.println("congratulation your guess correct: ");
			shouldcoutinue = false;
			}else if ( userNum > secretNum)	{
				System.out.println ("guess lower");
			}else if ( userNum< secretNum) {
				System.out.println("huess higher");
			}
			
		}
		
	}

}
