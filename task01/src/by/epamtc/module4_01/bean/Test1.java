package by.epamtc.module4_01.bean;

public class Test1 {

	private int valueOne;
	private int valueTwo;

	public int getValueOne() {
		return valueOne;
	}

	public void setValueOne(int valueOne) {
		this.valueOne = valueOne;
	}

	public int getValueTwo() {
		return valueTwo;
	}

	public void setValueTwo(int valueTwo) {
		this.valueTwo = valueTwo;
	}

	public void printValueOne() {

		System.out.println("value one = " + valueOne);

	}

	public void printValueTwo() {

		System.out.println("value two = " + valueTwo);

	}

	public int findSumValueOneValueTwo() {

		return valueOne + valueTwo;
	}

	public int maxValueOneValueTwo() {

		if (valueOne >= valueTwo) {
			return valueOne;
		} else {
			return valueTwo;
		}

	}

}