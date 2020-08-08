package by.epamtc.module4_03.logic;

import by.epamtc.module4_03.bean.Group;
import by.epamtc.module4_03.bean.Student;

public class GroupLogic {

	private static final GroupLogic instance = new GroupLogic();

	private GroupLogic() {

	}

	public static GroupLogic getInstance() {
		return instance;
	}

	public Group createGroup(int num) {

		if (num >= 0) {
			return new Group(num);
		}

		return null;
	}

	public Group createExcellentSt(Group group) {

		if (group == null) {
			return null;
		}

		Group group910;
		int numExcellentSt;

		numExcellentSt = this.findNumExcellentSt(group);
		group910 = new Group(numExcellentSt);

		this.initializeExcellentSt(group910, group);

		return group910;
	}

	private int findNumExcellentSt(Group group) {

		int numExcellentSt = 0;
		StudentLogic stLogic;
		Student[] students;

		stLogic = StudentLogic.getInstance();
		students = group.getStudents();

		if (students == null) {
			return 0;
		}

		for (Student student : students) {

			if (stLogic.isStudent910(student)) {
				numExcellentSt++;
			}
		}

		return numExcellentSt;
	}

	private void initializeExcellentSt(Group group910, Group group) {

		StudentLogic stLogic;
		Student[] students;

		stLogic = StudentLogic.getInstance();
		students = group.getStudents();

		if (students == null) {
			return;
		}

		for (Student student : students) {

			if (stLogic.isStudent910(student)) {
				group910.add(student);
			}
		}

	}

}