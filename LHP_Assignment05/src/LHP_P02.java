/**
//***********************************************************************
'Project: Assignment #5
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 11 23 2020
'Description:  Problem Number #2.  
'   
'   Displays the area of each track and indicates whether tracks are of
' 	equal size
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

public class LHP_P02 {

	public static void main(String[] args) {
		
		// LandTrack parameters for instance 1
		int lt1_length, lt1_width;
		// lt1_length = 200; lt1_width = 300;
		lt1_length = 100; lt1_width = 400;
		
		// LandTrack parameters for instance 2
		int lt2_length, lt2_width;
		// lt2_length = 100; lt2_width = 600;
		lt2_length = 100; lt2_width = 400;
		
		// First LandTrack Instance
		LandTrack landtrack1 = new LandTrack(lt1_length, lt1_width);
		
		// Second LandTrack Instance
		LandTrack landtrack2 = new LandTrack(lt2_length, lt2_width);
		
		System.out.println(	landtrack1.toString() + "\n" +
							landtrack2.toString());
		
		// If they are equal sizes, print that instances are equal
		if (landtrack1.equals(landtrack2))
			System.out.println("The Land Tracks are equal sizes");
		// Otherwise, print that instances are not equal
		else
			System.out.println("The Land Tracks are not equal sizes");
	}
}
