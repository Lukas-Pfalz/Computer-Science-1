import java.io.IOException;
import javax.swing.JOptionPane;

/**
//***********************************************************************
'Project: Assignment #5
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 11 18 2020
'Description:  Problem Number #1.  
'    
'   Write two exception classes, one called MonthException and another 
'   called DayException, converting dates from numerical month-day format 
'   to alphabetic month-day format. To keep things simple, assume that
'	February always has 28 days.
'	Main Program converts numeric month-day to alphabetic month-day
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
		
		// Prompt user to enter a given date in the format of
		// month/day/year
		String input;
		input = JOptionPane.showInputDialog("Enter a date " +
				"in the format \"month/day\", with the month and day as"
				+ " integers: ");
		
		// Converts month and day to integers for evaluation
		String[] dateStrings = input.split("/");
		int month = Integer.parseInt(dateStrings[0]);
		int day = Integer.parseInt(dateStrings[1]);
		
		/* If the user enters anything other than the legal month
		(integers from 1 to 12), throw and catch a MonthException */
		try {
			MonthException.checkMonth(month);
		}
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			// Program Concludes, exiting "System"
			System.exit(0);
		}
				
		/* If the user enters anything other than a valid day number
		(integers from 1 to 28-31), throw and catch a DayException*/
		try {
			DayException.checkDay(month, day);
		}
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			// Program Concludes, exiting "System"
			System.exit(0);
		}
		
		// String array 'monthStr' stores the names for each month
		String[] monthStr =
				{"January", "February", "March", "April", "May", 
				"June", "July", "August", "September", "October", 
				"November", "December"};
		
		String alphbtDate;
		alphbtDate = monthStr[month-1] + " " + day;
		JOptionPane.showMessageDialog(null, alphbtDate);
		
		// Program Concludes, exiting "System"
		System.exit(0);
	}
	
}
