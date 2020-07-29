package pt.rumos.bank.administration.service;

import pt.rumos.bank.administration.RumosADM;
import pt.rumos.bank.administration.model.CreditCard;
import pt.rumos.bank.administration.model.Customer;

public class CustomerService {
	
	private CreditCardService ccs = new CreditCardService();

	public Customer createCustomer() {
		Customer c = new Customer();
		System.out.println("");
		CreditCard cc = ccs.createCreditCard();
		c.setNif("123");
		return c;
	}

	public Customer editCustomer(Customer customer) {
		//edit customer
		return null;
	}
	
	

}
