import java.io.IOException;

public class DayException {
	/**
	 * The checkDay exception method checks if the day entered
	 * by the user is in-range for the days of the user-entered month.
	 * If the day isn't within 1-28 for February or 1-31 for any other
	 * month, the IOException 'throws' the message stating the day is
	 * invalid
	 * @param month - The month (integer) entered by the user
	 * @param day - The day (integer) entered by the user
	 * @throws IOException - A message stating the day entered is invalid
	 */
	public static void checkDay(int month, int day) throws IOException {
		boolean outOfRangeDays_Feb = month == 2 && day > 28;
		boolean outOfRangeDays = month != 2 && day > 31;
		if(day < 1 || outOfRangeDays_Feb || outOfRangeDays) {
			throw new IOException("Day is not valid for this month");
		}
	}
}
