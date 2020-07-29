package pt.rumos.bank.administration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pt.rumos.bank.administration.model.BankAccount;
import pt.rumos.bank.administration.service.BankAccountService;

public class RumosADM {
	private static Integer accountId = 1;
	private Scanner scanner = new Scanner(System.in);
	private String input;
	
	public static List<BankAccount> accounts = new ArrayList<BankAccount>();
	
	private BankAccountService accountService = new BankAccountService();
	
	public void run() {
		System.out.println("Bem vindo a gestão de contas");
		System.out.println("Escolha a sua opção");
		System.out.println("1 - Criar conta");
		System.out.println("2 - Editar conta");
		System.out.println("3 - Exibir conta por nif");
		System.out.println("4 - Listar todas as contas");
		System.out.println("5 - Apagar conta");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			BankAccount bankAccount = accountService.createBankAccount();
			accounts.add(bankAccount);
			break;
		case 2:
			accountService.editBankAccount();
			break;
		case 3:
			System.out.println("Digite o nif do cliente a buscar");
			input = scanner.next();
			BankAccount printAccount = accountService.findByNif(input);
			break;
		case 4:
			System.out.println(accounts);
			break;
		case 5:
			System.out.println("Digite o nif do cliente a remover");
			input = scanner.next();
			BankAccount deleteAccount = accountService.findByNif(input);
			accounts.remove(deleteAccount);
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
	}
	
	public static Integer newId() {
		return RumosADM.accountId++;
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}

}
