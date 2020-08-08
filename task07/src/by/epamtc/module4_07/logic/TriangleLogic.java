package by.epamtc.module4_07.logic;

import by.epamtc.module4_07.bean.Triangle;

public class TriangleLogic {

	private static final TriangleLogic instance = new TriangleLogic();

	private TriangleLogic() {

	}

	public static TriangleLogic getInstance() {
		return instance;
	}

	public Triangle create(double length1, double length2, double angle) {

		length1 = (length1 > 0) ? length1 : 1;
		length2 = (length2 > 0) ? length2 : 1;
		angle = ((angle > 0) && (angle < 180)) ? angle : 90;

		double[] coordinates = new double[6];

		coordinates[0] = 0;
		coordinates[1] = 0;

		coordinates[2] = length1;
		coordinates[3] = 0;

		coordinates[4] = length2 * Math.cos(Math.toRadians(angle));
		coordinates[5] = length2 * Math.sin(Math.toRadians(angle));

		return new Triangle(coordinates);
	}

	public Triangle create(double[] coordinates) {

		if (coordinates == null) {
			return null;
		}

		if ((coordinates.length == 6) && checkExistTriangle(coordinates)) {
			return new Triangle(coordinates);
		}

		return null;
	}

	public double[] findSideLengths(Triangle abc) {

		if (abc == null) {
			return null;
		}

		double x;
		double y;
		double[] sideLengths = new double[3];

		x = abc.getXPointA() - abc.getXPointB();
		y = abc.getYPointA() - abc.getYPointB();
		sideLengths[0] = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		x = abc.getXPointB() - abc.getXPointC();
		y = abc.getYPointB() - abc.getYPointC();
		sideLengths[1] = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		x = abc.getXPointA() - abc.getXPointC();
		y = abc.getYPointA() - abc.getYPointC();
		sideLengths[2] = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		return sideLengths;
	}

	public double findPerimeter(Triangle abc) {

		if (abc == null) {
			return 0;
		}

		double perimeter = 0.;
		double[] sideLengths;

		sideLengths = this.findSideLengths(abc);

		for (int i = 0; i < sideLengths.length; i++) {
			perimeter = perimeter + sideLengths[i];
		}

		return perimeter;
	}

	public double findSquare(Triangle abc) {

		if (abc == null) {
			return 0;
		}

		double[] sideLengths;
		double perimeter;
		double halfPer;
		double square;

		sideLengths = this.findSideLengths(abc);
		perimeter = this.findPerimeter(abc);
		halfPer = 0.5 * perimeter;

		square = Math
				.sqrt(halfPer * (halfPer - sideLengths[0]) * (halfPer - sideLengths[1]) * (halfPer - sideLengths[2]));

		return square;
	}

	public double[] findCenterOfGravity(Triangle abc) {

		if (abc == null) {
			return null;
		}

		double[] coordinates = new double[2];

		double xMiddleAB;
		double yMiddleAB;

		xMiddleAB = (abc.getXPointA() + abc.getXPointB()) * 0.5;
		yMiddleAB = (abc.getYPointA() + abc.getYPointB()) * 0.5;

		if (abc.getXPointC() >= xMiddleAB) {
			coordinates[0] = xMiddleAB + (abc.getXPointC() - xMiddleAB) / 3;
		} else {
			coordinates[0] = xMiddleAB - (xMiddleAB - abc.getXPointC()) / 3;
		}

		if (abc.getYPointC() >= yMiddleAB) {
			coordinates[1] = yMiddleAB + (abc.getYPointC() - yMiddleAB) / 3;
		} else {
			coordinates[1] = yMiddleAB - (yMiddleAB - abc.getYPointC()) / 3;
		}

		return coordinates;
	}

	private boolean checkExistTriangle(double[] coordinates) {

		double result;
		double x1 = coordinates[0];
		double x2 = coordinates[2];
		double x3 = coordinates[4];
		double y1 = coordinates[1];
		double y2 = coordinates[3];
		double y3 = coordinates[5];

		if (((x1 == x2) && (y1 == y2)) || ((x1 == x3) && (y1 == y3)) || ((x2 == x3) && (y2 == y3))) {
			return false;
		} else {
			result = (x3 - x1) * (y2 - y1) - (y3 - y1) * (x2 - x1);
			return result != 0;
		}

	}

}