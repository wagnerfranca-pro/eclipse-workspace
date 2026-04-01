package entities;

public class ApD_retangulo {

	public double width;
	public double height;

	
	public double area() {
		return width * height;
	}

	public double perimeter() {
		return width * 2 + height * 2;
	}

	public double diagonal() {
		return Math.sqrt(height * height + width * width);
	}

	public String toString() {
		return String.format("Area = %.2f%n", area())
				+ String.format("Perimeter = %.2f%n", perimeter())
				+ String.format("Diagonal = %.2f%n", diagonal());
	}
	
}
