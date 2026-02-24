import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio;
		double area;
		
		System.out.println("Entre com o valor do raio do circulo: ");
		raio = sc.nextDouble();
		
		area = pi*raio*raio;
		
		System.out.printf("%.4f", area);
		
		sc.close();
	}

}
