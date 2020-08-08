package by.epamtc.module4_03.main;

import by.epamtc.module4_03.bean.Group;
import by.epamtc.module4_03.bean.Student;
import by.epamtc.module4_03.logic.GroupLogic;
import by.epamtc.module4_03.view.GroupView;

/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер
 * группы, успеваемость (массив из пяти элементов). Создайте массив из десяти
 * элементов такого типа. Добавьте возможность вывода фамилий и номеров групп
 * студентов, имеющих оценки, равные только 9 или 10.
 */

public class Main {

	public static void main(String[] args) {

		GroupLogic grLogic;
		GroupView grView;
		Group group;
		int sizeGroup;

		grLogic = GroupLogic.getInstance();
		grView = GroupView.getInstance();

		Student student1 = new Student("Ryzov V.V.", 2, new int[] { 3, 5, 5, 5, 9 });
		Student student2 = new Student("Petrov V.V.", 3, new int[] { 3, 5, 3, 5, 9 });
		Student student3 = new Student("Sidorov V.V.", 2, new int[] { 10, 10, 10, 10, 10 });
		Student student4 = new Student("Kozlov V.V.", 3, new int[] { 3, 5, 4, 5, 9 });
		Student student5 = new Student("Orlov V.V.", 1, new int[] { 9, 10, 10, 9, 9 });
		Student student6 = new Student("Sergeev V.V.", 1, new int[] { 4, 5, 6, 5, 9 });
		Student student7 = new Student("Mikayan V.V.", 2, new int[] { 7, 5, 5, 5, 9 });
		Student student8 = new Student("Mkrtchan V.V.", 3, new int[] { 10, 10, 10, 8, 10 });
		Student student9 = new Student("Stepanyan V.V.", 3, new int[] { 9, 9, 9, 9, 9 });
		Student student10 = new Student("Ivanov V.V.", 1, new int[] { 4, 10, 8, 5, 9 });

		sizeGroup = 10;
		group = grLogic.createGroup(sizeGroup);

		group.add(student1);
		group.add(student2);
		group.add(student3);
		group.add(student4);
		group.add(student5);
		group.add(student6);
		group.add(student7);
		group.add(student8);
		group.add(student9);
		group.add(student10);

		Group groupExcellentStudents;

		groupExcellentStudents = grLogic.createExcellentSt(group);
		grView.print(groupExcellentStudents);

	}

}