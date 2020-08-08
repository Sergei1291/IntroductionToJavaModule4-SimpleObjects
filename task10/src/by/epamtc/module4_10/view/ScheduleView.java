package by.epamtc.module4_10.view;

import java.util.List;

import by.epamtc.module4_10.bean.Airline;
import by.epamtc.module4_10.bean.Schedule;

public class ScheduleView {

	private static final ScheduleView instance = new ScheduleView();

	private ScheduleView() {

	}

	public static ScheduleView getInstance() {
		return instance;
	}

	public void print(Schedule schedule) {

		if (schedule == null) {
			System.out.println("schedule == null");
			return;
		}

		List<Airline> list;

		list = schedule.getLines();

		if (list == null) {
			System.out.println("list airlines is null");
			return;
		}

		if (list.isEmpty()) {
			System.out.println("list airlines is empty");
			return;
		}

		AirlineView airlineView;
		airlineView = AirlineView.getInstance();

		for (Airline airline : list) {
			airlineView.print(airline);
		}

	}

}