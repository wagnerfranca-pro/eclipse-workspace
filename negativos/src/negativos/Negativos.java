package negativos;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS:");
		int negativos = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				negativos = vect[i];
				System.out.println(negativos);
			}
		}

		sc.close();
	}
}
