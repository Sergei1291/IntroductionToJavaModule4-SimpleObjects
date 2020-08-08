package by.epamtc.module4_10.bean;

public class Time implements Comparable<Time> {

	private int hour;
	private int minute;

	public Time() {

		hour = 0;
		minute = 0;

	}

	public Time(int hour, int minute) {

		this.hour = hour;
		this.minute = minute;

	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [hour=" + hour + ", minute=" + minute + "]";
	}

	@Override
	public int compareTo(Time time) {
		if (this.hour > time.hour) {
			return 1;
		} else if (this.hour < time.hour) {
			return -1;
		} else if (this.minute > time.minute) {
			return 1;
		} else if (this.minute < time.minute) {
			return -1;
		}

		return 0;
	}

}