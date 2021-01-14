import java.text.DecimalFormat;

/**
//***********************************************************************
'Project: Assignment #4
'Programmer: Lukas Helmut Pfalz
'Company Info:  lhpfalz@mymail.csmd.edu  
'Date: 11 03 2020
'Description:  Problem Number #2.  
'    
'   The Class 'CalenderDate' can modify and instance's 
'   date, or compare it's date to another instance's date
'   '
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

public class CalenderDate {
	// Decimal Format initialized
	// Format for months/days
	DecimalFormat mdf = new DecimalFormat("00");
	// Format for years
	DecimalFormat yrf = new DecimalFormat("0000");
	
	// Date-values initialized
	private int year, month, day;
	
	private int[] days_per_month = {31, 28, 31, 30, 31, 31, 30, 31, 
	                                30, 31, 30, 31};
			
	// constructor (year, month, day)
	public CalenderDate (int year, int month, int day) {
		/*
		boolean day_valid = month > 0 && month < 32;
		boolean month_valid = month > -1 && month < 12;
		boolean year_valid = year > 0;
		// boolean valid = day_valid && month_valid && year_valid;
		*/
		boolean valid = true;
		if (valid) {
			this.year = year;
			this.month = month;
			this.day = day;
		}
		else {
			System.out.println("The date you have entered is invalid, "
					+ " the date will be changed to 01/01/0001");
			this.year = 1;
			this.month = 1;
			this.day = 1;
		}
		// If the CalenderDate is not valid (i.e. month is 1, day is 1,
		// and year is 1) then return -1		
	}
	
	// addDays - takes in days as a parameter that moves this class
	// object forward in time by the given number of days.
	public void addDays(int days) {
		// Moves days into the next month
		days -= days_per_month[this.month];
		this.day = 1;

		// Adds Months
		while (days > days_per_month[this.month]) {
			days -= days_per_month[this.month];
			this.month ++;
			// If month exceed 11, date goes into next year
			if (this.month > 11) {
				this.year ++;
				this.month = 1;
			}
		}
		
		// Adds Days left
		this.day += days;
	}
	
	// addWeeks – takes in a parameter called weeks that moves
	// this object forward in time by the given number of seven-
	// day weeks.
	public void addWeeks(int weeks) {
		// convert the weeks to a number of days
		int days = weeks * 7;
		// add-days can be used to calculate the new calender-date
		this.addDays(days);
	}
	
	// daysTo - takes in an object of type CalenderDate that
	// returns the number of days that this CalenderDate must be
	// adjusted to make it equal to to the given other CalenderDate.
	public int daysTo(CalenderDate cd) {
		// if the date is invalid
		if (this.month == 1 && this.day == 1 && this.year == 1)
			return -1;
		
		// Is this year higher than year of CalenderDate 'cd'?
		boolean higher_yr = this.year >= cd.getYear();
		// Is this month higher than month of CalenderDate 'cd'?
		boolean higher_mon = this.month >= cd.getMonth();
		// Is this day higher than day of CalenderDate 'cd'?
		boolean higher_dy = this.day >= cd.getDay();
		
		CalenderDate init_date, final_date;
		
		if(higher_yr && higher_mon && higher_dy) {
			final_date = new CalenderDate(this.getYear(),this.getMonth(),
					this.getDay());
			init_date = new CalenderDate(cd.getYear(), cd.getMonth(),
					cd.getDay());
		}
		else {
			init_date = new CalenderDate(this.getYear(), this.getMonth(),
					this.getDay());
			final_date = new CalenderDate(cd.getYear(), cd.getMonth(),
					cd.getDay());
		}
			
		// 'daysTo' is counter for days from 'initial' date to the next date
		int daysTo = 0;
		/*
		while (!init_date.equals(final_date)){
			if(init_date.getMonth() < final_date.getMonth()) {
				init_date.addDays(days_per_month[init_date.getMonth()]);
				daysTo += days_per_month[init_date.getMonth()];
			}
			else {
				init_date.addDays(final_date.getDay());
				daysTo += final_date.getDay();
			}
		}
		/*
		*/
		// Return the daysTo between Calender-Dates
		return daysTo;
	}
	
	// getDay - returns the day value of this date
	public int getDay() {
		return day;
	}
	
	// getMonth - returns the month value of this date
	public int getMonth() {
		return month;
	}
	
	// getYear - returns the year value of this date
	public int getYear() {
		return year;
	}
	
	// isLeapYear - returns true if the year of this date is a leap
	// year. A leap year occurs every four years, except for multiples
	// of 100 that are not multiples of 400.
	public boolean isLeapYear() {
		// checks if year is a multiple of four
		boolean fourth_year = this.year % 4 == 0;
		
		// Not a leap year if the year is a multiple of 100
		boolean hundred_yr_except = this.year % 100 != 0;
		// with the exception for years in multiples of 400
		boolean four_hundredth_yr = this.year % 400 == 0;
		// exception for 'leap-year' is determined
		boolean exception = hundred_yr_except || four_hundredth_yr;
		
		// fourth_year and hundredth-year-exceptions determine if the
		// year is a leap year
		return fourth_year && exception;
	}
	
	// equals – takes in an object of type CalenderDate and returns true
	// when the both CalenderDates are the same (i.e. month, day, and
	// year are equal)
	public boolean equals(CalenderDate cd) {
		// Returns False immediately if a single value
		// of both dates are unequal
		if(this.year != cd.getYear())
			return false;
		if(this.month != cd.getMonth())
			return false;
		if(this.day != cd.getDay())
			return false;
		// returns true if both-dates have the same
		// year, month, and day
		return true;
	}
	
	// toString - returns a String representation of this date in
	// year/month/day
	public String toString() {
		// Format so 'date' & 'month' are displayed as two-digits
		// (ex: 07, 22)
		System.out.printf("%s/%s/%s", yrf.format(this.year),
				mdf.format(this.month), mdf.format(this.day));
		return "";
	}
}
