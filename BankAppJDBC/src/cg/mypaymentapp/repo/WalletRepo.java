package cg.mypaymentapp.repo;

import cg.mypaymentapp.beans.Customer;

public interface WalletRepo {

public boolean save(Customer customer);
	
	public Customer findOne(String mobileNo);
}
