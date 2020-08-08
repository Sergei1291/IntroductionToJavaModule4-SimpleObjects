package by.epamtc.module4_06.logic;

import by.epamtc.module4_06.bean.Clock;

public class ClockLogic {

	private static final ClockLogic instance = new ClockLogic();

	private ClockLogic() {

	}

	public static ClockLogic getInstance() {
		return instance;
	}

	public Clock createClock1(int hour, int minute, int second) {

		boolean flag;
		flag = (hour < 24) && (hour >= 0);
		flag = flag && ((minute < 60) && (minute >= 0));
		flag = flag && ((second < 60) && (second >= 0));

		if (flag) {
			return new Clock(hour, minute, second);
		}

		return new Clock();
	}

	public Clock createClock2(int hour, int minute, int second) {

		if ((hour >= 24) || (hour < 0)) {
			hour = 0;
		}

		if ((minute >= 60) || (minute < 0)) {
			minute = 0;
		}

		if ((second >= 60) || (second < 0)) {
			second = 0;
		}

		return new Clock(hour, minute, second);
	}

	public void addSecond(Clock clock, int second) {

		if (clock == null) {
			return;
		}

		if ((clock.getSecond() + second) >= 60) {
			this.addMinute(clock, (clock.getSecond() + second) / 60);
			clock.setSecond((clock.getSecond() + second) % 60);
		} else {
			clock.setSecond(clock.getSecond() + second);
		}

	}

	public void addMinute(Clock clock, int minute) {

		if (clock == null) {
			return;
		}

		if ((clock.getMinute() + minute) >= 60) {
			this.addHour(clock, ((clock.getMinute() + minute) / 60));
			clock.setMinute((clock.getMinute() + minute) % 60);
		} else {
			clock.setMinute(clock.getMinute() + minute);
		}

	}

	public void addHour(Clock clock, int hour) {

		if (clock == null) {
			return;
		}

		clock.setHour((clock.getHour() + hour) % 24);

	}

	public void addOneSecond(Clock clock) {

		if (clock == null) {
			return;
		}

		if ((clock.getSecond() + 1) == 60) {
			this.addOneMinute(clock);
			clock.setSecond(0);
		} else {
			clock.setSecond(clock.getSecond() + 1);
		}

	}

	public void addOneMinute(Clock clock) {

		if (clock == null) {
			return;
		}

		if ((clock.getMinute() + 1) == 60) {
			this.addOneHour(clock);
			clock.setMinute(0);
		} else {
			clock.setMinute(clock.getMinute() + 1);
		}

	}

	public void addOneHour(Clock clock) {

		if (clock == null) {
			return;
		}

		clock.setHour((clock.getHour() + 1) % 24);

	}

}