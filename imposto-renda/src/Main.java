import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double imposto01 = 0;
		double imposto02 = 0;
		double imposto03 = 0;

		if (salario > 0.00 && salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario > 2000.01 && salario <= 3000.00) {
			imposto01 = ((salario) - (3000.00)) * 0.08;
			System.out.printf("R$ %.2f", imposto01);
		} else if (salario > 3000.01 && salario <= 4500.00) {
			imposto01 = 1000.00 * 0.08;
			imposto02 = (4500.00-salario) * 0.18;
			System.out.printf("R$ %.2f", imposto01 +  imposto02);
		} else if (salario > 4500.00) {
			imposto03 = ((4500.00) - (salario)) * 0.28;
			System.out.printf("R$ %.2f", imposto03);
		}
		sc.close();
	}
}
