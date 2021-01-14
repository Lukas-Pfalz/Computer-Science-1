import java.util.Scanner;

/**
//***********************************************************************
'Project: Assignment #
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 07 09 2020
'Description:  Problem Number #2.  
'    
'   LINE 1 AT LEAST 3 LINES OF PROGRAM DESCRIPTION
'   LINE 2 AT LEAST 3 LINES OF PROGRAM DESCRIPTION
'   LINE 3 AT LEAST 3 LINES OF PROGRAM DESCRIPTION
'
'	--------------------------------------------------------------------------
'   							HONOR CODE: 
'	I pledge that this program represents my own program code, I have received 
'	help from no one and I have given help to no one.
'	
'								OR
'
'	I received help from NAME OR NO ONE in designing and debugging my program.
'	I given help to NAME OR NO ONE in designing and debugging my program.
'-----------------------------------------------------------------------------
'
'  LINE LENGTH - AVOID LINES LONGER THAN 80 CHARACTERS
'  SCALE BELOW IS TO CALIBRATE SCREENSHOTS
'  DO NOT HAVE YOUR CODE OR SCREENSHOT EXTEND BEYOND THE SCALE
0........1.........2.........3.........4.........5.........6.........7.........8
12345678901234567890123456789012345678901234567890123456789012345678901234567890
*/

public class LHP_P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialize 'Scanner' Object for reading inputs
		Scanner keyboard = new Scanner(System.in);
		
		// User is prompted to enter a number from 0-99
		System.out.print("Please enter name a number between 0 and 99: ");
		int num = keyboard.nextInt();
		// Close 'Scanner' Object
		keyboard.close(); 
		// Initial prompt finishes
		System.out.println("Here is the breakdown of coins for " + num + ":");
		System.out.println("--------------------------------------------");
		
		// Coins for the given "num" is determined:
		// 1. Determine how many of a coin is used
		// 2. Determine the remainder of change before repeating
		// 3. Repeat for each coin (Quarter / Dime / Nickel / Pennies)
		int change = num;			// Place-holder for coins left
		int quarters = change / 25;	// Quarter (25)
		change = change % 25;
		int dimes = change / 10;	// Dimes (10)
		change = change % 10;
		int nickels = change / 5;	// Nickels (5)
		int pennies = change % 5;	// Pennies (1)
		
		// Display coin-breakdown
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
	}
}
