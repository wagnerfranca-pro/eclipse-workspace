import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
			
		System.out.println("Digite os valores do vetor A: ");
		int[] vetA = new int[n];
		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = sc.nextInt();
		}
			
		System.out.println("Digite os valores do vetor B: ");
		int[] vetB = new int[n];
		for (int i = 0; i < vetB.length; i++) {
			vetB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		int[] vetC = new int[n];
		for (int i = 0; i < vetC.length; i++) {
			vetC[i] = vetA[i] + vetB[i];
			System.out.println(vetC[i]);		
		}
		
		sc.close();
	}

}
