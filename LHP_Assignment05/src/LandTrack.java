
public class LandTrack {
	
	// Class variables length & width initialized
	public int length, width, area;
	
	/**
	 * Constructor defines the length and width of 
	 * @param l - length of 'LandTrack' instance
	 * @param w - width of 'LandTrack' instance
	 */
	public LandTrack(int l, int w) {
		// length & width are defined for the constructor
		length = l;
		width = w;
		// Area variable defined using 
		area = l * w;
	}
	
	/**
	 * The getArea method returns the area of LandTrack
	 * instances
	 * @return area of the LandTrack
	 */
	public int getArea() {
		return area;
	}
	
	/**
	 * The equals method compares the objects size
	 * by comparing their dimensions
	 * @param lt - compared LandTrack instance
	 * @return boolean stating if the LandTrack instances
	 * have equal dimensions (length & width)
	 */
	public boolean equals(LandTrack lt) {
		 boolean equalLength, equalWidth;
		 equalLength = length == lt.length;
		 equalWidth = width == lt.width;
		 return equalLength && equalWidth;
	}
	
	/**
	 * The toString method returns a string describing
	 * the length, width, and area of the LandTrack
	 * instance
	 * @return str - String displaying the length,
	 * width, and area of a LandTrack instance
	 */
	public String toString() {
		String str;
		str = "This land track has a length of " + 
				length + ", width of " + width +
				", and an area of " + area;
		return str;
	}
}
