import java.util.Scanner;

/**
//***********************************************************************
'Project: Assignment #
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 09 22 2020
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
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner (System.in);
		
		String medium = "";
		while (medium.equals("air") || medium.equals("water") || medium.equals("steel")) {
			String request = "Enter one of the following: air, water, or steel: ";
			System.out.print(request + "\n"); 
			medium = keyboard.nextLine();
		}
		
		System.out.print("Enter the distance in feet the sound wave will travel: ");
		double distance = keyboard.nextDouble();
		
		// Prompt
		System.out.print("The medium you entered is " + medium);
		System.out.print("The distance the sound wave will travel: ");
		System.out.println(distance + " feet.");
		
		double density = 0;	
		switch (medium) {
			case "air":
				density = 0;
				break;
			case "water":
				density = 0;
				break;
			default:
				density = 0;
				break;
		}
		
		
	}

}
