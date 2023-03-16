package loop;

public class BasicLoop {
	
	public static void main( String [] args ) {
		
		// while loop
		int num = 10; //initialization 
		
		//logic  expression (T/F)
		while ( num >= 0 ) {
			
			// executable code 
			System.out.println( "whileLoop num is "+ num );
			
			// increment or decrements 
			num = num - 1;
		}
		
		//for loop
		for( int i = 10; i <= 1; i++ ) {
			// executable code 
			System.out.println( "forLoop num is "+ i );
		}
		
		
	}

}