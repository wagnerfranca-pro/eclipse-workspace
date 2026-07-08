import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		double[] nota_um = new double[n];
		double[] nota_dois = new double[n];
		double[] media = new double[n];
		String[] aprovado = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno:");
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota_um[i] = sc.nextDouble();
			nota_dois[i] = sc.nextDouble();
		}

		System.out.println("Alunos aprovados: ");

		for (int i = 0; i < n; i++) {
			media[i] = (nota_um[i] + nota_dois[i]) / 2;
			if (media[i] >= 6) {
				aprovado[i] = nome[i];
				System.out.println(aprovado[i]);
			}
		}
		
		sc.close();

	}

}
