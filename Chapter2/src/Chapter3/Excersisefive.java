/*

Program: Excersise 5 Chapter 3          Last Date of this Revision: March 8 2022

Purpose: Create a change calculator that relates to the users input

Author: Nathaniel Draper 
School: CHHS
Course: Computer Science 20
 

*/


package Chapter3;
import java.util.Scanner; 
public class Excersisefive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println( "Enter the change in cents no more then a 1:00$:        " );
		int number = input.nextInt();
		int Change = number; 
		 
		 int Quarters = (number/25);
		 int Dimes = (number%25/10);
		 int Nickels = (number%10/5);
		 int Penny = (number%5);
		 
		 
		 System.out.println("The amount of coins required to make the change:  ");
		 System.out.println("Quarters:    " +  Quarters);
		 System.out.println("Dimes:   " + Dimes);
		 System.out.println("Nickles:     " + Nickels);
		 System.out.println("Penny:    "   + Penny);
		 
		 
		
		

	}


}
