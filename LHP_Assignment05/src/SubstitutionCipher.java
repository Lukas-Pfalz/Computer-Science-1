
public class SubstitutionCipher implements StringDecoder, 
											StringEncoder {
	/**
	 * The shift integer is a private variable which defines
	 * the number of places each letter will be shifted to 
	 * when encoding/decoding the message
	 */
	private int shift;
	
	/**
	 * The constructor takes in the integer 's' as the
	 * shift value kept private by the instance.
	 * @param s - The user-defined 'shift' value
	 */
	public SubstitutionCipher(int s) {
		shift = s;
	}
	
	/**
	 * The encode method modifies a given String by shifting each
	 * letter forward by the private integer 'shift'
	 * @param cipherText - The String message being encoded
	 * @return A String with the encoded 'cipherText' String
	 */
	public String encode(String cipherText) {
		int len = cipherText.length();
		char[] arr = new char[len];
		
		for (int i = 0; i < len; i ++) {
			char initChar = cipherText.charAt(i);
			char finChar = shiftChar(initChar, 1);
			arr[i] = finChar;
		}
		String newText = new String(arr);
		return newText;
	}
	
	/**
	 * The shiftChar method is a private method used to shift each
	 * char value by summing the 'enterChar's ASCII value and the
	 * 'shift' integer.
	 * The purpose of including the 'shift' integer is for the 'encode'
	 * and 'decode' methods only requiring the value of 
	 * @param enteredChar - The letter entered as a char
	 * @param dir - The direction of letter shift (1 = forward,
	 * -1 = backward)
	 * @return The char with an ASCII-value of the summed
	 */
	private char shiftChar(char enteredChar, int dir) {
		int charVal = enteredChar;
		char newChar = (char)(charVal + shift*dir);
		return newChar;
	}
	
	/**
	 * The decode method is similiar to the encode method, but
	 * reverse the encoding by shifting each character-value
	 * back by the private integer 'shift' times -1
	 * @param cipherText - The String message being encoded
	 * @return A String with the encoded 'cipherText' String
	 */
	public String decode(String cipherText) {
		int len = cipherText.length();
		char[] arr = new char[len];
		for (int i = 0; i < len; i ++) {
			char initChar = cipherText.charAt(i);
			char finChar = shiftChar(initChar, -1);
			arr[i] = finChar;
		}
		String newText = new String(arr);
		return newText;
	}
	
}
