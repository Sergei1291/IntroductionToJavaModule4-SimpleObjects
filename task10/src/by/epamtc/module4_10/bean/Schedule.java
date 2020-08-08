package by.epamtc.module4_10.bean;

import java.util.ArrayList;
import java.util.List;

public class Schedule {

	private List<Airline> lines;

	public Schedule() {

		lines = new ArrayList<Airline>();

	}

	public Schedule(List<Airline> lines) {

		this.lines = lines;

	}

	public List<Airline> getLines() {
		return lines;
	}

	public void setLines(List<Airline> lines) {
		this.lines = lines;
	}

	public Airline getLines(int index) {
		return lines.get(index);
	}

	public void setLines(Airline line, int index) {
		lines.set(index, line);
	}

	public void addLines(Airline line) {
		lines.add(line);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lines == null) ? 0 : lines.hashCode());
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
		Schedule other = (Schedule) obj;
		if (lines == null) {
			if (other.lines != null)
				return false;
		} else if (!lines.equals(other.lines))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [lines=" + lines + "]";
	}

}