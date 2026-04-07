/*

|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.

|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

Exemplo 1:

Entrada: 
Alex Green
27.00
31.00
32.00

Saída:
FINAL GRADE = 90.00
PASS

Exemplo 2:

Entrada: 
Alex Green
17.00
20.00
15.00

Saída:
FINAL GRADE = 52.00
FAILED
MISSING 8.00 POINTS

|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		student.name = sc.next();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.println(student.resultado());
		
		sc.close();
	}

}
