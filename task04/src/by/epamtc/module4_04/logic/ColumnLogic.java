package by.epamtc.module4_04.logic;

import by.epamtc.module4_04.bean.Column;
import by.epamtc.module4_04.bean.Train;

public class ColumnLogic {

	private static final ColumnLogic instance = new ColumnLogic();

	private ColumnLogic() {

	}

	public static ColumnLogic getInstance() {
		return instance;
	}

	public Column createColumn(int num) {

		if (num >= 0) {
			return new Column(num);
		}

		return null;
	}

	public void sortNumMinMax(Column column) {

		if (column == null) {
			return;
		}

		Train[] trains;
		trains = column.getTrains();

		if ((trains == null) || (trains.length == 0)) {
			return;
		}

		int counter = 0;

		for (int i = 0; i < trains.length; i++) {
			if (trains[i] != null) {
				counter++;
			}
		}

		if (counter == 0) {
			return;
		}

		this.moveNullToArraysEnd(trains);
		this.sortTrainsNum(trains, counter);

	}

	public void sortDestinationAZ(Column column) {

		if (column == null) {
			return;
		}

		Train[] trains;
		trains = column.getTrains();

		if ((trains == null) || (trains.length == 0)) {
			return;
		}

		int counter = 0;

		for (int i = 0; i < trains.length; i++) {
			if (trains[i] != null) {
				counter++;
			}
		}

		if (counter == 0) {
			return;
		}

		this.moveNullToArraysEnd(trains);
		this.sortTrainsDepartureTime(trains, counter);
		this.sortTrainsDestinationAZ(trains, counter);

	}

	public Train findTrain(Column column, int num) {

		if (column == null) {
			return null;
		}

		Train[] trains;
		trains = column.getTrains();

		if ((trains == null) || (trains.length == 0)) {
			return null;
		}

		int index = 0;

		while (index < trains.length) {
			if ((trains[index] != null) && (trains[index].getNum() == num)) {
				return trains[index];
			}
			index++;
		}

		return null;
	}

	private void moveNullToArraysEnd(Train[] trains) {

		if (trains == null) {
			return;
		}

		int j = 0;
		Train temp;

		for (int i = 0; i < trains.length; i++) {
			if (trains[i] != null) {
				temp = trains[i];
				trains[i] = null;
				trains[j] = temp;
				j++;
			}
		}

	}

	private void sortTrainsNum(Train[] trains, int counter) {

		int i = 0;
		Train trHelp;

		while ((i + 1) < counter) {
			if (trains[i].getNum() > trains[i + 1].getNum()) {
				trHelp = trains[i];
				trains[i] = trains[i + 1];
				trains[i + 1] = trHelp;

				if (i != 0) {
					i--;
				}
			} else {
				i++;
			}
		}

	}

	private void sortTrainsDepartureTime(Train[] trains, int counter) {

		int min;
		int value;
		int index;
		Train temp;

		for (int i = 0; i < counter; i++) {

			min = trains[i].getDepartureHour() * 60;
			min += trains[i].getDepartureMinute();
			index = i;

			for (int j = i; j < counter; j++) {
				value = trains[j].getDepartureHour() * 60;
				value += trains[j].getDepartureMinute();

				if (value < min) {
					min = value;
					index = j;
				}
			}

			if (i != index) {
				temp = trains[i];
				trains[i] = trains[index];
				trains[index] = temp;
			}
		}

	}

	private void sortTrainsDestinationAZ(Train[] trains, int counter) {

		int i = 0;
		Train trHelp;

		while ((i + 1) < counter) {
			if (trains[i].getDestination().compareTo(trains[i + 1].getDestination()) > 0) {
				trHelp = trains[i];
				trains[i] = trains[i + 1];
				trains[i + 1] = trHelp;

				if (i != 0) {
					i--;
				}
			} else {
				i++;
			}
		}

	}

}