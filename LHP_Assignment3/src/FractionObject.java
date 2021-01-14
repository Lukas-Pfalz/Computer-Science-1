public class FractionObject {
	
	// Initialize 'FractionObject' parameters
	private int numerator, denominator;
	
	public FractionObject(int num, int den) {
		// Constructor with numerator, denominator
		numerator = num;
		if (den != 0)
			denominator = den;
		else {
			// denominator cannot be 0, so output a message 0 if
			System.out.println("Denominator cannot be 0, so it has been changed to 1");
			// passed and set numerator and denominator to 1
			denominator = 1;
		}
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public float getDecimal() {
		return ((float)numerator / (float)denominator);
	}
}
