package by.epamtc.module4_03.bean;

import java.util.Arrays;

public class Group {

	private Student[] students;
	private int numBusyPlaces;

	public Group() {

		students = new Student[0];
		numBusyPlaces = 0;

	}

	public Group(int size) {

		students = new Student[size];
		numBusyPlaces = 0;

	}

	public Student[] getStudents() {
		return students;
	}

	public void setSrudents(Student[] students) {
		this.students = students;
	}

	public Student getStudents(int index) {
		if ((index >= 0) && (index < students.length)) {
			return students[index];
		}
		return null;
	}

	public void setStudents(Student student, int index) {
		if ((index >= 0) && (index < students.length)) {
			students[index] = student;
		}
	}

	public int getNumBusyPlaces() {
		return numBusyPlaces;
	}

	public void setNumBusyPlaces(int numBusyPlaces) {
		this.numBusyPlaces = numBusyPlaces;
	}

	public void add(Student student) {
		students[numBusyPlaces] = student;
		numBusyPlaces++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numBusyPlaces;
		result = prime * result + Arrays.hashCode(students);
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
		Group other = (Group) obj;
		if (numBusyPlaces != other.numBusyPlaces)
			return false;
		if (!Arrays.equals(students, other.students))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [students=" + Arrays.toString(students) + ", numBusyPlaces="
				+ numBusyPlaces + "]";
	}

}