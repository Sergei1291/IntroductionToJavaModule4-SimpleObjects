package by.epamtc.module4_04.logic;

import by.epamtc.module4_04.bean.Day;
import by.epamtc.module4_04.bean.Train;

public class TrainLogic {

	private static final TrainLogic instance = new TrainLogic();

	private TrainLogic() {

	}

	public static TrainLogic getInstance() {
		return instance;
	}

	public Train createTrain(int num, String destination, int departureHour, int departureMinute, Day day) {

		boolean flag;

		flag = num > 0;
		flag = flag && (destination != null);
		flag = flag && (departureHour < 24) && (departureHour >= 0);
		flag = flag && (departureMinute < 60) && (departureMinute >= 0);
		flag = flag && (day != null);

		if (flag) {
			return new Train(num, destination, departureHour, departureMinute, day);
		}

		return null;
	}

}