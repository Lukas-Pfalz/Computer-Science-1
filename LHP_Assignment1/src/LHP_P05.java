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

public class LHP_P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input names 1-3
		
		// Initialize 'Scanner' Object for reading inputs
		Scanner keyboard = new Scanner(System.in);
				
		// name #1
		System.out.print("Please enter name #1: ");
		String name1 = keyboard.nextLine();
		// name #2
		System.out.print("Please enter name #2: ");
		String name2 = keyboard.nextLine();	
		// name #3
		System.out.print("Please enter name #3: ");
		String name3 = keyboard.nextLine();
		
		// Close 'Scanner' Object
		keyboard.close(); 
		
		// Initial Prompt before displaying names
		System.out.println(	"\nHere are your names in every possible order:\n" +
							"--------------------------------------------\n");
		
		// Display the names in every possible order
		// Name Combinations for name #1
		System.out.println(	name1 + ", " + name2 + ", " + name3 + "\n\n" +
							name1 + ", " + name3 + ", " + name2 + "\n");
		
		// Name Combinations for name #2
		System.out.println(	name2 + ", " + name1 + ", " + name3 + "\n\n" +
							name2 + "\n" + name3 + "\n" + name1 + "\n");
		
		// Name Combinations for name #3
		System.out.println(	name3 + "\n" + name1 + "\n" + name3 + "\n\n" +
							name3 + "\n" + name2 + "\n" + name1);
	}
}
