import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double valor01 = 0.00;
		double valor02 = 0.00;
		double valor03 = 0.00;
		double valor04 = 0.00;

		if (salario > 0.00 && salario <= 2000.00) {
			System.out.println("Isento");

		} else if (salario > 2000.01 && salario <= 4500.00) {
			valor01 = salario - 2000.00; // 3002 - 2000 = 1002
			valor02 = valor01 - 1000.00; // 1002 - 1000 = 2 
			valor03 = valor02 * 0.18; // 2 * 0.18 = 0.36
			valor04 = (salario - 2000.00 - valor02) * 0.08; // 3002 - 2000 - 0.36 = 80
			System.out.printf("R$ %.2f", valor03 + valor04);

		} else {
			valor01 = 1000.00 * 0.08; // 80
			valor02 = 1500.00 * 0.18; // 270
			valor03 = (salario - 4500) * 0.28; // 4520 - 4500 = 5.6
			System.out.printf("R$ %.2f", valor01 + valor02 + valor03);
		}
		sc.close();
	}
}
