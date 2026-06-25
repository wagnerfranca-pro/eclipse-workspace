/*
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
 * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
 * digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] numInt = new int[n];

		int soma = 0;
		int media = 0;
		int cont = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			numInt[i] = sc.nextInt();
			if (numInt[i] % 2 == 0) {
				soma += numInt[i];
				cont++;
				media = soma / cont;
			}
		}
		if (media > 0) {
			System.out.printf("MEDIA DOS PARES = %.1f", (double) media);
		} else {
			System.out.print("NENHUM NUMERO PAR");
		}
		sc.close();
	}
}