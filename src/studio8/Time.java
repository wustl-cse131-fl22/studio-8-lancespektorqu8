package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {
	private int minute;
	private int hour;
	private boolean format;
	
	/*
	 * @Param minute of the time
	 * @Param hour of the time
	 */
	public Time(int minute, int hour, boolean format) {
		this.minute = minute;
		this.hour = hour;
		this.format = format;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getHour() {
		return this.hour;
	}

	public boolean getFormat() {
		return this.format;
	}
	
	public void setMintue(int mintue) {
		this.minute = mintue;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void setFormat(boolean format) {
		this.format = format;}
		
	public String toString() {
		
			if (this.format == true && this.hour > 12) {
				return "Time: " + (this.hour-12) + ":" + this.minute + "\n" ;
			}
			else return "Time: " + this.hour + ":" + this.minute + "\n";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
	
	

	public static void main(String[] args) {
		Time a = new Time(1, 2, true);
		
		Time b = new Time(13,13,true);
		
		Time c = new Time(1, 13, false);
		
		Time d = new Time(5, 23, false);
		
		Time e = new Time(6, 12, true);
		
		LinkedList<Time> list = new LinkedList<Time>();
		list.add(a);
		list.add(a);
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		System.out.println(list);
		
		HashSet<Time> set = new HashSet<Time>();
		set.add(a);
		set.add(a);
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
		System.out.println(set);
		 
    	
    }

}