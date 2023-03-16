package condition;

public class CheckCondition {
	public static void main (String[]args) {
		
	boolean condition = true;
	
	if (condition) {
		System.out.println("condition is true ");
	}
	
	
	int num1 = 10;
	int num2 = 7;
	
	if (num1 > num2) {
		System.out.println("number1 is bigger ");
	}else if ( num1 < num2 ) {
		System.out.println("number2 is bigger ");
	}else 
		System.out.println("numbers must be equals ");
	/*
	 * join condition 
	 * 
	 * != not equals 
	 * 
	 * */
		// Module % provide remainder
	// example 5 % 2 =1 | 4 % 2  = 0
		
	
	if ( ( num1 > num2 ) && ( num1 % 2 == 0)){
		System.out.println("number1 is bigger and even");	
	}	else if ( ( num1 > num2 ) && ( num1 % 2 != 0)){
		System.out.println("number1 is bigger and odd");
    } else if  ( ( num1 < num2 ) && ( num2 % 2 == 0)){
    	System.out.println("number1 is bigger and even");
    }	else if ( ( num1 < num2 ) && ( num2 % 2 == 1)){
    	System.out.println("number1 is bigger and odd");
    }	else 
    	System.out.println("defult");
	if ( ( num1 % 2 == 0 ) || ( num2 % 2 == 0 ) ) {
		System.out.println("either the number is even");
    }	else 
    	System.out.println("both of the number is odd");
    	
	}
    	
}

    	
    	
    
    
    