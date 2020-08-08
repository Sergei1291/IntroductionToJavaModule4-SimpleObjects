package by.epamtc.module4_07.bean;

public class Triangle {

	private double xPointA;
	private double yPointA;
	private double xPointB;
	private double yPointB;
	private double xPointC;
	private double yPointC;

	{
		xPointA = 0;
		yPointA = 0;

		xPointB = 1;
		yPointB = 0;

		xPointC = 0;
		yPointC = 1;
	}

	public Triangle() {

	}

	public Triangle(double[] coordinates) {

		xPointA = coordinates[0];
		yPointA = coordinates[1];

		xPointB = coordinates[2];
		yPointB = coordinates[3];

		xPointC = coordinates[4];
		yPointC = coordinates[5];

	}

	public double getXPointA() {
		return xPointA;
	}

	public double getYPointA() {
		return yPointA;
	}

	public double getXPointB() {
		return xPointB;
	}

	public double getYPointB() {
		return yPointB;
	}

	public double getXPointC() {
		return xPointC;
	}

	public double getYPointC() {
		return yPointC;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(xPointA);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xPointB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xPointC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yPointA);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yPointB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yPointC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(xPointA) != Double.doubleToLongBits(other.xPointA))
			return false;
		if (Double.doubleToLongBits(xPointB) != Double.doubleToLongBits(other.xPointB))
			return false;
		if (Double.doubleToLongBits(xPointC) != Double.doubleToLongBits(other.xPointC))
			return false;
		if (Double.doubleToLongBits(yPointA) != Double.doubleToLongBits(other.yPointA))
			return false;
		if (Double.doubleToLongBits(yPointB) != Double.doubleToLongBits(other.yPointB))
			return false;
		if (Double.doubleToLongBits(yPointC) != Double.doubleToLongBits(other.yPointC))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [xPointA=" + xPointA + ", yPointA=" + yPointA + ", xPointB="
				+ xPointB + ", yPointB=" + yPointB + ", xPointC=" + xPointC + ", yPointC=" + yPointC + "]";
	}

}