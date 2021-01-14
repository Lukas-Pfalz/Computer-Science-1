public class Rainfall {
	
	// Rainfall per-month stored
	private static double[] rain;
	
	// List of each month, following the format of
	// 0 = January to 11 = December
	private static String month[] = {"January", "Febreuary", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"};
	
	public Rainfall(double[] rainfall) {
		// Rainfall constructor
		Rainfall.rain = rainfall;
	}
	
	public static double totalRainfall() {
		// total is counted by summing the year's rainfall
		double total = 0.0;
		for (int i = 0; i < rain.length; i++)
			total += rain[i];
		return total;
	}
	
	public static double averageRainfall() {
		// Average = total-rainfall / number-of-months
		return Rainfall.totalRainfall() / rain.length;
	}
	
	public static int leastRainfall() {
		// The for-loop stores the lowest rainfall's value and index
		// lowest-rainfall's index is initialized
		int month_of_lowest = 0;
		// lowest rainfall's value is initialized 
		double lowest = rain[month_of_lowest];
		for(int i = 1; i < Rainfall.rain.length; i++)
			// lowest rainfall is stored for comparison while
			// the index is stored for the month of lowest rain
			if (Rainfall.rain[i] > lowest){
				month_of_lowest = i;
				lowest = rain[i];
			}
		
		// returns the index for month-of highest rainfall
		return month_of_lowest;
	}
	
	public static int mostRainfall() {
		// The for-loop stores the highest rainfall's value and index
		// highest-rainfall's index is initialized
		int month_of_highest = 0;
		// highest rainfall's value is initialized 
		double highest = rain[month_of_highest];
		for(int i = 1; i < Rainfall.rain.length; i++)
			// highest rainfall is stored for comparison while
			// the index is stored for the month of highest rain
			if (Rainfall.rain[i] > highest){
				month_of_highest = i;
				highest = rain[i];
			}
		
		// returns the index for month-of highest rainfall
		return month_of_highest;
	}
	
	public String toString() {
		// The 'returned' string is initialized with the formatting used
		System.out.println("MONTH\t\tRAIN");
		
		// Lists the rainfall for each month
		for (int i = 0; i < rain.length; i++)
			// spaces are used to ensure each month/rain line
			// is formatted correctly
			System.out.printf("%s     \t%.2f\n", month[i], rain[i]);
		
		// The 'total rainfall', 'average rainfall', 'least-rainfall'
		// and 'most-rainfall' methods are used to display their values
		
		// total rainfall
		System.out.printf(	"\nThe total rainfall for this year is "
							+ "%.2f\n", Rainfall.totalRainfall());
		// average rainfall
		System.out.printf(	"The average rainfall for this year "
							+ "is %.2f\n", Rainfall.averageRainfall());
		// month of highest rainfall
		System.out.printf(	"The month with the highest amount of rainfall "
				+ "is %s with %.2f inches.\n", month[Rainfall.mostRainfall()], 
				rain[Rainfall.mostRainfall()]);
		// month of lowest rainfall
		System.out.printf(	"The month with the least amount of rainfall "
				+ "is %s with %.2f inches.\n", month[Rainfall.leastRainfall()], 
				rain[Rainfall.leastRainfall()]);
		return "";
	}
}
