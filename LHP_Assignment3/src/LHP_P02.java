import javax.swing.JOptionPane;

/**
//***********************************************************************
'Project: Assignment #3
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 10 13 2020
'Description:  Problem Number #2.  
'   
'   Implement FractionObject Class using three different data sets
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
		
		// Initialize numerator and denominator Inputs
		String prompt_num = "Enter numerator: ";
		String user_num = JOptionPane.showInputDialog(prompt_num);
		int num = Integer.parseInt(user_num);
		
		// Input denominator
		String prompt_den = "Enter denominator: ";
		String user_den = JOptionPane.showInputDialog(prompt_den);
		int den = Integer.parseInt(user_den);
		
		// Use numerator and denominator for 'Fraction-Object'
		FractionObject fraction = new FractionObject(num, den);
		
		// Display Numerator
		System.out.println("numerator = " + fraction.getNumerator());
			
		// Display Denominator
		System.out.println("denominator = " + fraction.getDenominator());
				
		// Display Decimal
		System.out.println("decimal = " + fraction.getDecimal());
	}
}
