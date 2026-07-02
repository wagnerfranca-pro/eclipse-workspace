import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		int mais_velho = idade[0];
		String maisVelho = null;

		for (int i = 0; i < idade.length; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			if (idade[i] > mais_velho) {
				mais_velho = idade[i];
				maisVelho = nome[i];
			}
		}
		System.out.printf("A pessoa mais velha: %s", maisVelho);
		sc.close();
	}
}
