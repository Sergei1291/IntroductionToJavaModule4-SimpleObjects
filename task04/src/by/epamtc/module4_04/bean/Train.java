package by.epamtc.module4_04.bean;

public class Train {

	private int num;
	private String destination;
	private int departureHour;
	private int departureMinute;
	private Day day;

	public Train() {

		num = 0;
		destination = "";
		departureHour = 0;
		departureMinute = 0;
		day = Day.ALL_DAY;

	}

	public Train(int num, String destination, int departureHour, int departureMinute, Day day) {

		this.num = num;
		this.destination = destination;
		this.departureHour = departureHour;
		this.departureMinute = departureMinute;
		this.day = day;

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDepartureHour() {
		return departureHour;
	}

	public void setDepartureHour(int departureHour) {
		this.departureHour = departureHour;
	}

	public int getDepartureMinute() {
		return departureMinute;
	}

	public void setDepartureMinute(int departureMinute) {
		this.departureMinute = departureMinute;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + departureHour;
		result = prime * result + departureMinute;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + num;
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
		Train other = (Train) obj;
		if (day != other.day)
			return false;
		if (departureHour != other.departureHour)
			return false;
		if (departureMinute != other.departureMinute)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [num=" + num + ", destination=" + destination + ", departureHour="
				+ departureHour + ", departureMinute=" + departureMinute + ", day=" + day + "]";
	}

}