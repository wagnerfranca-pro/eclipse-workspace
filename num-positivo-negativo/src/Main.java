import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Não negativo");
		}

		sc.close();

	}

}
