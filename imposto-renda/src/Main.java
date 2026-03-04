import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double valor01 = 0;
		double imposto01 = 0;
		double imposto02 = 0;
		double imposto03 = 0;

		if (salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario <= 4500.00) {
			valor01 = salario - 3000.00;
			imposto01 = 1000.00 * 0.08;
			imposto02 = valor01 * 0.18;
			System.out.printf("R$ %.2f", imposto01 + imposto02);
		} else {
			valor01 = salario - 4500.00;
			imposto01 = 1000.00 * 0.08;
			imposto02 = 1500.00 * 0.18;
			imposto03 = valor01 * 0.28;
			System.out.printf("R$ %.2f", imposto01 + imposto02 + imposto03);
		}

		sc.close();
	}
}
