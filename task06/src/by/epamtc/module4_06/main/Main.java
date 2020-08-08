package by.epamtc.module4_06.main;

import by.epamtc.module4_06.bean.Clock;
import by.epamtc.module4_06.logic.ClockLogic;
import by.epamtc.module4_06.view.ClockView;

/*
 * Составьте описание класса для представления времени. Предусмотрите
 * возможности установки времени иизменения его отдельных полей (час, минута,
 * секунда) с проверкой допустимости вводимых значений. В случае недопустимого
 * значения поля, поле устанавливается в значение 0. Создать методы изменения
 * времени на заданное количество часов, минут, секунд.
 */

public class Main {

	public static void main(String[] args) {

		ClockLogic clockLogic;
		ClockView clockView;

		clockLogic = ClockLogic.getInstance();
		clockView = ClockView.getInstance();

		Clock clock1;
		Clock clock2;
		Clock clock3;

		clock1 = new Clock(100, 30, 150);
		clock2 = clockLogic.createClock1(100, 30, 150);
		clock3 = clockLogic.createClock2(100, 30, 150);

		clockView.printTime(clock1);
		clockView.printTime(clock2);
		clockView.printTime(clock3);

		System.out.println("1________\n");

		clock1 = new Clock(15, 30, 0);

		clockLogic.addOneSecond(clock1);
		clockLogic.addOneMinute(clock1);
		clockLogic.addOneHour(clock1);

		clockView.printTime(clock1);
		System.out.println("2________\n");

		clockLogic.addHour(clock1, 18);
		clockLogic.addMinute(clock1, 130);
		clockLogic.addSecond(clock1, 59);

		clockView.printTime(clock1);

	}

}