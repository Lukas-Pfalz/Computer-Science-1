import javax.swing.JOptionPane;

/**
//***********************************************************************
'Project: Assignment #
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 09 22 2020
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
		
		// Input : Enter number of seconds
		String user_seconds;
		user_seconds = JOptionPane.showInputDialog("Enter the number of seconds.");
		int time = Integer.parseInt(user_seconds);
		
		// Perform 'Non-Decimal' operations to determine
		int SECS_PER_DAY = 24*60*60;
		int SECS_PER_HOUR = 60*60;
		int SECS_PER_MIN = 60;
		
		int days = time / SECS_PER_DAY;
		int hours = time / SECS_PER_HOUR;
		int minutes = time / SECS_PER_MIN;
		int mins_left = minutes % SECS_PER_MIN;
		int seconds = time % SECS_PER_MIN;
		
		// Output each 'time' as operations are performed
		System.out.println("Number of days: " + days);
		System.out.println("Number of hours: " + hours);
		System.out.println("Number of minutes: " + mins_left);
		System.out.println("Number of seconds: " + seconds);		
		
	}

}
