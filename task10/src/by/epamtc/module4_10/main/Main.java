package by.epamtc.module4_10.main;

import java.util.ArrayList;
import java.util.List;

import by.epamtc.module4_10.bean.Airline;
import by.epamtc.module4_10.bean.Airplane;
import by.epamtc.module4_10.bean.Day;
import by.epamtc.module4_10.bean.Schedule;
import by.epamtc.module4_10.bean.Time;
import by.epamtc.module4_10.logic.AirlineLogic;
import by.epamtc.module4_10.logic.ScheduleLogic;
import by.epamtc.module4_10.view.ScheduleView;

/*
 * Создайте класс Airline, спецификация которого приведена ниже. Определить
 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
 * агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль. Класс Airline:
 * пункт назначения, номер рейса, тип самолета, время вылета, дни недели. Найти
 * и вывести: а) список рейсов для заданного пункта назначения; б) список рейсов
 * для заданного дня недели; в) список рейсов для заданного дня недели, время
 * вылета для которых больше заданного.
 */

public class Main {

	public static void main(String[] args) {

		ScheduleLogic scheduleLogic;
		ScheduleView scheduleView;
		AirlineLogic airlineLogic;

		scheduleLogic = ScheduleLogic.getInstance();
		scheduleView = ScheduleView.getInstance();
		airlineLogic = AirlineLogic.getInstance();

		List<Day> list1 = new ArrayList<Day>();
		list1.add(Day.MONDAY);
		list1.add(Day.FRIDAY);
		list1.add(null);

		List<Day> list2 = new ArrayList<Day>();
		list2.add(Day.MONDAY);
		list2.add(Day.TUESDAY);
		list2.add(Day.WEDNESDAY);
		list2.add(Day.THURSDAY);
		list2.add(Day.FRIDAY);
		list2.add(Day.SATURDAY);
		list2.add(Day.SUNDAY);

		List<Day> list3 = new ArrayList<Day>();
		list3.add(Day.MONDAY);
		list3.add(Day.WEDNESDAY);
		list3.add(Day.SATURDAY);

		List<Day> list4 = new ArrayList<Day>();
		list4.add(Day.SATURDAY);
		list4.add(Day.SUNDAY);

		List<Day> list5 = new ArrayList<Day>();
		list5.add(Day.TUESDAY);
		list5.add(Day.THURSDAY);
		list5.add(Day.SATURDAY);
		list5.add(Day.SUNDAY);

		Airline airline;
		Schedule schedule = new Schedule();

		airline = airlineLogic.createAirline("Minsk", 15, 30, list1, Airplane.IL_96);
		schedule.addLines(airline);

		airline = airlineLogic.createAirline("Moscow", 16, 20, list2, Airplane.IL_96);
		schedule.addLines(airline);

		airline = airlineLogic.createAirline("NY", -2, 70, list3, Airplane.IL_96);
		schedule.addLines(airline);

		airline = airlineLogic.createAirline("Minsk", 0, 0, list4, Airplane.IL_96);
		schedule.addLines(airline);

		airline = airlineLogic.createAirline("Moscow", 3, 20, list5, Airplane.IL_96);
		schedule.addLines(airline);

		airline = airlineLogic.createAirline("NY", 15, 30, null, Airplane.IL_96);
		schedule.addLines(airline);

		airline = airlineLogic.createAirline(null, 16, 20, list1, Airplane.IL_96);
		schedule.addLines(airline);

		airline = airlineLogic.createAirline("Moscow", 22, 20, list5, Airplane.IL_96);
		schedule.addLines(airline);

		System.out.println("Schedule:");
		scheduleView.print(schedule);
		System.out.println("______________________");

		Schedule schedule2;
		String destiantion2;
		destiantion2 = "Minsk";

		schedule2 = scheduleLogic.createDestinationSchedule(schedule, destiantion2);

		System.out.println("Destination " + destiantion2 + " schedule:");
		scheduleView.print(schedule2);
		System.out.println("______________________");

		Schedule schedule3;
		Day day;
		day = Day.THURSDAY;

		schedule3 = scheduleLogic.createDaySchedule(schedule, day);

		System.out.println("Day " + day + " schedule:");
		scheduleView.print(schedule3);
		System.out.println("______________________");

		Schedule schedule4;
		Time time;
		time = new Time(16, 0);

		System.out.println("Schedule after time " + time.getHour() + ":" + time.getMinute());
		schedule4 = scheduleLogic.createAfterTimeSchedule(schedule, time);
		scheduleView.print(schedule4);

	}

}