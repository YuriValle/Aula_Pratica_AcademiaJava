package pt.rumos.bank.administration.service;

import pt.rumos.bank.administration.RumosADM;
import pt.rumos.bank.administration.model.BankAccount;
import pt.rumos.bank.administration.model.Customer;

public class BankAccountService {
	private CustomerService customerService = new CustomerService();

	public BankAccount createBankAccount() {
		Integer id = RumosADM.newId();
		BankAccount ba = new BankAccount();
		ba.setUniqueNumber(id);
		//pergunta se quer criar um novo, ou se quer adicionar um já existente;
		/*
		if(novo) {
		 criaNovo();
		} else {
			for (BankAccount bankAccount : RumosADM.accounts) {
			//verificar se é o owner
				 for (Customer existingCustomer : bankAccount.getNames()) {
					//verificar se é um dos titulares
				}
			}
		}
		*/
		Customer c = customerService.createCustomer();
		ba.setOwner(c);
		
		
		return ba;
	}

	public void editBankAccount() {
		//perguntar qual é a conta a ser editada
		//receber o numero da conta
		//editar a conta
			//if (account.getUniqueNumber().equals(1)) {
				//edita conta
				//pergunta qual é o customer e enviar para o edit Customer
				//Customer newOwner = customerService.editCustomer(account.getOwner());
				//account.setOwner(newOwner);
			//}
		}

	public BankAccount findByNif(String nif) {
		// foreach
		//quando encontrar o nif, retornar
		return null;
	}
	}
