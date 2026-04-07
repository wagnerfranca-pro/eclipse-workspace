package entities;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double mediafinal;

	public double Media() {
		return this.mediafinal = (nota1 + nota2 + nota3);
	}

	public String resultado() {

		if (Media() > 60) {
			return String.format("Final Grade = %.2f", Media()) 
					+ String.format("%nPass");
		} else {
			return String.format("Final Grade = %.2f", Media()) 
					+ String.format("%nFailed")
					+ String.format("%nMissing %.2f points", 60 - Media());
		}
	}
}
