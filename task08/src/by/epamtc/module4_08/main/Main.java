package by.epamtc.module4_08.main;

import by.epamtc.module4_08.bean.Customer;
import by.epamtc.module4_08.bean.Group;
import by.epamtc.module4_08.logic.GroupLogic;
import by.epamtc.module4_08.view.GroupView;

/*
 * Создайте класс Customer, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
 * агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль. Класс
 * Customer: id, фамилия, имя отчество, адрес, номер кредитной карты, номер
 * банковского счета. Найти и вывести: а) список покупателей в алфавитном
 * порядке; б) список покупателей, у которых номер кредитной карты находится в
 * заданном интервале.
 */

public class Main {

	public static void main(String[] args) {

		GroupLogic groupLogic;
		GroupView viewGroup;

		groupLogic = GroupLogic.getInstance();
		viewGroup = GroupView.getInstance();

		Customer[] customersArr = new Customer[30];

		customersArr[0] = new Customer("Kot", "Aleksandr", "Ivanov");
		customersArr[1] = new Customer("Ivanov", "Ivan", "");
		customersArr[2] = new Customer("Sidorov", "Ivan", "");
		customersArr[3] = new Customer("Sergeev", "Maksim", "");
		customersArr[4] = new Customer("Ivanov", "Sergei", "");

		customersArr[5] = new Customer(null, "Ivan", "");
		customersArr[6] = new Customer("Mkrtchan", "Ashot", "");
		customersArr[7] = new Customer("Frolov", "Ivan", "");
		customersArr[8] = new Customer("Karpov", "Armen", "");
		customersArr[9] = new Customer("Kot", "Aleksandr", null);

		customersArr[10] = new Customer("Peskov", "Aleksandr", "");
		customersArr[11] = new Customer("Kozlov", "Petr", "");
		customersArr[12] = new Customer("Oslov", "Vasya", "");
		customersArr[13] = new Customer("Frolov", "Artur", "");
		customersArr[14] = new Customer("Kotov", "Kazimir", "");

		customersArr[15] = new Customer("Kot", null, "");
		customersArr[16] = new Customer("Orlov", "Valentin", "");
		customersArr[17] = new Customer("Leps", "Ivan", "");
		customersArr[18] = new Customer("Kot", "Aleksandr", "Ivanovich");
		customersArr[19] = new Customer("Karpov", "Sergei", "");

		customersArr[20] = new Customer("Okynev", "Ivan", "");

		customersArr[25] = new Customer(null, "Ivan", "Slava");
		customersArr[27] = new Customer();

		customersArr[23] = new Customer("Zaycev", "Ilya", "");
		customersArr[24] = new Customer("Kot", null, null);

		long a;

		for (int i = 0; i < customersArr.length; i++) {
			a = (long) (9999_9999_9999_9999L * Math.random());
			if (customersArr[i] != null) {
				customersArr[i].setNumCard(a);
			}
		}

		Group group = new Group();

		for (int i = 0; i < customersArr.length; i++) {
			group.add(customersArr[i]);
		}

		viewGroup.print(group);
		System.out.println("__________________________");

		groupLogic.sortAZ(group);

		viewGroup.print(group);
		System.out.println("__________________________");

		Group newGroup;

		newGroup = groupLogic.createGroupHaveNumCard(100_0000_0000_0000L, 1000_0000_0000_0000L, group);

		viewGroup.print(newGroup);

	}

}