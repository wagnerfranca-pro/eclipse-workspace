/*

|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal.

|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

Exemplo:
Enter rectangle width and height:
3.00
4.00
AREA = 12.00
PERIMETER = 14.00
DIAGONAL = 5.00

|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ApD_retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rectangle width and height:");

		ApD_retangulo apD_retangulo = new ApD_retangulo();
		apD_retangulo.width = sc.nextDouble();
		apD_retangulo.height = sc.nextDouble();
		
		System.out.println(apD_retangulo);
		
		
		sc.close();
	}

}
