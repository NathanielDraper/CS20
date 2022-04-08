/*

Program: Assignment4Chapter5Accountsetup     Last Date of this Revision: March 30th 2022

Purpose: Create an application that prompts the user for a username and password. THe password should only be accepted if its at least 8 characters long. Username and password should be converted to all lowercase

Author: Nathaniel Draper
School: CHHS
Course: Computer Science 20

*/

package Chapter5;
import java.util.Scanner;
public class Stringloopassignment4 {

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);	
		
		
	String pass, user; // Sets string variables
		
		
		System.out.println("Please enter a 8 character password:          ");   // User inputs a password
		pass = input.nextLine();
		
		System.out.println("Please enter a username:       "); // user inputs a username
		user = input.nextLine(); 
		
		
		
		
		
		user = user.toLowerCase();// Converts username to all lowercase
		
		pass = pass.toLowerCase(); // Converts password to all lowercase
		
		System.out.println("Your entered password is:  "  + pass); // Displays password
		System.out.println("Your entered username is:  "  + user); // Displays username
		
		
		
		

	}

}

	

