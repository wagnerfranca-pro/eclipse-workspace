import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int dentro = 0;
		int fora = 0;

		for (int i = 0; i != n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				dentro += 1;
			} else {
				fora += 1;
			}
		}
		System.out.println(dentro + " in");
		System.out.println(fora + " out");
		sc.close();
	}

}
