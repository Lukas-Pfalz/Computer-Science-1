/**
 * Problem 2
 */
public class Problem2 {

    public static void main(String[] args) {

        //Create a new CalenderDate object and initialize it to a date
        CalenderDate cd1 = new CalenderDate(2001, 13, 31);

        //Create a new CalenderDate object and initialize it to a date
        CalenderDate cd2 = new CalenderDate(1960, 2, 29);

        //Create a new CalenderDate object and initialize it to a date
        CalenderDate cd3 = new CalenderDate(2001, 3, 31);

        //Check object dates
        System.out.printf("cd1 current date is %s\n", cd1);
        System.out.printf("cd2 current date is %s\n", cd2);
        System.out.printf("cd3 current date is %s\n", cd3);

        //Add days to CalenderDate object
        cd3.addDays(50);
        System.out.printf("cd3 date is %s\n", cd3);

        //Create a new CalenderDate object and initialize it to a date
        CalenderDate cd4 = new CalenderDate(2001, 3, 31);
        cd4.addWeeks(30);
        System.out.println(cd4);

        //Output CalenderDate object to console
        CalenderDate cd5 = new CalenderDate(2001, 3, 31);
        System.out.printf("cd2 is date is %s\n", cd2);
        System.out.printf("Number of days between %s and %s is %d days\n", cd3, cd4, cd3.daysTo(cd4));

        //Check if equal
        String result = cd3.equals(cd5) ? "EQUAL" : "NOT EQUAL";
        System.out.printf("cd3 and cd5 are %s\n", result);
    }
}