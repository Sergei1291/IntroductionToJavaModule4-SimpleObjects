package by.epamtc.module4_05.view;

import by.epamtc.module4_05.bean.Counter;

public class CounterView {

	private static final CounterView instance = new CounterView();

	private CounterView() {

	}

	public static CounterView getInstance() {
		return instance;
	}

	public void printCounter(Counter counter) {

		if (counter == null) {
			System.out.println("counter == null");
			return;
		}

		System.out.println("Value counter = " + counter.getCounter());

	}

	public void printMax(Counter counter) {

		if (counter == null) {
			System.out.println("counter == null");
			return;
		}

		System.out.println("value max interval's value = " + counter.getMax());

	}

	public void printMin(Counter counter) {

		if (counter == null) {
			System.out.println("counter == null");
			return;
		}

		System.out.println("value min interval's value = " + counter.getMin());

	}

	public void printInfo(Counter counter) {

		if (counter == null) {
			System.out.println("counter == null");
			return;
		}

		this.printCounter(counter);
		this.printMin(counter);
		this.printMax(counter);

	}

}