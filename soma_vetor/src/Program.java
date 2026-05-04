import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vet = new double[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.printf("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}

		System.out.printf("\nValores: ");
		double valores = 0;
		for (int i = 0; i < vet.length; i++) {
			valores = vet[i];
			System.out.printf(" %.1f ",valores);
		}

		double soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		System.out.printf("\nSoma: %.2f ", soma);
		
		double media = 0;
		for (int i = 0; i < vet.length; i++) {
			media = soma / vet.length;
		}
		System.out.printf("\nMedia: %.2f ", media);
		
		sc.close();
	}

}
