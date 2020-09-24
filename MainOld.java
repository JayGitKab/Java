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
	public static void main (String[] args) {
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		Scanner scanner = new Scanner(System.in);
		
		// Get Princ
		int princ = 0;
		do {
			System.out.print("Principle (between $1K and $1M): ");
			princ = scanner.nextInt();
		} while ((princ <= 1_000) || (princ >= 1_000_000));
		
		// Get rate
		float monthlyRate = 0, annualRate = 0;
		do {
			System.out.print("Annual rate: ");
			annualRate = scanner.nextFloat();
			monthlyRate =  annualRate / PERCENT /MONTHS_IN_YEAR;
		} while ((annualRate <= 0) || (annualRate >= 30));
	
		// Get period
		int period = 0, numberOfPayments = 0;
		do {
			System.out.print("Period: ");
			period = scanner.nextInt();
			numberOfPayments = period * MONTHS_IN_YEAR;
		} while ((period <= 0) || (period >= 30));
		System.out.println("Period (Months): " + numberOfPayments);

		// M = Princ * ((rate * (1+rate)^n) / ((1+rate)^n-1))
		double top = (monthlyRate * Math.pow(monthlyRate+1, numberOfPayments));
		double bottom = Math.pow(1+monthlyRate, numberOfPayments) -1;
		double monthly = princ * (top / bottom);
		
		//NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = NumberFormat.getCurrencyInstance().format(monthly);
		
		System.out.println("Monthly is: " + result);

	
	}  // main
} // Main
	
	
