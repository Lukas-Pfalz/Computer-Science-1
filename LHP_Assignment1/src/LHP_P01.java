import java.util.Scanner;

/**
//***********************************************************************
'Project: Assignment #1
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 07 09 2020
'Description:  Problem Number #1.  
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


public class LHP_P01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialize 'Scanner' Object for reading inputs
		Scanner keyboard = new Scanner(System.in);
		
		// The user enters for separate binary numbers (1 or 0)
		// first binary number (b1 * 2^3)
		System.out.print("Please enter your first binary number: ");
		int b1 = keyboard.nextInt();
		// second binary number (b2 * 2^2)
		System.out.print("Please enter your second binary number: ");
		int b2 = keyboard.nextInt();
		// third binary number (b3 * 2^1)
		System.out.print("Please enter your third binary number: ");
		int b3 = keyboard.nextInt();
		// fourth binary number (b4 * 2^0)
		System.out.print("Please enter your fourth binary number: ");		
		int b4 = keyboard.nextInt();
		
		// Close 'Scanner' Object
		keyboard.close(); 
		
		// Evaluate
		int base10_num = 8*b1 + 4*b2 + 2*b3 + 1*b4;
		
		// Display basic prompt
		System.out.print("\nHere is the value of "+ b1 +""+ b2 +""+ b3 +""+ b4);
		// Display operation
		System.out.println(": 8*" + b1 + "+ 4*" + b2 + "+ 2*" + b3 +"+ "+ b4);
		// Display final result
		System.out.println("= " + base10_num);
	}
}
