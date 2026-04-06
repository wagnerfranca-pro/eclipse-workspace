/*

|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário.

|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

Exemplo:
Name: Joao Silva
Gross salary: 6000.00
Tax: 1000.00
Employee: Joao Silva, $ 5000.00
Which percentage to increase salary? 10.0
Updated data: Joao Silva, $ 5600.00

|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.SalFuncionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Name: ");
		SalFuncionario salFuncionario = new SalFuncionario();
		salFuncionario.name = sc.next();

		System.out.printf("Gross salary: ");
		salFuncionario.grossSalary = sc.nextDouble();

		System.out.printf("Tax: ");
		salFuncionario.tax = sc.nextDouble();

		System.out.printf("Employee: " + salFuncionario.name + ", $ " + salFuncionario.NetSalary());

		System.out.println();
		System.out.printf("Which percentage to increase salary? ");
		salFuncionario.percentage = sc.nextDouble();

		System.out.println();
		System.out.printf("Update data: " + salFuncionario);

		sc.close();

	}

}
