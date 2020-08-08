package by.epamtc.module4_01.main;

import by.epamtc.module4_01.bean.Test1;

/*
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
 * методы изменения этих переменных. Добавьте метод, который находит сумму
 * значений этих переменных, и метод, который находит наибольшее значение из
 * этих двух переменных.
 */

public class Main {

	public static void main(String[] args) {

		int sum;
		int max;

		Test1 test = new Test1();

		test.printValueOne();
		test.printValueTwo();

		test.setValueOne(23);
		test.setValueTwo(45);

		test.printValueOne();
		test.printValueTwo();

		sum = test.findSumValueOneValueTwo();
		System.out.println("sum = " + sum);

		max = test.maxValueOneValueTwo();
		System.out.println("max = " + max);

	}

}