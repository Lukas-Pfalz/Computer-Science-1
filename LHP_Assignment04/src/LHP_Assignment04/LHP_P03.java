/**
//***********************************************************************
'Project: Assignment #4
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 11 03 2020
'Description:  Problem Number #3.  
'    
'   The program runs the 'ArrayUtilities' Class to print the double array
'   and calculated values, which is strictly used with ONLY static methods
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

public class LHP_P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input array is initialized
		double [] inputArr = {75.8, 6.1, 40.5, 43.0, 28.8, 17.7,
		                     32.3,35.3, 125.3, 43.8, 71.1, 23.3, 28.2};
		
		// Only have static methods from ArrayUtilities Class
		ArrayUtilities arrUtil = new ArrayUtilities(inputArr);
		// printOutput displays values from every method
		arrUtil.printOutput();
	}	
}
