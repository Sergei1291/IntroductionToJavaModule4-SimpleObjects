package by.epamtc.module4_04.bean;

import java.util.Arrays;

public class Column {

	private Train[] trains;
	private int numBusyPlaces;

	public Column() {

		trains = new Train[0];
		numBusyPlaces = 0;

	}

	public Column(int size) {

		trains = new Train[size];
		numBusyPlaces = 0;

	}

	public Train[] getTrains() {
		return trains;
	}

	public void setTrains(Train[] trains) {
		this.trains = trains;
	}

	public Train getTrains(int index) {
		if ((index >= 0) && (index < trains.length)) {
			return trains[index];
		}

		return null;
	}

	public void setTrains(Train train, int index) {
		if ((index >= 0) && (index < trains.length)) {
			trains[index] = train;
		}
	}

	public int getNumBusyPlaces() {
		return numBusyPlaces;
	}

	public void setNumBusyPlaces(int numBusyPlaces) {
		this.numBusyPlaces = numBusyPlaces;
	}

	public void add(Train train) {
		trains[numBusyPlaces] = train;
		numBusyPlaces++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numBusyPlaces;
		result = prime * result + Arrays.hashCode(trains);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Column other = (Column) obj;
		if (numBusyPlaces != other.numBusyPlaces)
			return false;
		if (!Arrays.equals(trains, other.trains))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [trains=" + Arrays.toString(trains) + ", numBusyPlaces="
				+ numBusyPlaces + "]";
	}

}