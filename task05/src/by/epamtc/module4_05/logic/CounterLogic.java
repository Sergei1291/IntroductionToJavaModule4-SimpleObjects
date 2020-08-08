package by.epamtc.module4_05.logic;

import by.epamtc.module4_05.bean.Counter;

public class CounterLogic {

	private static final CounterLogic instance = new CounterLogic();

	private CounterLogic() {

	}

	public static CounterLogic getInstance() {
		return instance;
	}

	public Counter createCorrectCounter(int start, int min, int max) {

		boolean flag;
		flag = start >= min;
		flag = flag && (start <= max);
		flag = flag && (min < max);

		if (flag) {
			return new Counter(start, min, max);
		}

		return null;
	}

	public void add(Counter counter) {

		if (counter == null) {
			return;
		}

		int max;
		int counterVal;

		max = counter.getMax();
		counterVal = counter.getCounter();

		if ((counterVal + 1) <= max) {
			counter.add();
		} else {
			counter.setCounter(counter.getMin());
		}

	}

	public void subtract(Counter counter) {

		if (counter == null) {
			return;
		}

		int min;
		int counterVal;

		min = counter.getMin();
		counterVal = counter.getCounter();

		if ((counterVal - 1) >= min) {
			counter.subtract();
		} else {
			counter.setCounter(counter.getMax());
		}

	}

}