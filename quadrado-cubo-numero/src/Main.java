import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				System.out.println(i + " " + i * i + " " + i * i * i);
			}
		}

		sc.close();

	}

}
