package com.cg.mra.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDAO;
import com.cg.mra.dao.AccountDAOImpl;
import com.cg.mra.exception.AccountException;

public class AccountServiceImpl implements AccountService{

	AccountDAO dao;
	public AccountServiceImpl(){
		dao = new AccountDAOImpl();
	}
	
	@Override
	public Account getAccountDetails(String mobileNo) {
		return dao.getAccountDetails(mobileNo);
	}

	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) {
		return dao.rechargeAccount(mobileNo, rechargeAmount);
	}

	@Override
	public boolean validatePhoneNo(String mobileNo) throws AccountException {
		if(mobileNo==null)
			throw new AccountException("Phone number can not be null");
		Pattern pat = Pattern.compile("[7-9]{1}[0-9]{9}");  //checking for valid phone numbe pattern i.e starting with 7-9 for India
		Matcher mat= pat.matcher(mobileNo);
		return mat.matches();
	}

	@Override
	public boolean validateRechargeAmt(double amount) throws AccountException {
		if(amount == 0)
			throw new AccountException("Recharge amount cannot be zero");
		Double amt = new Double(amount);
		String rAmt= amt.toString();
		return (rAmt.matches("\\d{0,6}(\\.\\d{1,2})?")); //only accepting recharge amount till 2 decimal places
	}

}
