package by.epamtc.module4_03.logic;

import by.epamtc.module4_03.bean.Student;

public class StudentLogic {

	private static final StudentLogic instance = new StudentLogic();

	private StudentLogic() {

	}

	public static StudentLogic getInstance() {
		return instance;
	}

	public boolean isStudent910(Student student) {

		if (student == null) {
			return false;
		}

		int i = 0;
		int[] marks;

		marks = student.getMarks();

		if (marks == null) {
			return false;
		}

		while (i < marks.length) {
			if (!((marks[i] == 9) || (marks[i] == 10))) {
				return false;
			}
			i++;
		}

		return true;
	}

}