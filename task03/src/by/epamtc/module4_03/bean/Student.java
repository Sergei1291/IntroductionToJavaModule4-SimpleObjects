package by.epamtc.module4_03.bean;

import java.util.Arrays;

public class Student {

	private String surname;
	private int numGroup;
	private int[] marks;

	public Student() {

		surname = null;
		numGroup = 0;
		marks = new int[0];

	}

	public Student(String surname) {

		this.surname = surname;
		numGroup = 0;
		marks = new int[0];

	}

	public Student(String surname, int numGroup, int[] marks) {

		this.surname = surname;
		this.numGroup = numGroup;
		this.marks = marks;

	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getNumGroup() {
		return numGroup;
	}

	public void setNumGroup(int numGroup) {
		this.numGroup = numGroup;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public int getMarks(int index) {
		if ((index >= 0) && (index < marks.length)) {
			return marks[index];
		}
		return -1;
	}

	public void setMarks(int mark, int index) {
		if ((index >= 0) && (index < marks.length)) {
			marks[index] = mark;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + numGroup;
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Student other = (Student) obj;
		if (!Arrays.equals(marks, other.marks))
			return false;
		if (numGroup != other.numGroup)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [surname=" + surname + ", numGroup=" + numGroup + ", marks="
				+ Arrays.toString(marks) + "]";
	}

}