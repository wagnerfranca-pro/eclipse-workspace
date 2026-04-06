package entities;

public class SalFuncionario {
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;

	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public double IncreaseSalary() { 
		return percentage = (percentage * grossSalary)/100 + NetSalary();  
	}
	
	public String toString() {
		return name
				+ String.format(", $ %.2f ", IncreaseSalary());
	}
}

