import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int duracao;

		if (inicio > fim) {
			duracao = 24 - inicio + fim;
			System.out.printf("O jogo durou %d hora(s)", duracao);
		} else if (inicio == fim) {
			System.out.printf("O jogo durou 24 hora(s)");
		} else {
			duracao = fim - inicio;
			System.out.printf("O jogo durou %d hora(s)", duracao);
		}

		sc.close();

	}

}
