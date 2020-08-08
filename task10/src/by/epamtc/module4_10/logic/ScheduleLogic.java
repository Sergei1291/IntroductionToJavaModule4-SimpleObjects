package by.epamtc.module4_10.logic;

import java.util.ArrayList;
import java.util.List;

import by.epamtc.module4_10.bean.Airline;
import by.epamtc.module4_10.bean.Day;
import by.epamtc.module4_10.bean.Schedule;
import by.epamtc.module4_10.bean.Time;

public class ScheduleLogic {

	private static final ScheduleLogic instance = new ScheduleLogic();

	private ScheduleLogic() {

	}

	public static ScheduleLogic getInstance() {
		return instance;
	}

	public Schedule createDestinationSchedule(Schedule schedule, String destination) {

		if (schedule == null) {
			return new Schedule();
		}

		List<Airline> lines;

		lines = schedule.getLines();

		if (lines == null) {
			return new Schedule();
		}

		List<Airline> linesNew = new ArrayList<Airline>();

		AirlineLogic airlineLogic;
		airlineLogic = AirlineLogic.getInstance();

		for (Airline airline : lines) {
			if (airlineLogic.isDestination(airline, destination)) {
				linesNew.add(airline);
			}
		}

		return new Schedule(linesNew);
	}

	public Schedule createDaySchedule(Schedule schedule, Day day) {

		if (schedule == null) {
			return new Schedule();
		}

		List<Airline> lines;

		lines = schedule.getLines();

		if (lines == null) {
			return new Schedule();
		}

		List<Airline> linesNew = new ArrayList<Airline>();

		AirlineLogic airlineLogic;
		airlineLogic = AirlineLogic.getInstance();

		for (Airline airline : lines) {
			if (airlineLogic.isDay(airline, day)) {
				linesNew.add(airline);
			}
		}

		return new Schedule(linesNew);
	}

	public Schedule createAfterTimeSchedule(Schedule schedule, Time time) {

		if ((schedule == null) || (time == null)) {
			return new Schedule();
		}

		List<Airline> lines;

		lines = schedule.getLines();

		if (lines == null) {
			return new Schedule();
		}

		List<Airline> linesNew = new ArrayList<Airline>();

		AirlineLogic airlineLogic;
		airlineLogic = AirlineLogic.getInstance();

		for (Airline airline : lines) {
			if (airlineLogic.isAfterTime(airline, time)) {
				linesNew.add(airline);
			}
		}

		return new Schedule(linesNew);
	}

}