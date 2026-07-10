package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Pessoa[] vetorPessoas = new Pessoa[n];

		double menor_altura = 0;
		double maior_altura = 0;
		double soma = 0;
		int cont = 0;
		double media = 0;
		int homens = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Altura da " + (i + 1) + "ª pessoa: ");
			double alturaDigitada = sc.nextDouble();
			System.out.println("Genero da " + (i + 1) + "ª pessoa: ");
			char generoDigitado = sc.next().toLowerCase().charAt(0);

			vetorPessoas[i] = new Pessoa(alturaDigitada, generoDigitado);

			if (i == 0) {
				menor_altura = vetorPessoas[i].getAltura();
				maior_altura = vetorPessoas[i].getAltura();
			} else {
				if (vetorPessoas[i].getAltura() < menor_altura) {
					menor_altura = vetorPessoas[i].getAltura();
				}
				if (vetorPessoas[i].getAltura() > maior_altura) {
					maior_altura = vetorPessoas[i].getAltura();
				}
			}
			if (vetorPessoas[i].getGenero() == 'f') {
				cont++;
				soma += vetorPessoas[i].getAltura();
			}
			if (vetorPessoas[i].getGenero() == 'm') {
				homens++;
			}
		}
		if (cont > 0) {
			media = soma / cont;
		}
		System.out.printf("Menor altura = %.2f%n", menor_altura);
		System.out.printf("Maior altura = %.2f%n", maior_altura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = " + homens);
		sc.close();

	}

}
