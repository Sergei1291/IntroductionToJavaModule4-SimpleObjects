package by.epamtc.module4_04.main;

import java.util.Scanner;

import by.epamtc.module4_04.bean.Column;
import by.epamtc.module4_04.bean.Day;
import by.epamtc.module4_04.bean.Train;
import by.epamtc.module4_04.logic.ColumnLogic;
import by.epamtc.module4_04.view.ColumnView;
import by.epamtc.module4_04.view.TrainView;

/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер
 * поезда, время отправления. Создайте данные в массив из пяти элементов типа
 * Train, добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода информации о поезде, номер которого введен
 * пользователем. Добавьте возможность сортировки массива по пункту назначения,
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по
 * времени отправления.
 */

public class Main {

	public static void main(String[] args) {

		Train train1 = new Train(33, "Minsk", 18, 10, Day.ALL_DAY);
		Train train2 = new Train(20, "Brest", 15, 40, Day.ALL_DAY);
		Train train3 = new Train(46, "Brest", 20, 30, Day.ALL_DAY);
		Train train4 = new Train(3, "Minsk", 9, 55, Day.ALL_DAY);
		Train train5 = new Train(15, "Minsk", 5, 15, Day.ALL_DAY);

		ColumnLogic columnLogic;
		ColumnView columnView;
		TrainView trainView;
		Column column;
		int sizeColumn = 10;

		columnLogic = ColumnLogic.getInstance();
		columnView = ColumnView.getInstance();
		trainView = TrainView.getInstance();
		column = columnLogic.createColumn(sizeColumn);

		column.add(train1);
		column.add(train2);
		column.add(null);
		column.add(train3);
		column.add(train4);
		column.add(null);
		column.add(train5);

		columnView.print(column);

		columnLogic.sortNumMinMax(column);

		System.out.println("\ntrains num min--max");
		columnView.print(column);
		System.out.println("__________\n");

		Train train;
		int number;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("input num train > 0");

			while (!scan.hasNextInt()) {
				scan.next();
				System.out.println("input num train > 0");
			}

			number = scan.nextInt();
		} while (number <= 0);

		train = columnLogic.findTrain(column, number);

		trainView.printInfo(train);
		System.out.println("__________\n");

		columnLogic.sortDestinationAZ(column);

		System.out.println("trains destination A--Z");
		columnView.print(column);

	}

}