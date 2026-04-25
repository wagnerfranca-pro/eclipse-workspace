package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ClientBank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		double accountNumber = sc.nextDouble();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.next();

		System.out.print("Is there na initial deposit (y/n)? ");
		String yesORnot = sc.next();
		
		ClientBank cb = new ClientBank(accountNumber, accountHolder);
		
		if (yesORnot.equalsIgnoreCase("y")) {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			System.out.println("Account data:");
			cb.addBalance(balance);
		} else {
			System.out.println("Account data:");
		}
		
		System.out.println(cb);
		
		System.out.print("Enter a deposit value: ");
		double balance = sc.nextDouble();
		cb.addBalance(balance);
		System.out.println("Updated account data: \n" + cb);
		
		System.out.print("Enter a withdraw value: ");
		balance = sc.nextDouble();
		cb.removeBalance(balance);
		System.out.println("Updated account data: \n" + cb);		
						
		sc.close();

	}

}
