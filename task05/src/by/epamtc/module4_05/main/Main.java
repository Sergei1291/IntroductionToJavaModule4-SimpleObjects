package by.epamtc.module4_05.main;

import by.epamtc.module4_05.bean.Counter;
import by.epamtc.module4_05.logic.CounterLogic;
import by.epamtc.module4_05.view.CounterView;

/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или
 * уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите
 * инициализацию счетчика значениями по умолчанию и произвольными значениями.
 * Счетчик имеет методы увеличения и уменьшения состояния и метод, позволяющий
 * получить его текущее состояние. Написать код, демонстрирующий все возможности
 * класса.
 */

public class Main {

	public static void main(String[] args) {

		CounterLogic counterLogic;
		CounterView counterView;

		counterLogic = CounterLogic.getInstance();
		counterView = CounterView.getInstance();

		Counter counter1;
		counter1 = new Counter(100, 0, 20);

		counterView.printInfo(counter1);
		System.out.println("__________");

		Counter counter2;
		counter2 = counterLogic.createCorrectCounter(100, 0, 20);

		counterView.printInfo(counter2);
		System.out.println("__________");

		counter1 = new Counter();
		counter2 = counterLogic.createCorrectCounter(2, 0, 500);

		for (int i = 0; i < 5; i++) {
			counterLogic.subtract(counter2);
			counterLogic.add(counter1);
		}

		counterView.printInfo(counter1);
		counterView.printInfo(counter2);

	}

}