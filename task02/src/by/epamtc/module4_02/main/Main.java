package by.epamtc.module4_02.main;

import by.epamtc.module4_02.bean.Test2;

/*
 * Создайте класс Test2 двумя переменными. Добавьте конструктор с входными
 * параметрами. Добавьте конструктор, инициализирующий члены класса по
 * умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Main {

	public static void main(String[] args) {

		Test2 test = new Test2();

		System.out.println(test.getValue());
		System.out.println(test.isFlag());

		test.setValue(23);
		test.setFlag(true);

		System.out.println(test.getValue());
		System.out.println(test.isFlag());

	}

}