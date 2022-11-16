package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	public String toString() {
		return "Date: " + this.date + "\n" + "Time: " + this.time;
	}



	public static void main(String[] args) {
		
		Date a = new Date(3, 2, 2004, false);
    	Date b = new Date(3, 2, 2004, false);
    	Time c = new Time(1, 13, false);
		Time d = new Time(5, 23, false);
		
		Appointment e = new Appointment(a, c);
		Appointment f = new Appointment(b, d);
		
		HashSet<Appointment> set = new HashSet<Appointment>();
		set.add(e);
		set.add(f);
		
		System.out.println(set);
    	
   
		// TODO Auto-generated method stub

	}

}
