package Application;

import java.util.Scanner;
import entities.Conta;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta cli = new Conta();
		char op;
		
		cli.mainShow();

		System.out.print("Enter account number: ");
		cli.setConta(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter account holder: ");
		cli.setTitular(sc.nextLine());
		
		System.out.print("Is there na initial deposit:  S/N ");
		op = sc.next().charAt(0);
		if (op == 'S' || op == 's') {
			System.out.print("Enter initial deposit value: ");
			cli.AddMoney(sc.nextDouble());
		}

		System.out.println(cli);

		System.out.print("Enter a deposit value: ");
		cli.AddMoney(sc.nextDouble());

		System.out.println(cli);

		System.out.print("Enter a widthdraw value: ");
		cli.RemMoney(sc.nextDouble());

		System.out.println(cli);

		sc.close();
	}

}
