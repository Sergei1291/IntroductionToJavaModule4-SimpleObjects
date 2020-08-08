package by.epamtc.module4_04.view;

import by.epamtc.module4_04.bean.Train;

public class TrainView {

	private static final TrainView instance = new TrainView();

	private TrainView() {

	}

	public static TrainView getInstance() {
		return instance;
	}

	public void printInfo(Train train) {

		if (train == null) {
			System.out.println("train == null");
			return;
		}

		System.out.println(this.createInfo(train));

	}

	private StringBuilder createInfo(Train train) {

		StringBuilder builder = new StringBuilder();

		builder.append("Train num: ");
		builder.append(train.getNum());
		builder.append(" destination: ");
		builder.append(train.getDestination());
		builder.append(" departure time ");
		builder.append(train.getDepartureHour());
		builder.append(":");
		builder.append(train.getDepartureMinute());
		builder.append(" Day: ");
		builder.append(train.getDay());

		return builder;
	}

}