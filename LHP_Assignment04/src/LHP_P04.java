/**
//***********************************************************************
'Project: Assignment #4
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 11 03 2020
'Description:  Problem Number #3.  
'    
'   The program swaps element in a given array before printing the array
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

public class LHP_P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] inputArray = { 1, 2., 3., 4., 5, 6, 7, 8, 9, 10 };
		printArray(inputArray);
		inputArray = swap(4, inputArray);
		System.out.println("Swap 4 & 5");
		printArray(inputArray);
		System.out.println("Swap 8 & 9");
		inputArray = swap(8, inputArray);
		printArray(inputArray);
		System.out.println("Swap 1 & 2");
		inputArray = swap(1, inputArray);
		printArray(inputArray);
	}
	
	public static double[] swap(int index, double[] inputArray) {
		double tempA = inputArray[index+1];
		double tempB = inputArray[index];
		double arr[] = new double[inputArray.length];
		for(int i = 0; i < arr.length; i++)
			if (i == index)
				arr[i] = tempA;
			else if (i == index+1)
				arr[i] = tempB;
			else
				arr[i] = inputArray[i];
		return arr;
	}
	
	public static void printArray(double[] inputArray) {
		for(int i = 0; i < inputArray.length; i++)
			System.out.print(inputArray[i] + " ");
		System.out.println("");
	}

}
