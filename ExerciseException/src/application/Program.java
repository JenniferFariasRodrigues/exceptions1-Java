/* Programa para ler os dados de uma conta bancária e depois realizar um
saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta. Implemente a conta bancária conforme projeto abaixo:*/

package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data: ");

		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.println("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.println("Withdrawn limit: ");
		double withdrawnLimit = sc.nextDouble();

		Account acc = new Account(number, holder, balance, withdrawnLimit);
		System.out.println();
		System.out.println("Enter amount for withdrawn:");
		double amount = sc.nextDouble();
		try {
		
			
			acc.withDrawn(amount);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));

		} catch (DomainException e) {
			System.out.println("Withdrawn error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();
	}

}
