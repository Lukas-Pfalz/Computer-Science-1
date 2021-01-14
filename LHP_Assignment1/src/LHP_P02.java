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

public class LHP_P02 {

	public static void main(String[] args) {
		
		// Initialize 'Scanner' Object for reading inputs
		Scanner keyboard = new Scanner(System.in);
		
		// INPUTS
		System.out.print("Please enter the number of Males in the class: ");
		// Enter the males in a class
		int males = keyboard.nextInt();
		// Enter the females in the class
		System.out.print("Please enter the number of Females in the class: ");
		int females = keyboard.nextInt();
		
		// Close 'Scanner' Object
		keyboard.close();
		
		// Determine percentage of males/females in a class
		double total_students = males + females;
		int male_percentage = (int)(males * 100 / total_students);
		int female_percentage = (int)(females * 100 / total_students);
		
		// Display male/female percentages
		System.out.println("\nPercentage of Males: " + male_percentage + "%");
		System.out.println("Percentage of Females: " + female_percentage + "%");
	}

}
