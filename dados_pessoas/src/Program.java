import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		double menor_altura = 0;
		double maior_altura = 0;
		double soma = 0;
		int cont = 0;
		double media = 0;
		int homens = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Altura da " + (i + 1) + "ª pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.println("Genero da " + (i + 1) + "ª pessoa:");
			genero[i] = sc.next().toLowerCase().charAt(0);
		}
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				menor_altura = altura[i];
				maior_altura = altura[i];
			} else {
				if (altura[i] < menor_altura) {
					menor_altura = altura[i];
				}
				if (altura[i] > maior_altura) {
					maior_altura = altura[i];
				}
			}
			if (genero[i] == 'f') {
				cont++;
				soma += altura[i];
			}
			if (genero[i] == 'm') {
				homens++;
			}
		}
		if (cont > 0) {
			media = soma / cont;
		}
		System.out.println("Menor altura = " + menor_altura);
		System.out.println("Maior altura = " + maior_altura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = " + homens);
		sc.close();
	}
}
