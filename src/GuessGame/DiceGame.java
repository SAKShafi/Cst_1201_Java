package GuessGame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
        public static void main (String[]args) {
        					
        			/*
        			 * instalation number with 10,000 
        			 * 
        			 * user input = scanner dont more than 10,000 or less then 0
        			 * 
        			 * keep guess while loop 
        			 *
        			 * check conditon and clue 
        			 * 
        			 */
        	        Random rand = new Random();
        	        
        	       
        			double amount = 10000;
        			Scanner scan = new Scanner(System.in);
        			
   
	                double bet;
                    int userNum,diceNum;
        			boolean shoulcontunue = true;
        			while (shoulcontunue ) {
        			
        			diceNum = rand.nextInt(6)+1 ;
        			
        			System.out.print("Enter your bet:");
        			bet = scan.nextInt();
        			if (bet==0 || amount == 0) {
        			shoulcontunue = false;
        			}
        			if (bet<=amount) {
        				System.out.print("Roll your dice: ");
        				userNum = scan.nextInt();
        			 if (bet==diceNum) {
        				 System.out.print("Congrats you win this round  ");
        				 amount += bet;
        				 System.out.print("your new amount: " + amount);
        			 }else {
        				 System.out.println("you loss this rount better luck next time  ");
        				 amount -= bet;
        				 System.out.println("your new amount: " + amount);	 
        			 }
        				 
        			 System.out.print("Do you want to play again:");
        			 String choice = scan.next();
        			 if (choice.equalsIgnoreCase("no")) {
        			 shoulcontunue = false;
        			 userNum = scan.nextInt();
        			}
        			 
        		}else {
        				
        			System.out.println("you cant play more than amount:" + amount);
                }
        
           } 
           System.out.println("your amount after game :" + amount);

        }		
        
}       		    
        			
        			




        		    
        		    