package numero_fatorial;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int fatorial = 1;

		if (n == 0) {
			System.out.println("1");
		} else {
			for (int i = 1; i <= n; i++) {
				fatorial = fatorial * i;
				
				/*
				 * ou também
				 * 
				 * fatorial *= i;
				 * 
				 * */
			}
			System.out.println(fatorial);
		}

		sc.close();

	}

}
