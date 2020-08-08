package by.epamtc.module4_07.view;

import by.epamtc.module4_07.bean.Triangle;
import by.epamtc.module4_07.logic.TriangleLogic;

public class TriangleView {

	private static final TriangleView instance = new TriangleView();

	private TriangleView() {

	}

	public static TriangleView getInstance() {
		return instance;
	}

	public void printInfo(Triangle abc) {

		if (abc == null) {
			System.out.println("null");
			return;
		}

		System.out.printf(
				"Triangle\n[xPointA = %.3f; yPointA = %.3f;\n" + "xPointB = %.3f; yPointB = %.3f;\n"
						+ "xPointC = %.3f; yPointC = %.3f]\n",
				abc.getXPointA(), abc.getYPointA(), abc.getXPointB(), abc.getYPointB(), abc.getXPointC(),
				abc.getYPointC());

	}

	public void printSideLengths(Triangle abc) {

		if (abc == null) {
			System.out.println("null");
			return;
		}

		TriangleLogic triangleLogic;
		triangleLogic = TriangleLogic.getInstance();

		double[] sideLengths;
		sideLengths = triangleLogic.findSideLengths(abc);

		System.out.printf("[AB = %.3f; ", sideLengths[0]);
		System.out.printf("BC = %.3f; ", sideLengths[1]);
		System.out.printf("AC = %.3f]\n", sideLengths[2]);

	}

	public void printSideLengths(double[] sideLengths) {

		if (sideLengths == null) {
			System.out.println("null");
			return;
		}

		if (sideLengths.length == 3) {
			System.out.printf("[AB = %.3f; ", sideLengths[0]);
			System.out.printf("BC = %.3f; ", sideLengths[1]);
			System.out.printf("AC = %.3f]\n", sideLengths[2]);
		}

	}

	public void printPerimeter(Triangle abc) {

		if (abc == null) {
			System.out.println("null");
			return;
		}

		TriangleLogic triangleLogic;
		triangleLogic = TriangleLogic.getInstance();

		double perimeter;
		perimeter = triangleLogic.findPerimeter(abc);

		System.out.printf("Perimeter ABC = %.3f\n", perimeter);

	}

	public void printPerimeter(double perimeter) {

		System.out.printf("Perimeter ABC = %.3f\n", perimeter);

	}

	public void printSquare(Triangle abc) {

		if (abc == null) {
			System.out.println("null");
			return;
		}

		TriangleLogic triangleLogic;
		triangleLogic = TriangleLogic.getInstance();

		double square;
		square = triangleLogic.findSquare(abc);

		System.out.printf("Square ABC = %.3f\n", square);

	}

	public void printSquare(double square) {

		System.out.printf("Square ABC = %.3f\n", square);

	}

	public void printCenterOfGravity(Triangle abc) {

		if (abc == null) {
			System.out.println("null");
			return;
		}

		TriangleLogic triangleLogic;
		triangleLogic = TriangleLogic.getInstance();

		double[] coordinates;
		coordinates = triangleLogic.findCenterOfGravity(abc);

		System.out.printf("X Y Point Intersections Of Medians [%.3f, %.3f]\n", coordinates[0], coordinates[1]);

	}

	public void printCenterOfGravity(double[] coordinates) {

		if (coordinates == null) {
			System.out.println("null");
			return;
		}

		System.out.printf("X Y Point's Intersections Of Medians [%.3f, %.3f]\n", coordinates[0], coordinates[1]);

	}

	public void printAllParameters(Triangle abc) {

		if (abc == null) {
			System.out.println("null");
			return;
		}

		this.printInfo(abc);
		this.printSideLengths(abc);
		this.printPerimeter(abc);
		this.printSquare(abc);
		this.printCenterOfGravity(abc);

	}

}