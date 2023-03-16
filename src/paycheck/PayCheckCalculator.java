package paycheck;

import java.util.Scanner;

public class PayCheckCalculator {

	public static void main (String[]args) {
		
		/*
		 * user hour rate 
		 * 
		 * how many hour work 
		 * 
		 *userwork overtime yes / no 
		 * 
		 * hour rate * over time 1.5
		 */
		Scanner scan = new Scanner(System.in);
		double payRate,hour;
		System.out.print("what is your pay rate:  ");
		payRate = scan.nextDouble();
		
		System.out.print("how many hour work in a week :  ");
		hour = scan.nextDouble();
		
	    double regularPay,overtimePay,totalPay;
		if ( hour <= 40 ) {
		 regularPay	= (payRate * hour );
		 overtimePay = 0.00;
		 
		}
		else {
			regularPay	= (payRate * 40 );
			overtimePay = ( (hour - 40) * (payRate *1.5));
		}	 
		totalPay = ( regularPay + overtimePay );
	
			
		System.out.println("regularPay is :" + regularPay);
		System.out.println("overtimePay is :" + overtimePay);
		System.out.println("totalPay is :" + totalPay);
	
	
		
	}
	
}