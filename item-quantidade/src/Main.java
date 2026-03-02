import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double cod01 = 4.00;
		double cod02 = 4.50;
		double cod03 = 5.00;
		double cod04 = 2.00;
		double cod05 = 1.50;

		double cod = sc.nextDouble();
		int quantidade = sc.nextInt();
		double conta;

		if (cod == 1) {
			conta = cod01 * quantidade;
			System.out.printf("Total: R$ %.2f", conta);
		} else if (cod == 2) {
			conta = cod02 * quantidade;
			System.out.printf("Total: R$ %.2f", conta);
		} else if (cod == 3) {
			conta = cod03 * quantidade;
			System.out.printf("Total: R$ %.2f", conta);
		} else if (cod == 4) {
			conta = cod04 * quantidade;
			System.out.printf("Total: R$ %.2f", conta);
		} else {
			conta = cod05 * quantidade;
			System.out.printf("Total: R$ %.2f", conta);
		}

		sc.close();

	}

}
