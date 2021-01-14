
public class ShuffleCipher implements StringDecoder,
										StringEncoder {
	/**
	 * n - Number of Shuffles performed in encode/decode methods
	 */
	private int n;
	
	/**
	 * The constructor for 'ShuffleCipher' uses the parameter
	 * 'numShuffles' to define how many shuffles are performed
	 * by the encode and decode methods
	 * @param numShuffles - The number of shuffles performed
	 */
	public ShuffleCipher(int numShuffles) {
		n = numShuffles;
	}
	
	/**
	 * The encode method modifies the String 'cipherText' by
	 * shuffling each
	 * @param cipherText - The String message being encoded
	 * @return The encoded version of the String 'cipherText'
	 */
	public String encode(String cipherText) {
		String str = "";
		int len = cipherText.length();
		int halfLen = (int) Math.round( (double)(len / 2) + 0.5);
		for (int shuff = 0; shuff < n; shuff ++) {
			String firstHalf = cipherText.substring(halfLen);
			String secondHalf = cipherText.substring(0, halfLen);
			str = firstHalf + secondHalf;
		}
		return str;
	}
	
	/**
	 * The decode method identifies by encode message by performing
	 * the encode method again, since switching the halves twice.
	 * The if-statement ensure this works by placing the final character
	 * of the 'cipherText' in the beginning IF AND ONLY IF the number of
	 * shuffles and the 'cipherText's length are BOTH Odd.
	 * @param cipherText - The encoded String message
	 * @return The decoded String message
	 */
	public String decode(String cipherText) {
		int len = cipherText.length();
		if(n % 2 == 1 && len % 2 == 1)
			cipherText = cipherText.substring(len-1) + 
			cipherText.substring(0,len-1);
		return encode(cipherText);
	}
}
