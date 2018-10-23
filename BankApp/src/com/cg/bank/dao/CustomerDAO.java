package com.cg.bank.dao;

import com.cg.bank.dto.Customer;

public interface CustomerDAO {
	
	public int addCustomer(Customer customer);
	public void deposit(int custId, double amt);
	public void withdraw(int custId, double amt);
	public double checkbal(int custId);
	public void fundtrans(int custId1, int custId2, double amt);
}
