/*

Program: Excersise8GuessingGame   Last Date of this Revision: April 5th 2022

Purpose: Create an application that prompts the user for a guess

Author: Nathaniel Draper
School: CHHS
Course: Computer Science 20

*/
package Chapter5;
import java.util.Random;
import java.util.Scanner;
public class GuessingGameExcersise {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	
		
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in); // For Scanners
		
		int randomNumber = rand.nextInt(20) + 1; // Generates a random number between 1 and 20
		
		System.out.println("Input a number between 1 and 20:   "); // Asks user to guess and guess turns into usernum variable
		int usernum = scanner.nextInt(); // usernum variable
		
		int playerGuess = scanner.nextInt();
		
		if (playerGuess == randomNumber)  
		{ // Should the player guess the randomnumber they get displayed the message that they have won
			System.out.println("Correct guess!");

	}
		else if(randomNumber  >  playerGuess) {
			System.out.println("The number is higher guess again");	 // If the user guesses low they will be displayed this message
			
			
		} else 
			 
			System.out.println("The number is lower guess again"); //  If the user guesses high they will be displayed this message 
	
		

}
	
}

