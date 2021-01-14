public class ArrayUtilities {
	// make sure program works for array of any size
	
	// double array is initialized
	public static double[] arr;
	public static int len;
			
	public ArrayUtilities(double[] inputArr) {
		ArrayUtilities.arr = inputArr;
		ArrayUtilities.len = inputArr.length;
	}
	
	// calculateTotal
	public static double calculateTotal() {
		double count = 0;
		for(int i = 0; i < len; i++)
			count += arr[i];
		return count;
	}
	
	// calculateAverage
	public static double calculateAverage() {
		return calculateTotal() / (1.0*len);
	}
	
	// calculateLargest
	public static double calculateLargest() {
		double max = arr[0];
		for(int i = 1; i < len; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}
	
	// calculateSmallest
	public static double calculateSmallest() {
		double min = arr[0];
		for(int i = 0; i < len; i++)
			if (arr[i] > min)
				min = arr[i];
		return min;
	}
	
	// calcualteRange
	public static double calculateRange() {
		return calculateLargest() - calculateSmallest();
	}
	
	public void printOutput() {
		// Array Values are Displayed in n x 5 array (5 elements per row)
		for(int i = 0; i < len; i++) {
			// a new line begins after five-elements are entered
			if(i % 5 == 0)
				System.out.println("");
			System.out.printf("%.1f\t", arr[i]);
		}
		// Outputs total, avg, largest, smallest, and range
		System.out.printf("\n\nThere are %d elements in the array.\n", len);
		System.out.printf("The smallest value in the array is: %.1f\n", calculateRange());
		System.out.printf("The largest value in the array is: %.1f\n", calculateLargest());
		System.out.printf("The range of the values in the array is: %.1f\n", calculateRange());
		System.out.printf("The sum of the values in the array ia: %.1f\n", calculateTotal());
		System.out.printf("The average of the values in the array is: %.1f", calculateAverage());
	}
}
