/*

Program: Excersise6digits         Last Date of this Revision: March 8th 2022

Purpose: Create an application that displays the digits place
Author: Nathaniel Draper, 
School: CHHS
Course: Computer Science 20
 

*/

package Chapter3;

import java.util.Scanner;

public class Excersise6digits {

	public static void main(String[] args) {
		
	int usernumber;
		
		Scanner input = new Scanner(System.in);
		
		
System.out.println("Enter two digit number:       ");
int number = input.nextInt();
int ones = (number / 1) % 10;
int tens = (number /10) % 10;
int hundreths =(number /100) % 10;

System.out.println("Ones place:   " + ones);
System.out.println("Tens place:   " + tens);
System.out.println("Hundreths place:" + hundreths);

	}
	
}
