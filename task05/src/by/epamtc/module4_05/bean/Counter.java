package by.epamtc.module4_05.bean;

public class Counter {

	private int counter;
	private int min;
	private int max;

	public Counter() {

		counter = 0;
		min = 0;
		max = 1000;

	}

	public Counter(int start, int min, int max) {

		counter = start;
		this.min = min;
		this.max = max;

	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public void add() {
		counter++;
	}

	public void subtract() {
		counter--;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + counter;
		result = prime * result + max;
		result = prime * result + min;
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
		Counter other = (Counter) obj;
		if (counter != other.counter)
			return false;
		if (max != other.max)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [counter=" + counter + ", min=" + min + ", max=" + max + "]";
	}

}