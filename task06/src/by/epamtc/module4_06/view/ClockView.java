package by.epamtc.module4_06.view;

import by.epamtc.module4_06.bean.Clock;

public class ClockView {

	private static final ClockView instance = new ClockView();

	private ClockView() {

	}

	public static ClockView getInstance() {
		return instance;
	}

	public void printTime(Clock clock) {

		if (clock == null) {
			return;
		}

		StringBuilder builder = new StringBuilder();

		builder.append("Time - ");
		builder.append(clock.getHour());
		builder.append(":");
		builder.append(clock.getMinute());
		builder.append(":");
		builder.append(clock.getSecond());

		System.out.println(builder);

	}

}