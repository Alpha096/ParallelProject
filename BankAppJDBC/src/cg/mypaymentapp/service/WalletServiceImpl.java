package cg.mypaymentapp.service;
import java.math.BigDecimal;
import cg.mypaymentapp.beans.Customer;
import cg.mypaymentapp.dao.CustomerDAO;
import cg.mypaymentapp.dao.CustomerDAOImpl;
import cg.mypaymentapp.exception.InvalidInputException;

public class WalletServiceImpl implements WalletService	{
	
	CustomerDAO dao;
	
	public  WalletServiceImpl() {
	
	dao= new CustomerDAOImpl();
	}
	
	@Override
	public Customer createAccount(String name, String mobileno,	BigDecimal balance) {
		return dao.createAccount(name, mobileno , balance);
	}

	@Override
	public Customer showBalance(String mobileno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo,
			BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer depositAmount(String mobileNo, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer withdrawAmount(String mobileNo, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
