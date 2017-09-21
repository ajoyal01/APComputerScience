
/*
 * Example 2.2: Temperature Conversion
 * Mr. Joyal, Lambert & Osborne
 * 
 * Description: Gets degrees Fahrenheit as input from the keyboard, 
 * 				and outputs degrees Celsius
 */

import java.util.Scanner; // import the Scanner class from the package java.util

public class Convert {

	public static void main(String[] args) {
		// declare a variable of type Scanner to read values from keyboard
		Scanner in = new Scanner(System.in);
		double fahrenheit;	// stores degrees fahrenheit
		double celsius;		// stores converted degrees Celsius

		// prompt the user to input a value for degrees F
		System.out.print("Enter degrees Fahrenheit: ");
		
		// read the user input as type double (a decimal value)
		fahrenheit = in.nextDouble();

		// close the Scanner!
		in.close();

		// convert the degrees to celsius and store in variable "celsius"
		celsius = (fahrenheit - 32.0) * 5.0 / 9.0;

		// print the calculated result to the console
		System.out.print("The equivalent in Celsius is ");
		System.out.println(celsius);
		
		System.out.println("Testing Github");
	}
}
