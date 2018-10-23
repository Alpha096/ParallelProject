package com.cg.bank.service;

import com.cg.bank.dao.CustomerDAO;
import com.cg.bank.dao.CustomerDAOImpl;
import com.cg.bank.dto.Customer;


public class CustomerServiceImpl implements CustomerService{
	
	CustomerDAO dao;
	
	public CustomerServiceImpl(){
		dao = new CustomerDAOImpl();
	}
	
	@Override
	public int addCustomer(Customer cust) {
		int id = dao.addCustomer(cust);
		return id;
	}
	
	@Override
	public void deposit(int custId, double amt) {
		dao.deposit(custId, amt);		
	}
	
	@Override
	public double checkbal(int custid) {
		double bal = dao.checkbal(custid);
		return bal;
	}
	
	@Override
	public void withdraw(int custId, double withdrawamt) {
		dao.withdraw(custId, withdrawamt);
	}

	@Override
	public void fundtrans(int custid1, int custid2, double transamt) {
		dao.fundtrans(custid1, custid2, transamt);
	}
}
