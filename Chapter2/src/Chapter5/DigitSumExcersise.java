/*

Program: DigitSumExcersise6Chapter5                            Last Date of this Revision: March 30th 2022

Purpose: Create an application that prompts the user for a non negative integer and displays the sum of all the digits

Author: Nathaniel Draper
School: CHHS
Course: Computer Science 20

*/
package Chapter5;
import java.util.Scanner;
public class DigitSumExcersise {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		int num, newValue, nextNum;
		
		
		
		
		
		System.out.println("Please enter a non-negative integer:     "); // Asks user for an integer 
		num = input.nextInt(); // links integer to userinput variable
		
		
		
		//sum the digits
		
		int ones = (num / 1) % 10;
		int tens = (num /10) % 10; // Adds all of the digits
		int hundreths = (num /100) %10;
		
		int digitsSum = tens + ones + hundreths;
		
		System.out.println("The sum of the digits is: " + digitsSum); // Displays sum of all digits
		
		
		
		

	}

}
