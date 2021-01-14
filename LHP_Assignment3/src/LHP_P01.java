import javax.swing.JOptionPane;

/**
//***********************************************************************
'Project: Assignment #3
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 10 13 2020
'Description:  Problem Number #1.  
'    
'   Write a "FutureValue" function to determine the 
'   value (dollar figure) on a particular date
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
		
		// Input 'Previous-Value'
		String prompt_PV = "Enter the dollar value for today: ";
		String user_PV = JOptionPane.showInputDialog(prompt_PV);
		float PV = Float.parseFloat(user_PV);
		
		// Input 'Interest Rate'
		String prompt_r = "Enter the interest rate: ";
		String user_r = JOptionPane.showInputDialog(prompt_r);
		float r = Float.parseFloat(user_r);
		
		// Input 'Number of Periods'
		String prompt_n = "Enter the number of periods: ";
		String user_n = JOptionPane.showInputDialog(prompt_n);
		int n = Integer.parseInt(user_n);
		
		// Output 'Future-Value' with function 'FutureValue'
		float FV = FutureValue(PV, r, n);
		System.out.println("PV = " + PV + ", r = " + r + ", n = " + n);
		System.out.println("FV = " + FV);
	}	
	
	public static float FutureValue(float PV, float r, int n)
	{
		float futureValue = (float) (PV * Math.pow(1 + r, n));
		return futureValue;
	}
}
