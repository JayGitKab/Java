// package com.mosh;

import java.util.Date;
import java.util.Arrays;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
	public static void main (String[] args) {


/* Loops 
		for (int i = 0; i < 5; i++) {
			System.out.println("In For loop");
		}
		
		String input = "";
		Scanner scanner = new Scanner(System.in);
		int j = 0;
		while (!input.equals("quit")) {
			// Get Princ
			System.out.print("input: ");
			input = scanner.next().toLowerCase();
		}  // while 
		
		// For each loop
		String[] fruits = { "A", "M", "O" };
		for (String fruit : fruits)
			System.out.println(fruit);
*/

/* Control flow 
		// && AND, || OR, ! NOT
		int temp = 12;
		if (temp > 30) {
			System.out.println("Hot day");
			System.out.println("Drink water");
		} else if (temp > 20 ) 
			System.out.println("Nice day");
		else 
			System.out.println("Cold!");
		
		int income = 120_000;
		boolean hasHighIncome = (income > 100_000);
		
		// Ternary op
		int income2 = 120_000;
		String className = income2 > 100_000 ? "First" : "Ecomony";
		
		// switch
		String role = "Admin";
		switch (role) {
			case "Admin":
				System.out.println(" You are Admin");
				break;
			case "Moderator":
				System.out.println(" You are Moderator");
				break;
			default:
				System.out.println(" You are Guest");
		}  // switch - role
*/		

/* Reading Input 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Age: ");
		byte age = scanner.nextByte();
		System.out.println("You are " + age);
		
		System.out.print("Name: ");
		String name = scanner.nextLine().trim();
		System.out.println("You are " + name);
*/

/* Formatting numbers 
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = currency.format(1234567.891);
		System.out.println(result);
		
		// NumberFormat.getPercentInstance 
		String result2 = NumberFormat.getPercentInstance().format(.1);
		System.out.println(result2);
*/

/* Math class
		int result = Math.round(1.1F);  //ceil, floor, max, min, random
		System.out.println(result);

		String x = "1";
		int y = Integer.parseInt(x) + 2;  //Float, Double...
		System.out.println(y);

		final float PI = 3.14F;
*/

/* Arrays
//		int [][] numbers = new int[2][3];
		int [][] numbers = { {1,2,3}, {4,5,6 } };
		numbers[0][0] = 1;
		System.out.println(Arrays.deepToString(numbers));
*/

/*		
		int[] num2 = { 2, 3, 5, 1, 4};
		Arrays.sort(num2);
		System.out.println(num2.length);
		System.out.println(Arrays.toString(num2));
		
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
*/
		
/*
 		String message = "Hello \"World\"" + "!!";   // still like 'new'
		System.out.println(message.endsWith("!!"));
		System.out.println(message.indexOf("W"));
		String message2 = message.replace("!", "&");
		System.out.println(message2);
		System.out.println(message);
		
		Point point1 = new Point(1,1);
		Point point2 = point1;
		System.out.println(point2);
		
		point1.x = 2;
		
		System.out.println(point2.x);
*/
		
/*		int age = 30;
		age = 35;
		long views = 333_444_555_666L;
		float price = 10.99F;
		
		System.out.println("Hello World! I'm " + views + " years old.");

		Date now = new Date();
		System.out.println(now);
		*/
	}
}
