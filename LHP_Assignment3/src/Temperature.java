public class Temperature {
	
	// initialize 'fahrenheit' variable
	private static double fahrenheit;
	
	// Construct 'Temperature' Class with fahrenheit parameter
	public Temperature (double f) {
		fahrenheit = f;
	}
	
	// Set - Fahrenheit
	public static void setFahrenheit(double new_fahrenheit) {
		fahrenheit = new_fahrenheit;
	}
	
	// Get - Fahrenheit
	public static double getFahrenheit() {
		return fahrenheit;
	}
	
	// Return the converted temperature in Celsius
	public static double celsius() {
		return (5.0 / 9.0) * (fahrenheit - 32);
	}
	
	// Return the converted temperature in Kelvin
	public static double kelvin() {
		return Temperature.celsius() + 273;
	}
}
