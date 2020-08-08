package by.epamtc.module4_03.view;

import by.epamtc.module4_03.bean.Group;
import by.epamtc.module4_03.bean.Student;

public class GroupView {

	private static final GroupView instance = new GroupView();

	private GroupView() {

	}

	public static GroupView getInstance() {
		return instance;
	}

	public void print(Group group) {

		if (group == null) {
			System.out.println("group == null");
			return;
		}

		Student[] students;

		students = group.getStudents();

		if (students == null) {
			System.out.println("students == null");
			return;
		}

		if (students.length == 0) {
			System.out.println("Group does not have students");
			return;
		}

		StudentView stView;
		stView = StudentView.getInstance();

		for (Student st : students) {
			stView.printSurname(st);
			stView.printNumGroup(st);
		}

	}

}