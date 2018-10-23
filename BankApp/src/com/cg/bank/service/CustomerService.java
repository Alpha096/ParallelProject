package com.cg.bank.service;

import com.cg.bank.dto.Customer;

public interface CustomerService {

	int addCustomer(Customer cust);

	void deposit(int custId, double amt);

	double checkbal(int custid);

	void withdraw(int custId, double withdrawamt);

	void fundtrans(int custid1, int custid2, double transamt);

}
