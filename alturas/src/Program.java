import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		int[] vet = new int[n];
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 1; i <= vet.length; i++) {
			System.out.println("Dados da " + i + "a pessoa:");
			System.out.printf("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.printf("Idade: ");
			idade[i] = sc.nextInt();
			System.out.printf("Altura: ");
			altura[i] = sc.nextDouble();
		}

		double media = 0;
		for (int i = 1; i <= vet.length; i++) {
			media = altura[i] / vet.length;
		}
		System.out.printf("Altura media: %.2f", media);

		double percentual = 0;
		double total = 0;
		for (int i = 1; i <= vet.length; i++) {
			if (idade[i] < 16) {
				percentual = idade[i];
			}
		}

		total = (percentual / 100) * percentual;
		System.out.printf("Pessoas com menos de 16 anos: %.1f", total, "%");
		System.out.println(nome);

		sc.close();
	}

}
