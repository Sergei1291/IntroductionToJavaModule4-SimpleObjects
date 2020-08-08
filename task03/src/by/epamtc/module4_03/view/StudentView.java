package by.epamtc.module4_03.view;

import by.epamtc.module4_03.bean.Student;

public class StudentView {

	private static final StudentView instance = new StudentView();

	private StudentView() {

	}

	public static StudentView getInstance() {
		return instance;
	}

	public void printSurname(Student st) {

		if (st == null) {
			System.out.println("student == null");
			return;
		}

		System.out.println("Surname " + st.getSurname());

	}

	public void printNumGroup(Student st) {

		if (st == null) {
			System.out.println("student == null");
			return;
		}

		System.out.println("Group num " + st.getNumGroup());

	}

}