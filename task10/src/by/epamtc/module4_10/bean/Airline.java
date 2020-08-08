package by.epamtc.module4_10.bean;

import java.util.ArrayList;
import java.util.List;

public class Airline {

	private String destination;
	private int flightNum;
	private Time departureTime;
	private List<Day> days;
	private Airplane airplane;

	{
		destination = null;
		flightNum = 0;
		departureTime = new Time();
		days = new ArrayList<Day>();
		airplane = null;
	}

	public Airline() {

	}

	public Airline(String destination, Time departureTime, List<Day> days, Airplane airplane) {

		this.destination = destination;
		this.departureTime = departureTime;
		this.days = days;
		this.airplane = airplane;

	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(int flightNum) {
		this.flightNum = flightNum;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public List<Day> getDays() {
		return days;
	}

	public void setDays(List<Day> days) {
		this.days = days;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public void addDay(Day day) {

		days.add(day);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplane == null) ? 0 : airplane.hashCode());
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (airplane != other.airplane)
			return false;
		if (days == null) {
			if (other.days != null)
				return false;
		} else if (!days.equals(other.days))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNum != other.flightNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [destination=" + destination + ", flightNum=" + flightNum
				+ ", departureTime=" + departureTime + ", days=" + days + ", airplane=" + airplane + "]";
	}

}