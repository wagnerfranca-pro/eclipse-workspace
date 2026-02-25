import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.printf("TRIANGULO %.3f", (a*c)/2);
		System.out.printf("%nCIRCULO %.3f", 3.14159*c*c);
		System.out.printf("%nTRAPEZIO %.3f", ((a+b)*c)/2);
		System.out.printf("%nQUADRADO %.3f", b*b);
		System.out.printf("%nRETANGULO %.3f", a*b);
						
		sc.close();

	}

}
