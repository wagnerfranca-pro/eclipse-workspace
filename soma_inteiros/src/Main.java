import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int a, b, r;
		
		System.out.println("Digite um primeiro inteiro: ");
		a = sc.nextInt();
		
		System.out.println("Digite um segundo inteiro: ");
		b = sc.nextInt();
		
		r = a + b;
		
		System.out.println("Soma eh " + r);
		
		sc.close();
	}

}
