package by.epamtc.module4_04.view;

import by.epamtc.module4_04.bean.Column;
import by.epamtc.module4_04.bean.Train;

public class ColumnView {

	private static final ColumnView instance = new ColumnView();

	private ColumnView() {

	}

	public static ColumnView getInstance() {
		return instance;
	}

	public void print(Column column) {

		if (column == null) {
			System.out.println("column == null");
			return;
		}

		Train[] trains;
		trains = column.getTrains();

		if (trains == null) {
			System.out.println("trains == null");
			return;
		}

		TrainView trView;
		trView = TrainView.getInstance();

		for (Train train : trains) {
			trView.printInfo(train);
		}

	}

}