/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] numReais = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite o numero: ");
			numReais[i] = sc.nextDouble();
		}

		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += numReais[i];
		}
		System.out.println();
		double mediaNum = soma / n;
		System.out.printf("Media  do vetor = %.3f", mediaNum);
		System.out.println();
		System.out.println("Elementos abaixo da media:");
		for (int i = 0; i < n; i++) {
			if (numReais[i] < mediaNum) {
				System.out.println(numReais[i]);
			}
		}

		sc.close();

	}

}
