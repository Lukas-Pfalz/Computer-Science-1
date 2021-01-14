/**
//***********************************************************************
'Project: Assignment #4
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 11 03 2020
'Description:  Problem Number #1.  
'    
'   The program displays the toString method of the 
'   'Rainfall' Class to demonstrate that the Class
'   runs effectively
'
'	--------------------------------------------------------------------------
'   							HONOR CODE: 
'	I pledge that this program represents my own program code, I have received 
'	help from no one and I have given help to no one.
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

		// Rainfall per month is initialized
		double rain[] = {54.2, 9.5, 27.8, 44.9, 42.9, 46.9, 93.5, 70.2,
		                 71.9, 30.5, 116.4, 39.9};
		
		// 'Rainfall' Class is initialized with 'rain' as the
		// constructor's Argument
		Rainfall rainfall = new Rainfall(rain);
		
		// toString method display the various values evaluated
		// the 'Rainfall' Class' methods
		rainfall.toString();
	}
}
