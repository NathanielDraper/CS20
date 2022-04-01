/*

Program: Assignment2Chapter5oddsum       Last Date of this Revision: March 30th 2022

Purpose: Create an application that prompts the user for a number then displays every odd number between 1 and the user inputed number then it adds them all together 

Author: Nathaniel Draper
School: CHHS
Course: Computer Science 20

*/

package Chapter5;
import java.util.Scanner;

public class Oddsumassignment3
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);	
		int userinput = 0; 
		System.out.println("Please enter a number: "); // Setting up the user input variable
		userinput = input.nextInt(); // links 
		int sum = 0;
		
		for (int usernum = 1; usernum <=userinput; usernum += 2  ) // loop that displays all odd numbers between 1 and the userinput variable
		{	
			sum = sum + usernum; // adds all odd numbers	
		
		 
			System.out.println(usernum); // displays all odd numbers 
		 
		}
		
		System.out.println(sum); // displays sum of all odd numbers 
	}
	
	
}
