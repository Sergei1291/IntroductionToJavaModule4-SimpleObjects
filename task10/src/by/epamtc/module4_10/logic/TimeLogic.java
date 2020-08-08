package by.epamtc.module4_10.logic;

import by.epamtc.module4_10.bean.Time;

public class TimeLogic {

	private static final TimeLogic instance = new TimeLogic();

	private TimeLogic() {

	}

	public static TimeLogic getInstance() {
		return instance;
	}

	public Time create(int hour, int minute) {

		hour = this.correctHour(hour);
		minute = this.correctMinute(minute);

		return new Time(hour, minute);
	}

	private int correctHour(int hour) {

		if ((hour >= 0) && (hour < 24)) {
			return hour;
		}

		return 0;
	}

	private int correctMinute(int minute) {

		if ((minute >= 0) && (minute < 60)) {
			return minute;
		}

		return 0;
	}

}