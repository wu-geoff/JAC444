
public class Triangle extends GeometricObject {
	private double side1, side2, side3;

	public Triangle() {
		side1 = side2 = side3 = 1.0;
	}

	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		if( side1 + side2 < side3 ||
			side2 + side3 < side1 ||
			side1 + side3 < side2) {
			throw new IllegalTriangleException("In a triangle, the sum of any two sides must be greater than the other side.");
		}
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

	@Override
	public double getArea() {
		double p = getPerimeter() / 2;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

}
