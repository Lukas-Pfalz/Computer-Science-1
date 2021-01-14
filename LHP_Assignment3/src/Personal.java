/**
//***********************************************************************
'Project: Assignment #3
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 10 13 2020
'Description:  Problem Number #5.  
'   
'   Demonstrate the Temperature class by asking the user for a
'	Fahrenheit temperature. 
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

public class Personal {
	
	private static String name, address, phoneNumber;
	private static int age;
	
	public Personal() {
		name = "Lukas Pfalz";
	}
	
	public Personal(String nme) {
		name = nme;
	}
	
	public Personal(String nme, String adrs, int a, String pn) {
		name = nme;
		address = adrs;
		age = a;
		phoneNumber = pn;
	}
}
