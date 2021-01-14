import java.io.IOException;

public class MonthException {
	
	/**
	 * The checkMonth Exception method checks if the day entered
	 * by the user is in-range for the days of the user-entered month
	 * @param month - The month (integer) entered by the yser
	 * @throws IOException - A message stating the month entered is invalid
	 */
	public static void checkMonth(int month) throws IOException {
		if(month < 1 || month > 12) {
				throw new IOException("Month is not in the range " +
				"1 to 12");
		}
	}
	
}
