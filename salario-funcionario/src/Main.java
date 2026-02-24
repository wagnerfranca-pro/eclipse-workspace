import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		double horas = sc.nextDouble();
		double vr_hora = sc.nextDouble();
		double sal;

		sal = horas*vr_hora;
		
		System.out.println("Number: " + num);
		
		System.out.printf("Salary: U$ %.2f", sal);		
		
		sc.close();
	}

}
