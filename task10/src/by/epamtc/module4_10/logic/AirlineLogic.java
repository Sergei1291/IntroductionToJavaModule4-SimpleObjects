package by.epamtc.module4_10.logic;

import java.util.List;

import by.epamtc.module4_10.bean.Airline;
import by.epamtc.module4_10.bean.Airplane;
import by.epamtc.module4_10.bean.Day;
import by.epamtc.module4_10.bean.Time;

public class AirlineLogic {

	private static final AirlineLogic instance = new AirlineLogic();

	private AirlineLogic() {

	}

	public static AirlineLogic getInstance() {
		return instance;
	}

	public Airline createAirline(String destination, int hour, int minute, List<Day> days, Airplane airplane) {

		TimeLogic timeLogic;
		timeLogic = TimeLogic.getInstance();

		Time time;

		time = timeLogic.create(hour, minute);

		return new Airline(destination, time, days, airplane);
	}

	public boolean isDestination(Airline airline, String destination) {

		if (airline == null) {
			return false;
		}

		if ((airline.getDestination() != null) && (destination != null)) {
			if (airline.getDestination().equals(destination)) {
				return true;
			}
		}

		if ((airline.getDestination() == null) && (destination == null)) {
			return true;
		}

		return false;
	}

	public boolean isDay(Airline airline, Day day) {

		if (airline == null) {
			return false;
		}

		if (airline.getDays() == null) {
			return false;
		}

		if (airline.getDays().contains(day)) {
			return true;
		}

		return false;
	}

	public boolean isAfterTime(Airline airline, Time time) {

		if ((airline == null) || (time == null)) {
			return false;
		}

		Time timeA;

		timeA = airline.getDepartureTime();

		if (timeA == null) {
			return false;
		}

		if (timeA.compareTo(time) >= 0) {
			return true;
		}

		return false;
	}

}