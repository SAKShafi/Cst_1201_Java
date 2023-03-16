package cointoss;
import java.util.Random;
import java.util.Scanner; 
public class CoinToss {

	public static void main (String[]args) {
		
		
		//create a random number 

	    Random rand = new Random();
	    
	    // user input 
	    
	    Scanner scan = new Scanner (System.in);
	    
	     System.out.print(" Enter 1 for hrad and 0 for tails: ");
	     
	     String choice = scan.next();
	     
	     System.out.println("user choice:" + choice) ;
	    
	    //pick a number between 0 and 1 
	    
	    int numCHoice = rand.nextInt(2);
	
	    //System.out.println(numCHoice);
	
	    if  (numCHoice == 1) {
	    	System.out.println("winner");
	    }else {
	    	System.out.println("losser");
	    }
	
	
	
	}
	
	
	
}
	    
	    