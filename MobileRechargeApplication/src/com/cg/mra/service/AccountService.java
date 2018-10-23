package com.cg.mra.service;
import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountException;

public interface AccountService {
	Account getAccountDetails(String mobileNo);
	double rechargeAccount(String mobileNo, double rechargeAmount);
	public boolean validatePhoneNo(String mobileNo) throws AccountException;
	public boolean validateRechargeAmt(double amount) throws AccountException;
	

}
