package studio8;

import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	/*
	 * @Param month month of year
	 * @Param day day in month
	 * @Param year current year
	 * @Param holiday true if it is a holiday false otherwise
	 */
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}
	
	
	// Access
	public int getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public boolean getHoliday() {
		return this.holiday;
	}

	// Setters
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}
	
	public String toString() {
		return "Year: " + this.year + "\n" + "Month: " + this.month + "\n" + "Day: " +this.day + "\n" + "Holiday: " + this.holiday;
	}

    public static void main(String[] args) {
    	Date a = new Date(3, 2, 2004, false);
    	System.out.println(a.toString());
    	
    	Date b = new Date(3, 2, 2004, false);
    	
    	System.out.println(a.equals(b));

    }


	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
