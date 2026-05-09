
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] num = new int[n];

		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextInt();

		}

		System.out.println("\nNUMEROS PARES:");

		int qtd_par = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.printf("%d  ", num[i]);
				qtd_par += 1;
			}
		}

		System.out.printf("\n\nQUANTIDADE DE PARES = " + qtd_par);

		sc.close();
	}
}
