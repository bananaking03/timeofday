package timeofday;

/**
 * abstractetoestandsinvariant
 *
 * @invar | 0 <= getHours()
 * @invar | getHours() <= 23
 * @invar | 0 <= getMinutes()
 * @invar | getMinutes() <= 59
 */
class TimeOfDay {
	/**
	 * representatie-invariant
	 * 
	 * @invar | 0 <= hours
	 * @invar | hours <= 23
	 * @invar | 0 <= minutes
	 * @invar | minutes <= 59
	 */
	private int hours;
	private int minutes;
	
	/**
	 * @pre | 0 <= hours
	 * @pre | hours <= 23
	 * @pre | 0 <= minutes
	 * @pre | minutes <= 59
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	TimeOfDay(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	
	int getHours() {
		return hours;
	}
	
	int getMinutes() {
		return minutes;
	}
}
