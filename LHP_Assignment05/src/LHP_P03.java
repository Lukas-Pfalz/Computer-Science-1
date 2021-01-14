/**
//***********************************************************************
'Project: Assignment #5
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 11 23 2020
'Description:  Problem Number #3.  
'   Tests the Substitution/Shuffle Cipher Classes
'   Run the program with the following information:
' 	SubstitutionCipher: use outstanding (encode and decode)
' 	ShuffleCipher: use outstanding (encode and decode)
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
		// The 'shift' and 'Number of Shuffles' integer
		int num = 3;
		// The message being encoded/decoding by each Cipher class
		String msg = "use outstanding";
		// The Strings for the 'encoded' and 'decoded' message is initialized
		String encoded_msg, decoded_msg = "";
		
		// The Substitution Cipher's encoded/decoded messages are displayed
		SubstitutionCipher subCipher = new SubstitutionCipher(num);
		// Message is encoded by using the ShuffleCipher's 'encode' method
		encoded_msg = subCipher.encode(msg);
		System.out.println(	"\nThe Substitution Cipher's encoded message: "
							+ encoded_msg);
		// Message is decoded by using the ShuffleCipher's 'decode' method
		decoded_msg = subCipher.decode(encoded_msg);
		System.out.println(	"The Substitution Cipher's decoded message: "
							+ decoded_msg);
		
		// The Shuffle Cipher's encoded/decoded messages are displayed
		ShuffleCipher shuffCipher = new ShuffleCipher(num);
		// Message is encoded by using the ShuffleCipher's 'encode' method
		encoded_msg = shuffCipher.encode(msg);
		System.out.println(	"\nThe Shuffle Cipher's encoded message: "
							+ encoded_msg);
		// Message is decoded by using the ShuffleCipher's 'decode' method
		decoded_msg = shuffCipher.decode(encoded_msg);
		System.out.println(	"The Shuffle Cipher's decoded message: "
							+ decoded_msg);
	}

}
