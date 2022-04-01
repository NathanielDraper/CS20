/*

Program: Assignment2Chapter5NumbersSum        Last Date of this Revision: March 30th 2022

Purpose: Create an application that prompts the user for a number then displays every number between the user inputed number and 1 

Author: Nathaniel Draper
School: CHHS
Course: Computer Science 20

*/
package Chapter5;
import java.util.Scanner;

public class NumbersSumassignment2 
{
	
	

	public static void main(String[] args) 
	{
		  Scanner input = new Scanner(System.in);

		    int numbercap = 0;
		   
		    int usernum = 0; // Variables

		    System.out.println("Enter a number: ");

		    usernum = input.nextInt(); // Links variables to user input
		   
		    for (int user <  numbercap ) // Whatever number the user inputs will become the usernum variable
		    {   
		   
		    usernum +=1; // The numbercap variable will make sure every number between 1 and usernum variable will be displayed but wont display numbers above the usernum variable
		   
		    System.out.println(usernum);

		  
		  

		    }




	}
	
	}

	


