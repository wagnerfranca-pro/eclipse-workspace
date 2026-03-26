import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int divisores = 1;
		for (int i = n; i > 0; i--) {
			if (n % i == 0) {
				divisores = n / i;
				System.out.println(divisores);
			}
		}

		sc.close();

	}

}
