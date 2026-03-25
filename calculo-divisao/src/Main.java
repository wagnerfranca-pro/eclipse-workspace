import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double div = 0;

		for (int i = 0; i != n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			div = a / b;
			if (b == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println(div);
			}
		}
		sc.close();

	}

}
