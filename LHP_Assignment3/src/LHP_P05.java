/**
//***********************************************************************
'Project: Assignment #3
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 10 13 2020
'Description:  Problem Number #5.  
'   Demonstrate the Personal class by creating three objects
'	including me, one friends, and another friend.  
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
		// Initialize 'Personal' for ME
		Personal me = new Personal();
		
		// Initialize 'Personal' for Friend #1
		Personal friend1 = new Personal("Nick");
		
		// Initialize 'Personal' for Friend #2
		String name = "Todd";
		int age = 19;
		String address = "337 Overlook Dr, Lusby, MD 20657";
		String phoneNum = "443-975-5046";
		Personal friend2 = new Personal(name, address, age, phoneNum);	
	}

}
