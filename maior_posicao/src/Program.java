import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] reais = new double[n];

		for (int i = 0; i < reais.length; i++) {
			System.out.printf("Digite um numero: ");
			reais[i] = sc.nextDouble();
		}
		
		double maiorValor = reais[0];
		int posicao = 0;
		for (int i = 0; i < reais.length; i++) {
			if (reais[i] > maiorValor) {
				maiorValor = reais[i];
				posicao = i;
			}
		}
		System.out.println();
		System.out.println("MAIOR VALOR = " + maiorValor);
		System.out.print("POSICAO DO MAIOR VALOR = " + posicao);
		sc.close();
	}

}
