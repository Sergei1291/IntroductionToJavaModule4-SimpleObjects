package by.epamtc.module4_07.main;

import by.epamtc.module4_07.bean.Triangle;
import by.epamtc.module4_07.logic.TriangleLogic;
import by.epamtc.module4_07.view.TriangleView;

/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания
 * объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class Main {

	public static void main(String[] args) {

		TriangleView triangleView;
		TriangleLogic triangleLogic;

		triangleView = TriangleView.getInstance();
		triangleLogic = TriangleLogic.getInstance();

		Triangle triangleABC;
		triangleABC = triangleLogic.create(2, 3, 60);

		triangleView.printAllParameters(triangleABC);
		System.out.println("__________");

		Triangle abcOne = new Triangle();

		double square;
		square = triangleLogic.findSquare(abcOne);

		triangleView.printSquare(square);
		triangleView.printSquare(abcOne);
		System.out.println("__________");

		double[] coordinatesPoints = new double[] { 1, 3, 1, 7, 2, 7 };

		Triangle abc2;
		abc2 = triangleLogic.create(coordinatesPoints);
		triangleView.printAllParameters(abc2);

	}

}