package by.epamtc.module4_10.view;

import java.util.List;

import by.epamtc.module4_10.bean.Airline;
import by.epamtc.module4_10.bean.Day;
import by.epamtc.module4_10.bean.Time;

public class AirlineView {

	private static final AirlineView instance = new AirlineView();

	private AirlineView() {

	}

	public static AirlineView getInstance() {
		return instance;
	}

	public void print(Airline airline) {

		if (airline == null) {
			System.out.println("airline == null");
			return;
		}

		System.out.println(this.createInfo(airline));

	}

	private StringBuilder createInfo(Airline airline) {

		StringBuilder builder = new StringBuilder();

		builder.append(airline.getDestination());
		builder.append(" NumFlight - ");
		builder.append(airline.getFlightNum());
		builder.append(". Time: ");
		builder.append(this.createTimeInfo(airline));
		builder.append(". Days:");
		builder.append(this.createDaysInfo(airline));

		return builder;
	}

	private StringBuilder createTimeInfo(Airline airline) {

		Time departureTime;

		departureTime = airline.getDepartureTime();

		if (departureTime == null) {
			return null;
		}

		StringBuilder builder = new StringBuilder();

		if (departureTime.getHour() < 10) {
			builder.append("0");
		}

		builder.append(departureTime.getHour());
		builder.append(":");

		if (departureTime.getMinute() < 10) {
			builder.append("0");
		}

		builder.append(departureTime.getMinute());

		return builder;
	}

	private StringBuilder createDaysInfo(Airline airline) {

		List<Day> days;

		days = airline.getDays();

		if (days == null) {
			return null;
		}

		StringBuilder builder = new StringBuilder();

		for (Day day : days) {

			builder.append(" ");
			builder.append(day);
			builder.append(",");
		}

		if (!days.isEmpty()) {
			builder.delete(builder.length() - 1, builder.length());
		}

		return builder;
	}

}