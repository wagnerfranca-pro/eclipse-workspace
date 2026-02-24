import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double code_a = sc.nextDouble();
		double quant_a = sc.nextDouble();
		double valor_a = sc.nextDouble();

		double code_b = sc.nextDouble();
		double quant_b = sc.nextDouble();
		double valor_b = sc.nextDouble();

		code_a = quant_a * valor_a;
		code_b = quant_b * valor_b;

		System.out.printf("Valor a pagar: R$ %.2f", code_a + code_b);

		sc.close();

	}

}
