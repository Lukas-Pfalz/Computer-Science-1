import javax.swing.JOptionPane;

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

public class LHP_P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// INPUTS (gender / weight / height / age)
		
		// gender (male/female)
		String gender;
		gender = JOptionPane.showInputDialog("Enter your gender: ");
		
		// weight(lbs)
		String user_weight;
		user_weight = JOptionPane.showInputDialog("Enter your weight (lbs): ");
		int weight = Integer.parseInt(user_weight);
		
		// height (inches)
		String user_height;
		user_height = JOptionPane.showInputDialog("Enter your height (inches): ");
		int height = Integer.parseInt(user_height);
		
		// age (years)
		String user_age;
		user_age = JOptionPane.showInputDialog("Enter your age (years): ");
		int age = Integer.parseInt(user_age);
		
		// Determine female/male BMR for given weight/height/age
		double BMR;
		
		// Display female/male BMR measures
		if (gender.equals("female")) {
			BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
			System.out.println("Female BMR: " + BMR);
		}
		else {
			BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
			System.out.println("Male BMR: " + BMR);
		}
		// Determine number of chocolates (230 cal) consumed to maintain calories
		int num_bars = (int)BMR / 230;
		// Display number of chocolates consumed
		System.out.print(num_bars + " chocolate bars should be consumed ");
		System.out.println("to maintain your weight");
		
		// exit from JOptionPane
		System.exit(0);
	}
}
