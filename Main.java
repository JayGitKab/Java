/*
	M = Princ * ((rate * (1+rate)^n) / ((1+rate)^n-1))

	rate = (yr rate /12 ) / 100
	n = period yrs * 12
	
	Math.pow(a, b)
	
	$1k-$1M
	rate > 0, < 30
	yrs 1 and 30
	*
	
*/	


import java.awt.*;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

	final static byte MONTHS_IN_YEAR = 12;
	final static byte PERCENT = 100;

	/**** Main *******************************************    *************/
	public static void main (String[] args) {
		
		int princ        = (int)readNumber("Principle: ", 1000, 1_000_000);
		float annualRate = (float)readNumber("Annual rate: ", 0, 30);
		int period       = (int)readNumber("Period: ", 0, 30);
		    
		displayPayment(princ, annualRate, period);
		
		displayBalances(princ, annualRate, period);

	}  // main
	
	/******************************************************************
	 * displayBalances
	 * 		display the balanace left after each payment
	 * 
	 * 	b=L[(1+c)^n - (1+c)^p]/[(1+c)^n-1]
	* c - monthly insterest
	* n= #ofpayments
	* p - num of payments we have made
	* 
	* 180000, 4, 10
	*******************************************************************/
	public static double calculateBalance(int princ, float annualRate, int period, int paymentNumber){

		float monthlyRate =  annualRate / PERCENT /MONTHS_IN_YEAR;
		int numberOfPayments = period * MONTHS_IN_YEAR;

		double top, bottom, balance;
		
		top     = Math.pow(1 + monthlyRate, numberOfPayments) - Math.pow((1 + monthlyRate), paymentNumber);
		bottom  = Math.pow(1 + monthlyRate, numberOfPayments) - 1;
		balance = princ * (top/bottom);
		
		return(balance);
	}  // calculateBalance
		
	/******************************************************************
	 * displayBalances
	 * 		display the balanace left after each payment
	* 
	* 180000, 4, 10
	*******************************************************************/
	public static void displayBalances(int princ, float annualRate, int period){
			
		System.out.println("Payment Schedule");				
		System.out.println("----------------");

		int numberOfPayments = period  * MONTHS_IN_YEAR;
		for (int month = 1; month <= numberOfPayments; month++) {
			
			double balance = calculateBalance(princ, annualRate, period, month);
			
			String result = NumberFormat.getCurrencyInstance().format(balance);
			System.out.println(month + " " + result);
			
		} // for
		
	} // displayBalances
	
	/******************************************************************
	 * displayPayments
	 * 		Display the monthly payment
	 * ****************************************************************/
	public static void displayPayment(int princ, float annualRate, int period){


		double monthly = calcualateMortgage(princ, annualRate, period);

		String result = NumberFormat.getCurrencyInstance().format(monthly);	
		System.out.println("\nMortgage");
		System.out.println("--------");
		System.out.println("Monthly Payments: " + result + "\n");

	} // displayPayments
		
	/******************************************************************
	 * readNumber
	 * 		Read in a number between MIN and MAX
	 * ****************************************************************/
	public static double readNumber(String prompt, int min, int max){

		Scanner scanner = new Scanner(System.in);
		float number = 0.0F;

		System.out.print(prompt);
		while (true){
			number = scanner.nextFloat();
			if ((number >= min) || (number <= max))
				break;
			System.out.println("Between " + min + " and " + max);
			}
		return number;
	}  // readNumber
		
	/******************************************************************
	 * calcualateMortgage
	 * 		do the math to get monthly payment
	 * ****************************************************************/
	public static double calcualateMortgage( int pricipal, float annualRate, int period) {

		float monthlyRate =  annualRate / PERCENT /MONTHS_IN_YEAR;
		int numberOfPayments = period * MONTHS_IN_YEAR;

		// M = Princ * ((rate * (1+rate)^n) / ((1+rate)^n-1))
		double top = (monthlyRate * Math.pow(monthlyRate+1, numberOfPayments));
		double bottom = Math.pow(1+monthlyRate, numberOfPayments) -1;
		double monthly = pricipal * (top / bottom);
		
		System.out.println("Number of payments: " + numberOfPayments);
		return(monthly);
	}  // calculateMortgage
	
} // Main
	
	
