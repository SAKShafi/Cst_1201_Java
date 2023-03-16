package calculator;


import java.text.DecimalFormat;
import java.util.Scanner;

public class BasicCalculator {
	 
    public static double getAddition(double num1, double num2) {
    	double total = num1 + num2;
    	return total;
    }
    
    public static double getSubstraction(double num1, double num2) {
    	double total = num1 - num2;
    	return total;
    }
    public static double getMultipication(double num1, double num2) {
    	double total = num1 * num2;
    	return total;
    }
    public static double getDivision(double num1, double num2) {
    	double total = num1 / num2;
    	return total;
    }	
    public static double getModules(double num1,double num2){
    	       double total=num1%num2;
    	       return total;
    }	              
    	       
    
	public static void main ( String[]args ) {
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("enter number: ");
		double result = scan.nextDouble();
		while (true) {
			System.out.print("enter sign: [+,-,*,/,% to end]: ");
			String userInp = scan.next();
			
			
			if (userInp.contentEquals("=") ) {
				  DecimalFormat df = new DecimalFormat("#.000");
				 result = Double.valueOf(df.format(result));
				System.out.print( "total=" + result );
				  
				 
				break;
			}
			
			
			System.out.print("enter number: ");
			double num = scan.nextDouble();
			
			if (userInp.contentEquals("+") ) {
			result = getAddition(result, num);
			}else if (userInp.contentEquals("-") ) {
				result = getSubstraction(result, num);
			}else if (userInp.contentEquals("*") ) {
				result = getMultipication(result, num);
			}else if (userInp.contentEquals("/") ) {
				result = getDivision(result, num);
			}else if(userInp.contentEquals("%") ) {
			    result=getModules(result,num);
			    
			}else
			System.out.println("Invalid operation");	
	     }
		
	}	
		
}
